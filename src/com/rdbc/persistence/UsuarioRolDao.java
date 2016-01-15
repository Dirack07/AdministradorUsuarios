package com.rdbc.persistence;

import com.rdbc.model.UsuarioRol;

public interface UsuarioRolDao {
	public void insert(UsuarioRol usuarioRol);
	public void update(UsuarioRol usuarioRol);
	public void delete(int idUsuarioRol);
	public void get(int idUsuarioRol);
}
