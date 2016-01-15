package com.rdbc.model;

import java.util.Date;

public class UsuarioRol {
	private int idUsuarioRol;
	private String idUsuario;
	private String idRol;
	private Date loadDate;
	public int getIdUsuarioRol() {
		return idUsuarioRol;
	}
	public void setIdUsuarioRol(int idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	public Date getLoadDate() {
		return loadDate;
	}
	public void setLoadDate(Date loadDate) {
		this.loadDate = loadDate;
	}
	
	}
