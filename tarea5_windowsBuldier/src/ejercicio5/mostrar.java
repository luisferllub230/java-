package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mostrar extends libro{

	private JFrame frame;
	libro l1, l2;
	String prestable, original;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mostrar window = new mostrar();
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
	public mostrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 524, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// original y no se presta
		l1 = new libro();
		l1.setTitulo("tres juanitos");
		l1.setOriginal(true);
		l1.setPrestable(false);
				
		//copia y se presta
		l2 = new libro();
		l2.setOriginal(false);
		l2.setPrestable(true);
		l2.setTitulo("copia-tres juanitos");
		
		JLabel lblLibros = new JLabel("Libros");
		lblLibros.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblLibros);
		
		JLabel lbl1 = new JLabel("nombre del libro ");
		lbl1.setBounds(10, 51, 119, 14);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Prestable ");
		lbl2.setBounds(174, 51, 108, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lblNewLabel = new JLabel("originalidad");
		lblNewLabel.setBounds(333, 51, 90, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1label = new JLabel("");
		l1label.setEnabled(false);
		l1label.setBounds(10, 76, 119, 14);
		frame.getContentPane().add(l1label);
		
		JLabel l1label2 = new JLabel(".");
		l1label2.setEnabled(false);
		l1label2.setBounds(174, 76, 108, 14);
		frame.getContentPane().add(l1label2);
		
		JLabel l1label3 = new JLabel("");
		l1label3.setEnabled(false);
		l1label3.setBounds(333, 76, 90, 14);
		frame.getContentPane().add(l1label3);
		
		
		JLabel l1label_1 = new JLabel("");
		l1label_1.setEnabled(false);
		l1label_1.setBounds(10, 101, 119, 14);
		frame.getContentPane().add(l1label_1);
		
		JLabel l1label_1_1 = new JLabel("");
		l1label_1_1.setEnabled(false);
		l1label_1_1.setBounds(174, 101, 108, 14);
		frame.getContentPane().add(l1label_1_1);
		
		JLabel l1label_1_2 = new JLabel("");
		l1label_1_2.setEnabled(false);
		l1label_1_2.setBounds(333, 101, 90, 14);
		frame.getContentPane().add(l1label_1_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//l1
				l1label.setText(l1.getTitulo());
				if(l1.getPrestable()) {prestable = "SI";} else {prestable = "NO";}
				if(l1.getOriginal()) {original = "SI";} else {original = "NO";}
				l1label2.setText(prestable);
				l1label3.setText(original);
				//l2
				l1label_1.setText(l2.getTitulo());
				if(l2.getPrestable()) {prestable = "SI";} else {prestable = "NO";}
				if(l2.getOriginal()) {original = "SI";} else {original = "NO";}
				l1label_1_1.setText(prestable);
				l1label_1_2.setText(original);
			}
		});
		btnNewButton.setBounds(193, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}