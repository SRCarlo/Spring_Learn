package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp2EmployeeAddrApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootApp2EmployeeAddrApplication.class, args);
		Employee emp = (Employee) ac.getBean("emp");
		System.out.println(emp);

	}

}
 