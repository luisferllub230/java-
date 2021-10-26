package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Encuesta implements ChangeListener{

	private JFrame frmMiniEncuesta;
	ButtonGroup GrupoRadioB;
	String soFavorito, especialidades1 ="",especialidades2= "",especialidades3="";
	JRadioButton rdbtn1,rdbtn2,rdbtn3;
	JCheckBox chckbx1,chckbx2,chckbx3;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encuesta window = new Encuesta();
					window.frmMiniEncuesta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Encuesta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiniEncuesta = new JFrame();
		frmMiniEncuesta.setTitle("Mini encuesta ");
		frmMiniEncuesta.setBounds(100, 100, 278, 497);
		frmMiniEncuesta.setLocationRelativeTo(null);
		frmMiniEncuesta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniEncuesta.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 11, 242, 138);
		frmMiniEncuesta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("\t\t\t\t\t\t\tElija un sistema operativo ");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(10, 11, 222, 14);
		panel.add(lbl1);
		
		rdbtn1 = new JRadioButton("Windows");
		rdbtn1.setBounds(10, 32, 109, 23);
		rdbtn1.addChangeListener(this);
		panel.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("Linux");
		rdbtn2.setBounds(10, 58, 109, 23);
		rdbtn2.addChangeListener(this);
		panel.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("Mac");
		rdbtn3.setBounds(10, 84, 109, 23);
		rdbtn3.addChangeListener(this);
		panel.add(rdbtn3);
		
		GrupoRadioB = new ButtonGroup();
		GrupoRadioB.add(rdbtn1);
		GrupoRadioB.add(rdbtn2);
		GrupoRadioB.add(rdbtn3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 160, 242, 138);
		frmMiniEncuesta.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl2 = new JLabel("\t\t\t\t\t\t\tElija una especialidad");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setBounds(10, 11, 222, 14);
		panel_1.add(lbl2);
		
		chckbx1 = new JCheckBox("Programador");
		chckbx1.setBounds(10, 32, 116, 23);
		chckbx1.addChangeListener(this);
		panel_1.add(chckbx1);
		
		chckbx2 = new JCheckBox("Disenio grafico");
		chckbx2.setBounds(10, 58, 116, 23);
		chckbx2.addChangeListener(this);
		panel_1.add(chckbx2);
		
		chckbx3 = new JCheckBox("Administrador");
		chckbx3.setBounds(10, 84, 116, 23);
		chckbx3.addChangeListener(this);
		panel_1.add(chckbx3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 309, 242, 138);
		frmMiniEncuesta.getContentPane().add(panel_1_1);
		
		JLabel lbl3 = new JLabel("Horas dedicadas al ordenador");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setBounds(10, 11, 222, 14);
		panel_1_1.add(lbl3);
		
		
		JLabel lblcontador = new JLabel("");
		lblcontador.setBounds(10, 46, 46, 25);
		panel_1_1.add(lblcontador);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblcontador.setText(""+slider.getValue());
			}
		});
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(70, 36, 150, 46);
		panel_1_1.add(slider);
		
		//mensage
		JButton btn1 = new JButton("Generar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"tu sistema operativo preferido es: "+soFavorito+", \ntus especialidades son: "
			+especialidades1+especialidades2+especialidades3+"\ny el numero de horas dedicadas al ordenador son de: "+slider.getValue());
			}
		});
		
		btn1.setBounds(70, 93, 89, 23);
		panel_1_1.add(btn1);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// para mostrar el SO
		if(rdbtn1.isSelected()) {soFavorito = rdbtn1.getText();} 
		if(rdbtn2.isSelected()) {soFavorito = rdbtn2.getText();} 
		if(rdbtn3.isSelected()) {soFavorito = rdbtn3.getText();}
		//para mostrar las especialidades
		if(chckbx1.isSelected() || chckbx2.isSelected() || chckbx3.isSelected()) {
			if(chckbx1.isSelected()) {especialidades1 = chckbx1.getText()+", ";} 
			if(chckbx2.isSelected()) {especialidades2 = chckbx2.getText()+", ";} 
			if(chckbx3.isSelected()) {especialidades3 = chckbx3.getText()+", ";} 			
		}
	}
}