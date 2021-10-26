package ejercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mostrar {

	private JFrame frame;
	Socio socio1;
	Socio socio2;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//socios
		socio1 = new Socio();
		socio1.setNombre("luis fernandez");
		socio1.setNumero("80923232324");
		
		socio2 = new Socio();
		socio2.setNombre("luisa lluberes");
		socio2.setNumero("80922354544");
		
		JLabel lbltitulo = new JLabel("TODOS LOS SOCIOS DEL CLUB");
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(50, 32, 316, 14);
		frame.getContentPane().add(lbltitulo);
		
		JLabel lblNombreTitulo = new JLabel("Nombre ");
		lblNombreTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreTitulo.setBounds(10, 72, 156, 14);
		frame.getContentPane().add(lblNombreTitulo);
		
		JLabel lblNumeroTitulo = new JLabel("Numero cel.");
		lblNumeroTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroTitulo.setBounds(176, 72, 156, 14);
		frame.getContentPane().add(lblNumeroTitulo);
		
		JLabel lblSocio1 = new JLabel("....");
		lblSocio1.setEnabled(false);
		lblSocio1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocio1.setBounds(10, 108, 156, 14);
		frame.getContentPane().add(lblSocio1);
		
		JLabel lblSocioNumeroCel1 = new JLabel("....");
		lblSocioNumeroCel1.setEnabled(false);
		lblSocioNumeroCel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocioNumeroCel1.setBounds(176, 108, 156, 14);
		frame.getContentPane().add(lblSocioNumeroCel1);
		
		JLabel lblSocio2 = new JLabel("....");
		lblSocio2.setEnabled(false);
		lblSocio2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocio2.setBounds(10, 136, 156, 14);
		frame.getContentPane().add(lblSocio2);
		
		JLabel lblSocioNumeroCel2 = new JLabel("....");
		lblSocioNumeroCel2.setEnabled(false);
		lblSocioNumeroCel2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocioNumeroCel2.setBounds(176, 133, 156, 14);
		frame.getContentPane().add(lblSocioNumeroCel2);
		
		JLabel lblTotalSocios = new JLabel("Numero Total de Socios:");
		lblTotalSocios.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalSocios.setBounds(10, 193, 156, 14);
		frame.getContentPane().add(lblTotalSocios);
		
		JLabel lblTotalSociosNum = new JLabel("...");
		lblTotalSociosNum.setEnabled(false);
		lblTotalSociosNum.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalSociosNum.setBounds(176, 193, 156, 14);
		frame.getContentPane().add(lblTotalSociosNum);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSocio1.setText(socio1.getNombre());
				lblSocioNumeroCel1.setText(socio1.getNumero());
				lblSocio2.setText(socio2.getNombre());
				lblSocioNumeroCel2.setText(socio2.getNumero());
				String numTotal = Integer.toString(Socio.ProximoNumero);
				lblTotalSociosNum.setText(numTotal);
			}
		});
		btnMostrar.setBounds(277, 227, 89, 23);
		frame.getContentPane().add(btnMostrar);
	}
}
