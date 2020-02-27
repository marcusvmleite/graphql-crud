package com.marcusvmleite.graphql.repository;

import com.marcusvmleite.graphql.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
