package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Chattogram!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Engineers engineers= new Engineers();
        engineers.setId(700);
        engineers.setName("Shamim Sarkar");
        engineers.setAddress("Badda, Dhaka");

        System.out.println(engineers);


        //session and inserting data
        Session session = factory.openSession();
        Transaction trx = session.beginTransaction();
        session.save(engineers);
        trx.commit();
        session.close();
    }
}
