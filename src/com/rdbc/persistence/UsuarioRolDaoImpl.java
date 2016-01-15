package com.rdbc.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rdbc.conexion.ConexionBD;
import com.rdbc.model.UsuarioRol;

public class UsuarioRolDaoImpl extends ConexionBD implements UsuarioRolDao {
	
	Statement stm = null;
	String query = null;
	ResultSet rs = null;
	
	@Override
	public void insert(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		query = "insert in to usuario_rol(id_usuario, id_rol, load_date)" + 
		"values(" + usuarioRol.getIdUsuario() + "," + usuarioRol.getIdRol() + ", now())"; 
		System.out.println(query);
		try {
			stm = getConnection().createStatement();
			stm.execute(query);
			closeConnetion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(UsuarioRol usuarioRol) {
		// TODO Auto-generated method stub
		query = "update usuario_rol set id_usuario = " + usuarioRol.getIdUsuario() + "where id_rol;
		System.out.println(query);
		
		try {
			stm = getConnection().createStatement();
			stm.execute(query);
			closeConnetion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int idUsuarioRol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int idUsuarioRol) {
		// TODO Auto-generated method stub
		
	}
	
	

}
