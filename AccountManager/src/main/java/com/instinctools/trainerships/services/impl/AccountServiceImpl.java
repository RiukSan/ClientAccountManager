package com.instinctools.trainerships.services.impl;

import org.springframework.stereotype.Service;

import com.instinctools.trainerships.dao.BasicDao;
import com.instinctools.trainerships.dao.impl.AccountDao;
import com.instinctools.trainerships.model.Account;
import com.instinctools.trainerships.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	BasicDao<Account> accountDao = new AccountDao();

	public AccountServiceImpl() {
	}

	public Account update(Integer id, String name) {
		return accountDao.update(id, name);
	}

	public Account create(Integer userId, String name) {
		return accountDao.create(userId, name);
	}

	public void delete(Integer id) {
		accountDao.delete(id);
	}

}
