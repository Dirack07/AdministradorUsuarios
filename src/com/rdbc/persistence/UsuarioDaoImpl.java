package com.rdbc.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.rdbc.conexion.ConexionBD;
import com.rdbc.model.Usuario;

public class UsuarioDaoImpl extends ConexionBD implements UsuarioDao{

	Statement stm = null;
	String query = null;
	ResultSet rs = null;
	
	@Override
	public void insert(Usuario usuario) {
		// TODO Auto-generated method stub
		query = "insert into usuario(username, password, email, load_date)" + 
		"values ('" +usuario.getUsername() +"','"+ usuario.getPassword() + "','" + usuario.getEmail() + "',now())";
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
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		query = "update usuario set username = '" + usuario.getUsername() +"', email = '" + usuario.getEmail() +
				"', password = '" + usuario.getPassword() + "' where id usuario = " + usuario.getIdUsuario() + ";" ;
	}

	@Override
	public void delete(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(int idUusario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> getListaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
