package com.rdbc.model;

import java.util.Date;

public class Rol {

	private int idRol;
	private String rol;
	private String description;
	private Date loadDate;
	
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getLoadDate() {
		return loadDate;
	}
	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}
	
}
