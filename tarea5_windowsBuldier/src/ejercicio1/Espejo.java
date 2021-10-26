package ejercicio1;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Window.Type;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;

public class Espejo implements ChangeListener{

	private JFrame frmEspejo;
	ButtonGroup GrupoRadioB, GrupoRadioBtnEsp;
	JPanel panel1, panel2;
	JRadioButton rdbtn1,rdbtn2,rdbtn3; 
	JRadioButton EspejoRdbR1,EspejoRdbR2,EspejoRdbR3;
	JCheckBox chckbx1,chckbx2,chckbx3,Espejochckbx1,Espejochckbx2,Espejochckbx3;
	JTextField textField1, EspejotextField1;
	JSpinner spinner1,EspejoSpinner1;
	String[] comboBoxMenssage = {"hola1", "hola2", "hola3"};
	JComboBox EspejoComboBox1, comboBox1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Espejo window = new Espejo();
					window.frmEspejo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Espejo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEspejo = new JFrame();
		frmEspejo.setTitle("Espejo");
		frmEspejo.setType(Type.UTILITY);
		frmEspejo.setBounds(100, 100, 357, 326);
		frmEspejo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEspejo.getContentPane().setLayout(null);
		
		//jpanel1
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(null, "Original ", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel1.setBounds(10, 11, 325, 125);
		frmEspejo.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		//---------------> JRadioButton
		rdbtn1 = new JRadioButton("R1");
		rdbtn1.setBounds(6, 29, 109, 23);
		rdbtn1.addChangeListener(this);
		panel1.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("R2");
		rdbtn2.setBounds(6, 55, 109, 23);
		rdbtn2.addChangeListener(this);
		panel1.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("R3");
		rdbtn3.setBounds(6, 81, 109, 23);
		rdbtn3.addChangeListener(this);
		panel1.add(rdbtn3);
		
		GrupoRadioB = new ButtonGroup();
		GrupoRadioB.add(rdbtn1);
		GrupoRadioB.add(rdbtn2);
		GrupoRadioB.add(rdbtn3);
		
		//---------------> agrupamiento de los rdb
		chckbx1 = new JCheckBox("C1");
		chckbx1.setBounds(117, 29, 97, 23);
		chckbx1.addChangeListener(this);
		panel1.add(chckbx1);
		
		chckbx2 = new JCheckBox("C2");
		chckbx2.setBounds(117, 55, 97, 23);
		chckbx2.addChangeListener(this);
		panel1.add(chckbx2);
		
		chckbx3 = new JCheckBox("C3");
		chckbx3.setBounds(117, 81, 97, 23);
		chckbx2.addChangeListener(this);
		panel1.add(chckbx3);
		
		//---------------> JTextField
		textField1 = new JTextField(); // se cambia solo cuando se presiona el enter
		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EspejotextField1.setText(textField1.getText());
			}
		});
		textField1.setBounds(221, 30, 86, 20);
		textField1.getText();
		panel1.add(textField1);
		textField1.setColumns(10);
		//---------------> JSpinner
		spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				EspejoSpinner1.setValue(spinner1.getValue());
			}
		});
		spinner1.setBounds(220, 82, 87, 20);
		panel1.add(spinner1);
		//---------------> JComoBox
		comboBox1 = new JComboBox(comboBoxMenssage);
		comboBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				EspejoComboBox1.setSelectedItem(comboBox1.getSelectedItem());
			}
		});
		comboBox1.setEditable(true);
		comboBox1.setBounds(220, 55, 87, 22);
		panel1.add(comboBox1);
		
		
		//jpanel2
		panel2 = new JPanel();
		panel2.setBorder(new TitledBorder(null, "Espejo", TitledBorder.LEFT, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel2.setBounds(10, 147, 325, 125);
		frmEspejo.getContentPane().add(panel2);
		panel2.setLayout(null);
		
		//---------------> JRadioButton
		EspejoRdbR1 = new JRadioButton("Espejo R1");
		EspejoRdbR1.setEnabled(false);
		EspejoRdbR1.setBounds(6, 35, 109, 23);
		EspejoRdbR1.addChangeListener(this);
		panel2.add(EspejoRdbR1);
		EspejoRdbR2 = new JRadioButton("Espejo R2");
		EspejoRdbR2.setEnabled(false);
		EspejoRdbR2.setBounds(6, 61, 109, 23);
		EspejoRdbR2.addChangeListener(this);
		panel2.add(EspejoRdbR2);
		EspejoRdbR3 = new JRadioButton("Espejo R3");
		EspejoRdbR3.setEnabled(false);
		EspejoRdbR3.setBounds(6, 87, 109, 23);
		EspejoRdbR3.addChangeListener(this);
		panel2.add(EspejoRdbR3);
		GrupoRadioBtnEsp = new ButtonGroup();
		GrupoRadioBtnEsp.add(EspejoRdbR1);
		GrupoRadioBtnEsp.add(EspejoRdbR2);
		GrupoRadioBtnEsp.add(EspejoRdbR3);
		
		//---------------> JCheckBox
		Espejochckbx1 = new JCheckBox("C1");
		Espejochckbx1.setEnabled(false);
		Espejochckbx1.setBounds(117, 35, 97, 23);
		Espejochckbx1.addChangeListener(this);
		panel2.add(Espejochckbx1);
		Espejochckbx2 = new JCheckBox("C2");
		Espejochckbx2.setEnabled(false);
		Espejochckbx2.setBounds(117, 61, 97, 23);
		Espejochckbx2.addChangeListener(this);
		panel2.add(Espejochckbx2);
		Espejochckbx3 = new JCheckBox("C3");
		Espejochckbx3.setEnabled(false);
		Espejochckbx3.setBounds(117, 87, 97, 23);
		Espejochckbx3.addChangeListener(this);
		panel2.add(Espejochckbx3);
		
		//---------------> JTextField
		EspejotextField1 = new JTextField();
		EspejotextField1.setEnabled(false);
		EspejotextField1.setColumns(10);
		EspejotextField1.setBounds(220, 36, 86, 20);
		panel2.add(EspejotextField1);
		
		//---------------> JComboBox
		EspejoComboBox1 = new JComboBox();
		EspejoComboBox1.setEditable(true);
		EspejoComboBox1.setBounds(220, 61, 87, 22);
		panel2.add(EspejoComboBox1);
		
		//---------------> JSpinner
		EspejoSpinner1 = new JSpinner();
		EspejoSpinner1.setToolTipText("");
		EspejoSpinner1.setEnabled(false);
		EspejoSpinner1.setBounds(220, 88, 87, 20);
		panel2.add(EspejoSpinner1);
	}
	
	/**
	 * metodo State Changed
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		//rdbtn1 
		if(rdbtn1.isSelected()) {EspejoRdbR1.setSelected(true);}
		if(rdbtn2.isSelected()) {EspejoRdbR2.setSelected(true);}
		if(rdbtn3.isSelected()) {EspejoRdbR3.setSelected(true);}
		//checkbox
		if(chckbx1.isSelected()) {Espejochckbx1.setSelected(true);} else{Espejochckbx1.setSelected(false);}
		if(chckbx2.isSelected()) {Espejochckbx2.setSelected(true);} else{Espejochckbx2.setSelected(false);}
		if(chckbx3.isSelected()) {Espejochckbx3.setSelected(true);} else{Espejochckbx3.setSelected(false);}//retraso de 20s :,( 
	}
}
