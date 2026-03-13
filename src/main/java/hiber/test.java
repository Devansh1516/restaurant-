package hiber;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
public static void main(String[] args) {
 Configuration conf=new Configuration();
 conf.configure("xml/hibernate.cfg.xml");
 org.hibernate.SessionFactory fac=conf.buildSessionFactory();
 Session session=fac.openSession();
 Transaction tx=null;
 System.out.println("hibernate is working ");
 try{
	 tx=session.beginTransaction();
	 input ip=new input();
	 ip.setName("devansh");
	 ip.setNumber(1234567890);
	 ip.setPeople(4);
	 ip.setResevation(LocalDate.of(2026, 3, 5));
	 ip.setTi(LocalTime.of(18, 0));
	 session.save(ip);
	 tx.commit();
	 System.out.println("data intered");
	 
	 
 }
 catch(Exception e){
		System.out.println(e);

}
}
}
