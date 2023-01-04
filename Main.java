package com.springframework.requiredannotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Drivers drivers = (Drivers) applicationContext.getBean("d");

		drivers.printCon(); // Call Method by Object

	}

}
