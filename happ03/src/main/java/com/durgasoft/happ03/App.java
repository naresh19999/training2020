package com.durgasoft.happ03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {  
    	Configuration con = null;
    	SessionFactory sf = null;
    	 Session s = null;
    	 Transaction tx = null;
    	try 
    	{
          con = new Configuration().configure(); 
          sf = con.buildSessionFactory();
          s = sf.openSession();
          tx = s.beginTransaction();
          Employee e = new Employee();
          e.setEno(111);
          e.setEname("AAA");
          e.setEsal(7000);
          e.setEaddr("Vjy");
          s.delete(e);           // s.saveOrUpdate(e);
          tx.commit();
          System.out.println("Deletion Success!!");
    	}
    	catch(Exception e) {
    		tx.rollback();
    		e.printStackTrace();
    		System.out.println("Fail");
    	}
    	finally{
    		s.close();
    		sf.close();
    	}
    		
    		
    }
}
