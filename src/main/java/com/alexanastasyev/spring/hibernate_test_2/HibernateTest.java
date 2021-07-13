package com.alexanastasyev.spring.hibernate_test_2;

import com.alexanastasyev.spring.hibernate_test_2.entity.Detail;
import com.alexanastasyev.spring.hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Alexey", "Anastasyev", "IT", 1000);
//            Detail details = new Detail("Ryazan", "123456789", "alex.anastasyev@mail.ru");
//            employee.setDetails(details);

//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail details = new Detail("Moscow", "987654321", "olegatorv@gmail.com");
//            employee.setDetails(details);

            session.beginTransaction();

//            session.save(employee);
//
            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee + " " + employee.getDetails());

//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
