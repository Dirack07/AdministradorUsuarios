package com.rdbc.persistence;

import java.util.List;

import com.rdbc.model.Rol;

public interface RolDao {
	public void insert(Rol rol);
	public void update(Rol rol);
	public void delete(int idRol);
	public Rol getById(int idRol);
	public List<Rol> getListaRol();
}
