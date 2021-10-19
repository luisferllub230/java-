package formulario1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class formClass {

	JFrame form1;
	JPanel panel1;
	JPanel panelPadre;
	JPanel panelfooter;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JLabel label6;
	JLabel label7;
	JTextField texfield1;
	JTextField texfield2;
	JTextField texfield3;
	JTextField texfield4;
	@SuppressWarnings("rawtypes")
	JComboBox combobox1;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JCheckBox checkbox;
	
	Color gris = new Color(130,130,130);
	
	@SuppressWarnings("static-access")
	public void crearForm1() {
		form1 = new JFrame();
		form1.setTitle("nuevo form");
		form1.setSize(500, 500);
		form1.setLayout(new BoxLayout(form1.getContentPane(),BoxLayout.Y_AXIS));
		//aniadir paneles
		boton1 = new JButton("Aceptar");
		boton1.setBounds(210, 430, 90, 20);
		form1.add(boton1);
		boton2 = new JButton("Cancelar");
		boton2.setBounds(300, 430, 90, 20);
		form1.add(boton2);
		boton3 = new JButton("Ayuda");
		boton3.setBounds(390, 430, 90, 20);
		form1.add(boton3);
		form1.add(panel1);
		form1.add(panelPadre);
		form1.setLayout(null);
		form1.setLocationRelativeTo(null);
		form1.setVisible(true);
		form1.setDefaultCloseOperation(form1.EXIT_ON_CLOSE);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void panel1(){
		//instanciar
		panel1 = new JPanel();
		label1 = new JLabel("Establecer propiedad jlabel's font utilizando: ");
		combobox1 = new JComboBox();
		
		//editar
		panel1.setBounds(0, 1, 490, 40);
		combobox1.addItem("hoala mundo");
		panel1.setBorder(new EmptyBorder(10, 10, 10, 10));//para dar un padding
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS));
		
		//aniadir
		panel1.add(label1);
		panel1.add(combobox1);
	}
	
	public void panelPadre(){
		//instanciar
		panelPadre = new JPanel();
		checkbox = new JCheckBox(" Optener el tipo de letra a partir del tipo de letra predeterminado");
		label2 = new JLabel("Fuente: ");
		label3 = new JLabel("Estilo de Fuente: ");
		label4 = new JLabel("Tamanio: ");
		label5 = new JLabel("Thoma");
		label6 = new JLabel("Sin Formato");
		texfield1 = new JTextField();
		texfield2 = new JTextField();
		texfield3 = new JTextField();
		texfield4 = new JTextField();
		label7 = new JLabel("THE quick browm fox jumpsz over the lazy dog");
		
		//editar
		panelPadre.setLayout(null);
		panelPadre.setBounds(3, 43, 476,370);
		panelPadre.setBorder(BorderFactory.createLineBorder(gris, 2));
		checkbox.setBounds(10, 10, 400, 20);
		label2.setBounds(15, 50, 200, 20);
		label3.setBounds(210, 50, 200, 20);
		label4.setBounds(400, 50, 200, 20);
		label5.setBounds(15, 70, 190, 20);
		label5.setBorder(BorderFactory.createLineBorder(gris, 2));
		label5.setForeground(gris);
		label6.setBounds(210, 70, 188, 20);
		label6.setBorder(BorderFactory.createLineBorder(gris, 2));
		label6.setForeground(gris);
		texfield1.setBounds(400, 70, 60, 20);
		texfield2.setBounds(15, 95, 190, 190);
		texfield3.setBounds(210, 95, 188, 190);
		texfield4.setBounds(400, 95, 60, 190);
		label7.setBounds(15, 290, 425, 50);
		label7.setFont(new Font("arial",Font.CENTER_BASELINE,18));
		TitledBorder titulo = BorderFactory.createTitledBorder("Vista previa");
		titulo.setBorder(BorderFactory.createLineBorder(gris));
		titulo.setTitleJustification(TitledBorder.LEFT);
		label7.setBorder(titulo);
		
		
		//aniadir
		panelPadre.add(checkbox);
		panelPadre.add(label2);
		panelPadre.add(label3);
		panelPadre.add(label4);
		panelPadre.add(label5);
		panelPadre.add(label6);
		panelPadre.add(texfield1);
		panelPadre.add(texfield2);
		panelPadre.add(texfield3);
		panelPadre.add(texfield4);
		panelPadre.add(label7);
	}
	
	formClass(){ 
		panel1();
		panelPadre();
		crearForm1();
	}
}

