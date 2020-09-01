package com.pinard.spring.boot.backend.apirest.models.services;

import com.pinard.spring.boot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
