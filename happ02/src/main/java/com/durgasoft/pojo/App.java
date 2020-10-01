package com.durgasoft.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws Exception {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = new Employee();
		e.setEno(444);
		e.setEname("EEE");
		e.setEsal(8000);
		e.setEaddr("OGL");
		//int eno = (Integer)s.save(e);
		s.update(e);
		tx.commit();
		System.out.println("Updated successfully!!");
		/* if(eno == 333) {
			System.out.println("Element inserted successfully!!");
		}
		else {
			System.out.println("Inserted Element Failed!!");
		}
		*/
		s.close();
		sf.close();

	}

}
