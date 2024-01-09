package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


public class App
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello Chattogram!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Engineers engineers= new Engineers();
        engineers.setId(708);
        engineers.setName("Tanvir");
        engineers.setAddress("Uttor Kafrul, Dhaka");


        Address address = new Address();
        address.setStreet("Askar digi paar");
        address.setCity("Chattogram ");
        address.setAddedDate(new Date());
        address.setX(12.25);

        FileInputStream fis =  new FileInputStream("src/main/java/mushi.jpg");
        byte[] data =  new byte[fis.available()];
        fis.read(data);
        address.setImage(data);


        //session and inserting data
        Session session = factory.openSession();
        Transaction trx = session.beginTransaction();
        session.persist(engineers);
        session.save(address);
        trx.commit();
        session.close();
    }
}
