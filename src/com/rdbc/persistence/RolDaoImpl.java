package com.rdbc.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rdbc.conexion.ConexionBD;
import com.rdbc.model.Rol;

public class RolDaoImpl extends ConexionBD implements RolDao {

	Statement stm = null;
	ResultSet rs = null;
	String query = null;

	@Override
	public void insert(Rol rol) {
		// TODO Auto-generated method stub
		query = "insert into rol(rol, descripcion, load_date)" + "values('"
				+ rol.getRol() + "', '" + rol.getDescription() + "', now())";

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
	public void update(Rol rol) {
		// TODO Auto-gLenguaje C Básico generated method stub
		query = "update rol set description = '" + rol.getDescription() + "', rol = '" + rol.getRol()
				+ "' where id_rol = " + rol.getIdRol() + ";" ;
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
	public void delete(int idRol) {
		// TODO Auto-generated method stub
		query = "delete from rol where id_rol = " + idRol;

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
	public Rol getById(int idRol) {
		// TODO Auto-generated method stub
		Rol rol = new Rol();
		query = "select * from rol where id_rol = " + idRol;

		try {
			stm = getConnection().createStatement();
			rs = stm.executeQuery(query);
			if (rs.next()) {
				rol.setIdRol(rs.getInt("id_rol"));
				rol.setRol(rs.getString("rol"));
				rol.setDescription(rs.getString("description"));
				rol.setLoadDate(rs.getDate("load_date"));
			}
			closeConnetion();
			return rol;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Rol> getListaRol() {
		// TODO Auto-generated method stub
		List<Rol> lista= new ArrayList<Rol>();
		
		query = "select * from Rol";

		try {
			stm = getConnection().createStatement();
			rs = stm.executeQuery(query);
			while (rs.next()) {
				Rol rol = new Rol();
				rol.setIdRol(rs.getInt("id_usuario"));
				rol.setRol(rs.getString("rol"));
				rol.setDescription(rs.getString("description"));
				rol.setLoadDate(rs.getDate("load_date"));
				lista.add(rol);
			}
			closeConnetion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return lista;

	}
}
