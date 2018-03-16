package com.github.hippoom;

import org.springframework.stereotype.Component;

@Component
public class Bar {
    public String replay(String req) {
        return "{\"a\":\"b\"}";
    }
}
