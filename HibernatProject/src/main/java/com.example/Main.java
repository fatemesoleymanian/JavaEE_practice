package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


    public class Main {
        public static void main(String[] args) {
            System.out.println();
//        Student student = new Student();
//        student.setId(3);
//        student.setName("Ali");
//        student.setTech("War");

//        Configuration config = new Configuration();
//
//        config.addAnnotatedClass(com.example.Student.class);
//        config.configure();

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.example.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();

        /**                 UPDATE  */
//        session.merge(student); // update or create

        /**             CREATE */
//        session.persist(student);

        /**               GET */
        Student student = session.find(Student.class,2);//eager loading
//        Student student = session.byId(Student.class).load(1);or
       // Student student = session.byId(Student.class).getReference(1);//lazy loading
        System.out.println(student);

        /**                 DELETE*/
//        Student selectedStudent = session.find(Student.class,3);
//        session.remove(selectedStudent);

//        transaction.commit();

        session.close();
        factory.close();
    }
}