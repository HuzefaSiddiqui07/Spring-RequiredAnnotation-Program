package com.springframework.requiredannotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

/* @Required Annotation : 
	   It is used to set the particular property of class called as @Required annotation.
                  This is the method level annotation.
       Why?
   If there are 5 setter dependency in class and I want to make only one setter base injection mandatory at time. 
   Simple dependency checking not worked, to overcome above problem we should go for @Required annotation.

Program for using @Required annotation. */

public class Drivers {

	// Declare

	private String driver;
	private String url;
	private String username;
	private String password;

	// Use Setter Method

	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Create Method
	public void printCon() throws ClassNotFoundException, SQLException {

		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);

	}

}
