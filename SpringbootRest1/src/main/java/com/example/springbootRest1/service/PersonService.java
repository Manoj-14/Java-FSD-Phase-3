package com.example.springbootRest1.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springbootRest1.entity.Person;
import com.example.springbootRest1.repository.PersonRepository;
import com.example.springbootRest1.response.PersonResponse;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;

	RestTemplate restTemplate = new RestTemplate();

	public PersonResponse getPerson(int personId) {
		final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";

		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("personId", personId);

		String result = restTemplate.getForObject(uri, String.class, params);
		Person pe = personRepository.findById(personId).get();
		PersonResponse pr = new PersonResponse();
		pr.setPersonId(pe.getPersonId());
		pr.setName(pe.getName());
		pr.setAge(pe.getAge());
		pr.setHobby(result);

		return pr;
	}

	public void addPerson(Person pe) {
		personRepository.save(pe);
	}
}
