package com.example.graphqlserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(MainController.class)
public class MainControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

    @Test
    void shouldSayHello() {
        this.graphQlTester
				.documentName("hello")
				.variable("name", "test")
                .execute()
                .path("hello")
                .entity(String.class)
                .isEqualTo(String.format("Hello %s", "test"));
    }
}
