package com.alexanastasyev.spring.hibernate_one_to_one;

import com.alexanastasyev.spring.hibernate_one_to_one.entity.Detail;
import com.alexanastasyev.spring.hibernate_one_to_one.entity.Employee;
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

            session.beginTransaction();

//            Employee employee = new Employee("Peter", "Mikhailov", "HR", 400);
//            Detail details = new Detail("Ryazan", "54394312", "peter.thegreat@gmail.com");
//
//            details.setEmployee(employee);
//            employee.setDetails(details);
//
//            session.save(details);

//            Detail details = session.get(Detail.class, 3);
//            System.out.println(details.getEmployee());

            Detail details = session.get(Detail.class, 1);
            details.getEmployee().setDetails(null);
            session.delete(details);

            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}
