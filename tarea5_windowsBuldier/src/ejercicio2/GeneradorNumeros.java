package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GeneradorNumeros {

	private JFrame frmGeneradorDeNumeros;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneradorNumeros window = new GeneradorNumeros();
					window.frmGeneradorDeNumeros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GeneradorNumeros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeneradorDeNumeros = new JFrame();
		frmGeneradorDeNumeros.setTitle("Generador de numeros");
		frmGeneradorDeNumeros.setBounds(100, 100, 450, 300);
		frmGeneradorDeNumeros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeneradorDeNumeros.getContentPane().setLayout(null);
		
		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(100, 11, 80, 20);
		frmGeneradorDeNumeros.getContentPane().add(spinner1);
		
		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(100, 42, 80, 20);
		frmGeneradorDeNumeros.getContentPane().add(spinner2);
		
		textField1 = new JTextField();
		textField1.setEnabled(false);
		textField1.setBounds(10, 85, 80, 20);
		frmGeneradorDeNumeros.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btn1 = new JButton("GENERAR");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1 = 0, valor2 = 0;
				valor1 = Integer.parseInt(spinner1.getValue().toString());
				valor2 = Integer.parseInt(spinner2.getValue().toString());
				String total= Integer.toString(valor1 + valor2);
				textField1.setText(total);
			}
		});
		btn1.setBounds(100, 84, 132, 23);
		frmGeneradorDeNumeros.getContentPane().add(btn1);
		
		JLabel lblNewLabel = new JLabel("Numero 1#");
		lblNewLabel.setBounds(10, 14, 80, 17);
		frmGeneradorDeNumeros.getContentPane().add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2#");
		lblNumero.setBounds(10, 45, 80, 17);
		frmGeneradorDeNumeros.getContentPane().add(lblNumero);
	}
}
