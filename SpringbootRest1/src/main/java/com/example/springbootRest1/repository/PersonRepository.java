package com.example.springbootRest1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootRest1.entity.Person;

public interface PersonRepository extends CrudRepository<Person,Integer> {

}
