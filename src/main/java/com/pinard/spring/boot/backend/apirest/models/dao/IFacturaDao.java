package com.pinard.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pinard.spring.boot.backend.apirest.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
