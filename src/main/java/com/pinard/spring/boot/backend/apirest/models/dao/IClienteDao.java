package com.pinard.spring.boot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pinard.spring.boot.backend.apirest.models.entity.Cliente;

import com.pinard.spring.boot.backend.apirest.models.entity.Region;

import java.util.*;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

	@Query("from Region")
	public List<Region> findAllRegiones();
}
