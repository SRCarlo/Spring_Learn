package com;

import org.springframework.stereotype.Service;

@Service("gbean")
public class Greet {

	public String Hello(String name) {
		return "Welcome ," + name + " Now are in Spring Boot...!";
	}

}
