package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public  class ConectorDB {
	
	private Connection conexion;
	private static final String Driver = "com.mysql.cj.jdbc.Driver"; //version 8.0.27
	private static final String NombreDB = "agenda";
	private static final String url = "jdbc:mysql://localhost:3306/"+NombreDB;
	private static final String user = "root";
	private static final String PassWord = "";
	Statement sttt;
	
	
	//constructor
	public
	ConectorDB(){
		conexion = null;
		try {
			Class.forName(Driver);
			conexion = DriverManager.getConnection(url,user,PassWord);
			if(conexion != null) {
				System.out.print("Conexion establecida con exito...\n");
				sttt = (Statement) conexion.createStatement();
			}
			
		}
		catch (ClassNotFoundException  e) {
			System.out.print("Error al conectar con la base de datos...\n"+e);
		}
		catch (SQLException e) {
			System.out.print("Error SQL...\n"+e);
		}
	}
	
	//para guardar
	public void guardar(String matricula, String nombre, String carrera) {
		try {
			 sttt.executeUpdate("insert into persona values ('"+matricula+"','"+nombre+"','"+carrera+"')");
			 System.out.println("guardando ...");
		} catch (SQLException e) {
			System.out.println("Error al guardar...\n"+e);;
		}
	}
	
	//para borrar 
	public void borrar(String matricula) {
		try {
			 sttt.executeUpdate("delete from persona where matricula = '"+matricula+"'");
			 System.out.println("\nborrando ...");
			 
		} catch (SQLException e) {
			System.out.println("Error al guardar...\n"+e);;
		}
	}
	
	//para buscar 
		public String buscar(String matricula) {
			try {
				 ResultSet rs =  sttt.executeQuery("select matricula, nombre, carrera from persona where matricula = '"+matricula+"'");
				 while(rs.next()) {
					 return ""+rs.getString("matricula")+", "+rs.getString("nombre")+", "+rs.getString("carrera");
				 }
				 System.out.println("actualizando...\n");
				 
			} catch (SQLException e) {
				System.out.print("Error al buscar ...\n"+e);
			}
			return null;
		}
	
	//crear tabla 
		public DefaultTableModel getMostrarTabla() {
			String [] nombreColumn = {"matricula","nombre","carrera"};
			String [] registros = new String[3];
			DefaultTableModel modelo = new DefaultTableModel(null,nombreColumn);
			String sql = "select * from persona";
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			try {
				pst = conexion.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next()) {
					registros[0] = rs.getString("matricula");
					registros[1] = rs.getString("nombre");
					registros[2] = rs.getString("carrera");
					modelo.addRow(registros);
				}
			}
			catch (SQLException e) {
				System.out.print("Error...\n"+e);
			}
			return modelo;
		}
		
	//para retornar solo la conexion 
		public Connection getconection() {
			return conexion;
		}
		
	//para desconectar 
	public void desconectar() {
		conexion = null;// .close(); para desconectar 
		if(conexion == null) {System.out.print("Desconectado con exito...\n");}
	}
	
}