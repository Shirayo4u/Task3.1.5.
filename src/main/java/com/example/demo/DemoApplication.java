package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo.config.Config;
import com.example.demo.consumer.ConsumerWeb;
import com.example.demo.model.User;

public class DemoApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		ConsumerWeb consumerWeb = context.getBean("consumerWeb", ConsumerWeb.class);
		consumerWeb.getAllUsers();
		consumerWeb.createUser(new User(3L   , "James", "Brown", (byte) 40));
		consumerWeb.editUser(new User(3L, "Thomas", "Shelby", (byte) 30));
		consumerWeb.deleteUser(3L);
		System.out.println(ConsumerWeb.result);
	}
}
