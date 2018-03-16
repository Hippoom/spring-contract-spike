package com.github.hippoom

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import spock.mock.DetachedMockFactory

@Configuration
class TestConfiguration {

    private DetachedMockFactory factory = new DetachedMockFactory()

    @Bean
    Bar bar() {
        factory.Mock(Bar, name:"bar")
    }
}
