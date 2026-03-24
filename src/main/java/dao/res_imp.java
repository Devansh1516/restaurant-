package dao;

import java.util.ArrayList;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import hiber.input;
@Repository
public class res_imp implements res_dao {
	
	private static final SessionFactory factory=new Configuration()
			.configure("xml/hibernate.cfg.xml")
			.buildSessionFactory();

	@Override
	public void save(input obj) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
	    session.save(obj);
	    tx.commit();
	    session.close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<input> getAllInputs() {
		Session session=factory.openSession();
		List<input> list=session
				.createQuery("from input",input.class)
				.getResultList();
		session.close();
		
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public input getInputById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateinput(input obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteinput(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<input> findbynumber(int numb) {
		List<input> list = new ArrayList<>();
		try {
			Session session =new Configuration()
			.configure("xml/hibernate.cfg.xml")
			.buildSessionFactory()
			.openSession();
			List<input> result= session
					.createQuery("From input where number=:num",input.class)
					.setParameter("num",numb)
					.getResultList();
			list.addAll(result);
			session.close();
			
			
		}
		catch(Exception e){
		 System.out.println(e);
		}
	
		return list;
	}

}
