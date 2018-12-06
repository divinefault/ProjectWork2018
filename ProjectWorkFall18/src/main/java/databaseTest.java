import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryRegistry;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import java.sql.DriverManager;

public class databaseTest {

    public static void main(String[] args) {

//        Book book1 = new Book();
//        book1.setBookID(1000);
//        book1.setAuthor("author name");
//        book1.setPages(300);
//        book1.setTitle("book name");
String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
String user = "root";
String pass = "Love2all?";

try{
    System.out.println("Connecting to database: " + jdbcUrl);
    DriverManager.getConnection(jdbcUrl, user,pass);
    System.out.println("Connection successful");
}
catch (Exception f){
    f.printStackTrace();
}

//        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

//        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Book.class).buildSessionFactory();
//
//        Session session =  sessionFactory.openSession();
//
//        Transaction add = session.beginTransaction();
//
//        session.save();
//
//        add.commit();
//
//        session.close();

    }
}
