package com.naresh.demomav;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien o=new Alien();
       o.setAid(106);
       o.setAname("naresh1");
       o.setColor("Green1");
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
       Session s=sf.openSession();
       Transaction tx=s.beginTransaction();
       s.save(o);
       tx.commit();
       
    }
}
