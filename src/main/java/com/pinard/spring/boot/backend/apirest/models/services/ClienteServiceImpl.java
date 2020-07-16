package com.pinard.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pinard.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.pinard.spring.boot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteDao clienteDao;
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> FindAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

}
