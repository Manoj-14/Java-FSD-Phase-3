package com.example.springbootRest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootRest1.entity.Hobby;
import com.example.springbootRest1.repository.HobbyRepository;

@Service
public class HobbyService {
    @Autowired
    HobbyRepository hobbyRepository;
    
    public String findByPersonId(int personid){
        return hobbyRepository.findByPersonId(personid);
    }   
    public void addHobby(Hobby he){
        hobbyRepository.save(he);
    }

}
