package com.instinctools.trainerships.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.instinctools.trainerships.dao.BasicDao;
import com.instinctools.trainerships.dao.impl.ClientDao;
import com.instinctools.trainerships.model.Client;
import com.instinctools.trainerships.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	BasicDao<Client> clientDao = new ClientDao();

	public ClientServiceImpl() {
	}

	public Client create(String name) {
		return clientDao.create(name);
	}

	public void delete(int id) {
		clientDao.delete(id);
	}

	public Client get(int id) {
		return clientDao.read(id);
	}

	public List<Client> getAllUsers() {
		return clientDao.readAll();
	}

}
