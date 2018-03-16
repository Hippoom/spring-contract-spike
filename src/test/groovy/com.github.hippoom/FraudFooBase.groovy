package com.github.hippoom

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import

@Import(TestConfiguration)
@WebMvcTest
abstract class FraudFooBase extends AbstractWebMvcTest {

    @Autowired
    protected Bar bar

    def setup() {
        bar.replay(_ as String) >> """
                {
                    "fraudCheckStatus": "FRAUD",
                    "rejectionReason": "Amount too high"
                }
            """
    }

}
