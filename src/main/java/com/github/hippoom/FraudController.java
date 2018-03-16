package com.github.hippoom;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RequiredArgsConstructor
@RestController
public class FraudController {

    @NonNull
    private final Bar bar;

    @PutMapping(path = "/fraudcheck", produces = APPLICATION_JSON_UTF8_VALUE)
    public String handle(@RequestBody String req) {
        return bar.replay(req);
    }

}
