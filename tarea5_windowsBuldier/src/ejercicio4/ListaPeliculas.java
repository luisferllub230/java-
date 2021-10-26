package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPeliculas {

	private JFrame frmPeliculas;
	private JTextField textField;
	JComboBox comboBox;
	String puente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPeliculas window = new ListaPeliculas();
					window.frmPeliculas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListaPeliculas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPeliculas = new JFrame();
		frmPeliculas.setTitle("PELICULAS");
		frmPeliculas.setBounds(100, 100, 372, 300);
		frmPeliculas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPeliculas.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 339, 239);
		frmPeliculas.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 113, 152, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("a\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puente = textField.getText();
				comboBox.addItem(textField.getText());
			}
		});
		btnNewButton.setBounds(90, 149, 152, 23);
		panel.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setBounds(177, 112, 152, 22);
		panel.add(comboBox);
	}

}