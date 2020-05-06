package com.durgasoft.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = null;
        SessionFactory sf = null;
        Session s = null;
        try {
        	con = new Configuration();
        	con.configure();
        	sf = con.buildSessionFactory();
        	s = sf.openSession();
        	Employee emp = (Employee)s.get(Employee.class,111);   //load
        	if(emp == null) {
        		System.out.println("Details not Exists!!");
        	}
        	else {
        		System.out.println("Employee Details..!");
        		System.out.println("............................");
        		System.out.println("Employee No.    : "+emp.getEno());
        		System.out.println("Employee Name   : "+emp.getEname());
        		System.out.println("Employee Salary : "+emp.getEsal());
        		System.out.println("Employee Address: "+emp.getEaddr());
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	s.close();
        	sf.close();
        }
    }
}
