package com.rdbc.persistence;

import java.util.List;

import com.rdbc.model.Usuario;

public interface UsuarioDao {
	public void insert(Usuario usuario);
	public void update(Usuario usuario);
	public void delete(int idUsuario);
	public void get(int idUusario);
	public List<Usuario> getListaUsuario();

}
