package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp1HelloApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootApp1HelloApplication.class, args);
		Greet gbean = (Greet) ac.getBean("gbean");
		System.out.println(" " + gbean.Hello("Naoe"));

		System.out.println("---------------------------------------------------------------------------\n");
		int count = ac.getBeanDefinitionCount();
		System.out.println("\n Bean Counts are :  " + count);
		System.out.println("---------------------------------------------------------------------------\n");

		System.out.println("Beans Names are : ");
		String bnames[] = ac.getBeanDefinitionNames();
		for (int i = 0; i < bnames.length; i++) {
			System.out.println(" " + bnames[i]);
		}

	}

}
