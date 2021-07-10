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

            List<Employee> employees = session.createQuery("FROM Employee WHERE name LIKE 'A%' AND salary > 70000")
                .getResultList();

            for (Employee employee : employees) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
