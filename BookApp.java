package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class BookApp {
	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn= factory.openSession();
		Transaction tx=ssn.beginTransaction();
		Book book=new Book();
		book.setBookid(123);
		book.setTitle("Oracle");
		book.setAuthor("aaaa");
		book.setPrice(200);
		
		JavaBook java=new JavaBook();
		java.setBookid(124);
		java.setTitle("Java Programming");
		java.setAuthor("James");
		java.setPrice(900);
		java.setDiscount(12);
		
		DotnetBook dotnet=new DotnetBook();
		dotnet.setBookid(125);
		dotnet.setTitle("Dotnet Complete");
		dotnet.setAuthor("Dot");
		dotnet.setPrice(345);
		dotnet.setCds(2);
		ssn.save(book);
		ssn.save(java);
		ssn.save(dotnet);
		tx.commit();
		ssn.close();
		
		
}
}