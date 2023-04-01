package com.example.OSLSpringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //to register as component
public class BookControlller {
	
	@GetMapping("/books")
	public List<Book> listBooks(){
		return Arrays.asList(new Book(1,"Book1","Author1"));
	}
}
