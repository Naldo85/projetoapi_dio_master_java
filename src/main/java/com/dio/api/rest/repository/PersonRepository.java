package com.dio.api.rest.repository;

import com.dio.api.rest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
