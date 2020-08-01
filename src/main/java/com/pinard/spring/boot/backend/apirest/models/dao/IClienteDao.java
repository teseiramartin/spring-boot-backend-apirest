package com.pinard.spring.boot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinard.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
