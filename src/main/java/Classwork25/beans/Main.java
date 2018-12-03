package Classwork25.beans;

import Classwork25.HibernateUtils;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Test");
        student.setAge(16);

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();

    }


}
