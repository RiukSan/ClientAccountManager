package com.instinctools.trainerships.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.instinctools.trainerships.HibernateUtil;
import com.instinctools.trainerships.dao.BasicDao;
import com.instinctools.trainerships.model.Account;
import com.instinctools.trainerships.model.Client;

@Repository
public class AccountDao implements BasicDao<Account> {

	private Session session;

	@Override
	public Account create(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account read(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account create(Integer userId, String name) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Client client = session.load(Client.class, userId);
		Account acc = new Account();
		acc.setName(name);
		client.addAccount(acc);
		session.save(client);
		transaction.commit();
		return acc;
	}

	@Override
	public Account update(Integer id, String name) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Account acc = session.load(Account.class, id);
		acc.setName(name);
		session.saveOrUpdate(acc);
		transaction.commit();
		return acc;
	}

	@Override
	public void delete(int id) {
		session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Account acc = session.load(Account.class, id);
		session.delete(acc);
		transaction.commit();
	}

}
