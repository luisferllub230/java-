package Interfaz;

import java.awt.EventQueue;
import Clases.ConectorDB;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class agenda {

	private JFrame frame;
	private ConectorDB con = new ConectorDB();
	private JTextField textNombre;
	String nombre;
	private JTextField textBuscar;
	JLabel lbl1;
	private JTextField textIDmatricula;
	private JTextField textCarrera;
	JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agenda window = new agenda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public agenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(106, 64, 86, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textBuscar = new JTextField();
		textBuscar.setBounds(106, 227, 318, 23);
		frame.getContentPane().add(textBuscar);
		textBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setText(con.buscar(textBuscar.getText()));
				con.desconectar();
				textBuscar.setText("");
			}
		});
		btnBuscar.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		lbl1 = new JLabel("...");
		lbl1.setBounds(10, 196, 414, 20);
		frame.getContentPane().add(lbl1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("opciones ");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmGuardar = new JMenuItem("GUARDAR");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textIDmatricula.getText()== null && textNombre.getText() == null && textCarrera.getText() == null) {
					JOptionPane.showMessageDialog(null, "Para poder guardar debes de llenar los campos: matricula, nombre y carrera");
				}
				else {
					con.guardar(textIDmatricula.getText(),textNombre.getText(),textCarrera.getText());
					con.desconectar();
					textIDmatricula.setText(null);textCarrera.setText(null);textNombre.setText(null);
				}
			}
		});
		mnNewMenu.add(mntmGuardar);
		
		JMenuItem mntmBorrar = new JMenuItem("BORRAR");
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textIDmatricula.getText()== null || textNombre.getText() == null || textCarrera.getText() == null) {
					JOptionPane.showMessageDialog(null, "para poder borrar debes de llenar el campo matricula");
				}
				else {
					con.borrar(textIDmatricula.getText());
					con.desconectar();
					textIDmatricula.setText(null);textCarrera.setText(null);textNombre.setText(null);
				}
			}
		});
		mnNewMenu.add(mntmBorrar);
		
		JMenuItem mntmlist = new JMenuItem("MOSTRAR LISTA");
		mntmlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(con.mostrarLista());
				con.desconectar();
			}
		});
		mnNewMenu.add(mntmlist);
		
		textIDmatricula = new JTextField();
		textIDmatricula.setBounds(10, 64, 86, 20);
		frame.getContentPane().add(textIDmatricula);
		textIDmatricula.setColumns(10);
		
		JLabel lblmatricula = new JLabel("MATRICULA");
		lblmatricula.setBounds(10, 39, 86, 14);
		frame.getContentPane().add(lblmatricula);
		
		JLabel lblnombre = new JLabel("NOMBRE");
		lblnombre.setBounds(106, 39, 86, 14);
		frame.getContentPane().add(lblnombre);
		
		textCarrera = new JTextField();
		textCarrera.setBounds(202, 64, 86, 20);
		frame.getContentPane().add(textCarrera);
		textCarrera.setColumns(10);
		
		JLabel lblCarrera = new JLabel("CARRERA");
		lblCarrera.setBounds(202, 39, 86, 14);
		frame.getContentPane().add(lblCarrera);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 95, 393, 75);
		frame.getContentPane().add(scrollPane);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		
	}
}
