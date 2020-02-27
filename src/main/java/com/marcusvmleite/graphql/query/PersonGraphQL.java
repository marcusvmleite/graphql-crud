package com.marcusvmleite.graphql.query;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.marcusvmleite.graphql.model.Person;
import com.marcusvmleite.graphql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Component
@Transactional
public class PersonGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private PersonRepository personRepository;

    @Autowired
    public PersonGraphQL(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person person(Integer id) {
        return personRepository.findById(id.longValue()).orElse(null);
    }

    public List<Person> people() {
        return personRepository.findAll();
    }

    public Person savePerson(Long id, String name, String email) {
        Person person;
        if (Objects.nonNull(id)) {
            person = personRepository.findById(id).orElseThrow(() ->
                    new IllegalArgumentException("Person not found with provided ID [" + id + "]."));
            person.setName(name);
            person.setEmail(email);
        } else {
            person = Person.builder().name(name).email(email).active(Boolean.TRUE).build();
        }
        personRepository.save(person);
        return person;
    }

}
