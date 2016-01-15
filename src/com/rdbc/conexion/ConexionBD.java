package com.rdbc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionBD {

	@SuppressWarnings("finally")
	public static Connection getConnection() {
		Connection conexion = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String servidor = "jdbc:mysql://localhost/bdprueba";
			String usuarioDB = "root";
			String passwordDB = "aspire00";
			conexion = DriverManager.getConnection(servidor, usuarioDB,
					passwordDB);
		} catch (ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, ex,
					"Error1 en la Conexión con la BD " + ex.getMessage(),
					JOptionPane.ERROR_MESSAGE);
			conexion = null;
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex,
					"Error2 en la Conexión con la BD " + ex.getMessage(),
					JOptionPane.ERROR_MESSAGE);
			conexion = null;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex,
					"Error3 en la Conexión con la BD " + ex.getMessage(),
					JOptionPane.ERROR_MESSAGE);
			conexion = null;
		} finally {
			return conexion;
	  }

	}

	public static void closeConnetion() {
		try {
			if (getConnection() != null) {
				getConnection().close();
				System.out.println("Conexion de la base de datos cerrada");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
