package com.example.springbootRest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springbootRest1.entity.Hobby;
@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer> {

	@Query("SELECT h.name FROM Hobby h WHERE h.personId=:personId")
	public String findByPersonId(Integer personId);

}
