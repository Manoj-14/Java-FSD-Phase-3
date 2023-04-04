package com.example.springbootRest1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootRest1.entity.Person;
import com.example.springbootRest1.response.PersonResponse;
import com.example.springbootRest1.service.PersonService;

@RestController
@RequestMapping(path = "/webapione")
public class PersonController {

	@Autowired
	PersonService personService;

	@RequestMapping("/person/{personId}")
	public PersonResponse getPerson(@PathVariable int personId) {
		return personService.getPerson(personId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/person")
	public void addPerson(@RequestBody Person pe) {
		personService.addPerson(pe);
	}
}
