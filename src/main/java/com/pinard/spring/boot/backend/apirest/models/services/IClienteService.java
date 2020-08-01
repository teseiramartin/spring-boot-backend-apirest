package com.pinard.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pinard.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> FindAll();
	
	public Page<Cliente> FindAll(Pageable pageable);
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
