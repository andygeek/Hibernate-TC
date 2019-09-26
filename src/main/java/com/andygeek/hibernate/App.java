package com.andygeek.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.andygeek.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        //Ahora si se insertara un teacher
        Teacher teacher = new Teacher("Andy","avatar");
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();
        
    }
}
