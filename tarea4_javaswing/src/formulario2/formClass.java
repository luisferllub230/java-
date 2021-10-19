package formulario2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class formClass {
	
	JFrame form2;
	JPanel datosClientes;
	JPanel tablapanel;
	JLabel labelTitulo;
	JPanel botones;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JTable tabla1;
	Color gris = new Color(205,205,205);
	
	@SuppressWarnings("static-access")
	public void form2() {
		form2 = new JFrame();
		form2.setTitle("formulario cliente");
		form2.setSize(500, 500);
		form2.setLayout(null);
		form2.setLocationRelativeTo(null);
		form2.setVisible(true);
		form2.setDefaultCloseOperation(form2.EXIT_ON_CLOSE);
		form2.add(labelTitulo);
		form2.add(datosClientes);
		form2.add(botones);
		form2.add(tablapanel);
	}
	
	public void titulo() {
		//-----------------titulo
		labelTitulo = new JLabel("Formulario de Cliente");
		labelTitulo.setFont(new Font("arial",Font.CENTER_BASELINE,24));
		labelTitulo.setBounds(100, 50, 400, 25);
	}
	
	public void body() {
		//-----------------datoscliente
				datosClientes = new JPanel();
				datosClientes.setLayout(null);
				TitledBorder titulo = BorderFactory.createTitledBorder("Datos Cliente");
				titulo.setBorder(BorderFactory.createLineBorder(gris));
				titulo.setTitleJustification(TitledBorder.LEFT);
				datosClientes.setBorder(titulo);
				datosClientes.setBounds(20, 100, 450, 100);
				//ID
				JLabel labelId = new JLabel("ID: ");
				labelId.setBounds(20, 30, 20, 10);
				datosClientes.add(labelId);
				//descripcion 
				JLabel labeDescripcion  = new JLabel("descripcion:");
				labeDescripcion.setBounds(80, 30, 70, 10);
				datosClientes.add(labeDescripcion);
				//direccion 
				JLabel labeDireccion  = new JLabel("Direccion: ");
				labeDireccion.setBounds(230, 30, 70, 10);
				datosClientes.add(labeDireccion);
				//telefono
				JLabel labeTelefono = new JLabel("Telefono: ");
				labeTelefono.setBounds(20, 70, 70, 10);
				datosClientes.add(labeTelefono);
				//ruc 
				JLabel laberuc= new JLabel("RUC: ");
				laberuc.setBounds(230, 70, 70, 10);
				datosClientes.add(laberuc);
				//------------bloques de texto
				//id
				JTextField id = new JTextField("ID");
				id.setForeground(Color.RED);
				id.setBounds(35, 30, 40, 15);
				datosClientes.add(id);
				//descripcion
				JTextField descri = new JTextField("descripcion");
				descri.setForeground(Color.RED);
				descri.setBounds(155, 30, 70, 15);
				datosClientes.add(descri);
				//direccion
				JTextField descrion = new JTextField("direccion");
				descrion.setForeground(Color.RED);
				descrion.setBounds(295, 30, 100, 15);
				datosClientes.add(descrion);
				//telefono
				JTextField telefono = new JTextField("8080808");
				telefono.setForeground(Color.RED);
				telefono.setBounds(80, 70, 100, 15);
				datosClientes.add(telefono);
				//ruc
				JTextField ruc = new JTextField("ruc");
				ruc.setForeground(Color.RED);
				ruc.setBounds(270, 70, 100, 15);
				datosClientes.add(ruc);
	}
	
	public void botones() {
		//-----------------panel de botones
		botones = new JPanel();
		botones.setLayout(null);
		botones.setBorder(BorderFactory.createLineBorder(gris, 1));
		botones.setBounds(21, 230, 448, 80);
		//boton1
		boton1 = new JButton("nuevo");
		boton1.setBounds(10, 10, 100, 20);
		botones.add(boton1);
		//boton2
		boton2 = new JButton("guardar");
		boton2.setBounds(180, 10, 100, 20);
		botones.add(boton2);
		//boton3
		boton3 = new JButton("editar");
		boton3.setBounds(180, 40, 100, 20);
		botones.add(boton3);
		//boton4
		boton4 = new JButton("eliminar");
		boton4.setBounds(330, 10, 100, 20);
		botones.add(boton4);
		//boton5
		boton5 = new JButton("informar");
		boton5.setBounds(10, 40, 100, 20);
		botones.add(boton5);
		//boton6
		boton6 = new JButton("cancelar");
		boton6.setBounds(330, 40, 100, 20);
		botones.add(boton6);

	}
	
	public void tabla1() {
		tablapanel = new JPanel();
		tablapanel.setLayout(new BorderLayout());
		tablapanel.setBorder(BorderFactory.createLineBorder(gris, 1));
		tablapanel.setBounds(21, 330, 448, 100);
		Object filaDatos [][] = {{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""},{"","","","","",""}};
		Object columDatos []= {"ID","descripcion","direccion","tel","ruc"};
		tabla1 = new JTable(filaDatos,columDatos);
		JScrollPane sp = new JScrollPane(tabla1);
		tablapanel.add(sp);
	}
	
	formClass(){
		titulo();
		body();
		botones();
		tabla1();
		form2();
	}
}