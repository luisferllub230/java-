package ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mostrar {

	private JFrame frame;
	TiposTriangulos t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrar window = new Mostrar();
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
	public Mostrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//t riangulos
		t1 = new TiposTriangulos();
		
		JLabel lblNewLabel = new JLabel("tipos de triangulos ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 24, 414, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinnerA = new JSpinner();
		spinnerA.setBounds(10, 87, 67, 20);
		frame.getContentPane().add(spinnerA);
		
		JSpinner spinnerB = new JSpinner();
		spinnerB.setBounds(87, 87, 67, 20);
		frame.getContentPane().add(spinnerB);
		
		JSpinner spinnerC = new JSpinner();
		spinnerC.setBounds(164, 87, 67, 20);
		frame.getContentPane().add(spinnerC);
		
		
		JLabel triangT = new JLabel("...");
		triangT.setBounds(10, 177, 445, 14);
		frame.getContentPane().add(triangT);
		
		JButton btnNewButton = new JButton("MOSTRAR EL TIPO DE TRIANGULO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = (Integer)(spinnerA.getValue());
				int b = (Integer)(spinnerB.getValue());
				int c = (Integer)(spinnerC.getValue());
				
				t1.determinarTriangulo(a, b, c);
				
				triangT.setText(t1.equilatero+", "+t1.aunguloRecto+", "+t1.escaleno+", "+t1.isosceles);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(241, 86, 214, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
