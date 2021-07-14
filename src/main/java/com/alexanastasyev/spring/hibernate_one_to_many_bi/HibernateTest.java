package com.alexanastasyev.spring.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Department department = new Department("IT", 300, 5000);
//
//            Employee employee1 = new Employee("Alexey", "Anastasyev", 1000);
//            department.addEmployee(employee1);
//
//            Employee employee2 = new Employee("Alexander", "Morozov", 900);
//            department.addEmployee(employee2);

            session = factory.getCurrentSession();
            session.beginTransaction();

//            session.save(department);

            Department department = session.get(Department.class, 3);
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
