package com.alexanastasyev.spring.hibernate_test;

import com.alexanastasyev.spring.hibernate_test.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 0);
            employee.setSalary(200_000);

            session.createQuery("UPDATE Employee SET salary = 55000 WHERE name = 'Elena'").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
