package com.property.assignment;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	public void display() {
		
		System.out.println(username +" "+ password +" "+ url+ " "+ driver +" ");
		
		}
	
	public void getJdbcConnection() throws Exception{
		
		
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("JDBC Connection Successfull....!!!" + con);
	}

}
