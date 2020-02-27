package com.marcusvmleite.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.marcusvmleite.graphql.model.Person;
import com.marcusvmleite.graphql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    private PersonRepository personRepository;

    @Autowired
    public QueryGraphQL(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public String hello() {
        return "Hello GraphQL!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public Person person(Integer id) {
        return personRepository.findById(id.longValue()).orElse(null);
    }

    public List<Person> people() {
        return personRepository.findAll();
    }

}
