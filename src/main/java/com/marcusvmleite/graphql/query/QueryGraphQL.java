package com.marcusvmleite.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL!";
    }

    public int add(int a, int b) {
        return a + b;
    }

}
