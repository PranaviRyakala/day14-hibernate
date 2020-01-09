package hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployeeApp {
public static void main(String[] args) {
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	Session ssn= factory.openSession();
	Transaction tx=ssn.beginTransaction();
	Employee emp=new Employee();
	emp.setEmpcode(125);
	emp.setEmpname("Pranavi");
	emp.setSalary(12345);
	
	ssn.save(emp);


	tx.commit();
	ssn.close();
}
}
