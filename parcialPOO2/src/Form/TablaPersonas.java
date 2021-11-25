package Form;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Clases.Personas;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TablaPersonas extends Personas {

	private JFrame frame;
	private JTable table;
	private JTextField textNombre;
	private JTextField textPersonaNJA;
	private JTextField textEDAD;
	private JScrollPane scrollPane;
	private JTable table_1;
	DefaultTableModel m;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablaPersonas window = new TablaPersonas();
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
	public TablaPersonas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//tabla
		Vector<Vector> filatotal = new Vector<Vector>();
		
		Vector<String> colum = new Vector<String>();
		colum.add("nombre");
		colum.add("edad");
		colum.add("personNJA");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 141, 414, 120);
		frame.getContentPane().add(scrollPane);
		m = new DefaultTableModel(filatotal,colum);
		table_1 = new JTable(m);
		scrollPane.setViewportView(table_1);
		
		
		//-------------los botones
		JButton btnagregar = new JButton("AGREGAR");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.addRow(new Object[] {textNombre.getText(),textPersonaNJA.getText(),textEDAD.getText()});
				accionproseso("Se agrego la persona "+textNombre.getText()+",  edad:"+textPersonaNJA.getText()+", tipo:"+textEDAD.getText());
			}
		});
		btnagregar.setBounds(10, 317, 89, 23);
		frame.getContentPane().add(btnagregar);
		
		JButton btneliminar = new JButton("ELIMINAR");
		btneliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.removeRow(0);
				accionproseso("Se elimino la persona "+textNombre.getText()+",  edad:"+textPersonaNJA.getText()+", edad:"+textEDAD.getText());
			}
		});
		btneliminar.setBounds(335, 317, 89, 23);
		frame.getContentPane().add(btneliminar);
		
		textNombre = new JTextField();
		textNombre.setBounds(10, 102, 121, 20);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textPersonaNJA = new JTextField();
		textPersonaNJA.setColumns(10);
		textPersonaNJA.setBounds(141, 102, 121, 20);
		frame.getContentPane().add(textPersonaNJA);
		
		textEDAD = new JTextField();
		textEDAD.setColumns(10);
		textEDAD.setBounds(272, 102, 121, 20);
		frame.getContentPane().add(textEDAD);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(10, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("edad");
		lblNewLabel_1.setBounds(141, 77, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("personaNJA");
		lblNewLabel_2.setBounds(271, 77, 99, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}

	@Override
	public void accionproseso(String informar) {
		System.out.print(informar+"\n");
	}
}
