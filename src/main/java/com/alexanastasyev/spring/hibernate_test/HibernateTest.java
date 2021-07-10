package com.alexanastasyev.spring.hibernate_test;

import com.alexanastasyev.spring.hibernate_test.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Elena", "Ivanova", "HR", 40000);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();

            int employeeId = employee.getId();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employeeFromDb = session.get(Employee.class, employeeId);
            session.getTransaction().commit();
            System.out.println(employeeFromDb);
        } finally {
            factory.close();
        }
    }
}
