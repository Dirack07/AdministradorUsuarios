package com.rdbc.main;

import java.sql.Connection;
import java.util.Scanner;

import com.rdbc.conexion.ConexionBD;

public class AdministradorUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int opcion;
		
		opcion = 0;

		while (opcion != 4) {
			
			menuPrincipal();
			
			opcion = sc.nextInt();
			switch (opcion) {

			case 0:
				System.out.println("Establecer conexion");
				Connection conexion = ConexionBD.getConnection();
				if(null== conexion){
					System.out.println("Error");
				}else{
					System.out.println("Exito");
				}
				
				break;
			case 1:
				System.out.println("Modificar Tabla rol");

				break;

			case 2:
				System.out.println("Modificar Tabla usuario");
				break;

			case 3:
				System.out.println("Modifica tabla usuario_rol");
				break;

			default:
				System.out.println("estas patineto!!!!!!!!!!!");
				break;
			}
		}
		sc.close();
	}
	public static void menuPrincipal(){

		System.out.println("Menu");
		System.out.println("0. Establecer conexion");
		System.out.println("1. Tabla rol");
		System.out.println("2. Tabla usuario");
		System.out.println("3. Tabla usuario_rol");
		System.out.println("4. Salir");
	}
}
