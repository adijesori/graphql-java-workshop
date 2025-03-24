package com.example.graphqlserver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @QueryMapping
    public String hello(@Argument String name) {
        return "Hello " + name;
    }
}