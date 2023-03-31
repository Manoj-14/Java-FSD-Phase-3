package com.examples.S08SpringMVCORM.exception;

public class UserAlreadyExistsException extends Exception {
	public UserAlreadyExistsException(String email) {
		super(email + " user already exists");
	}
}
