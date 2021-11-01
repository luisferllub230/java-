package tarea6_Menu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Menu{

	private JFrame frame;
	JMenuBar menuBar;
	JMenu JmenuCalcular;
	Calcular calc = new Calcular();
	private JMenu JmenuSuma;
	private JMenuItem JmenuItenSumaDosNum;
	private JMenuItem JmenuItenSumaTresNum;
	private JMenu JmenuMulti;
	private JMenuItem JmenuItenMultDosNum;
	private JMenuItem JmenuItenMultTresNum;
	private JMenu JmenuResta;
	private JMenuItem JmenuItemRestNumPos;
	private JMenuItem JmenuItemRestNumNeg;
	private JTable table;
	JScrollPane scrollPane;
	Object filaDatos [][] = {{"Suma de dos numeros",""},{"Suma de tres numeros",""},{"multiplicacion de dos numeros",""},{"multiplicacion de tres numeros",""},
			{"resta de dos numeros positivos",""},{"resta de dos numeros negativos",""}};
	Object columDatos []= {"referencia","resultado"};
	DefaultTableModel modo = new DefaultTableModel(filaDatos,columDatos);;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//menubar
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JmenuCalcular = new JMenu("Calcular");
		JmenuCalcular.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(JmenuCalcular);
		
		//-----> aqui las sumas
		JmenuSuma = new JMenu("SUMA");
		JmenuCalcular.add(JmenuSuma);
		JmenuItenSumaDosNum = new JMenuItem("SUMAR DOS NUMEROS");
		JmenuItenSumaDosNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.SumaDosNum(a, b)+"", 0, 1); 
			}
		});
		JmenuSuma.add(JmenuItenSumaDosNum);
		JmenuItenSumaTresNum = new JMenuItem("SUMAR TRES NUMEROS");
		JmenuItenSumaTresNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int c =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.SumaTresNum(a, b,c)+"", 1, 1); 
			}
		});
		JmenuSuma.add(JmenuItenSumaTresNum);
		
		//-----> aqui las multi
		JmenuMulti = new JMenu("MULTIPLICAR");
		JmenuCalcular.add(JmenuMulti);
		JmenuItenMultDosNum = new JMenuItem("MULTIPLICAR DOS NUMEROS");
		JmenuItenMultDosNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.MultDosNum(a, b)+"", 2, 1); 
			}
		});
		JmenuMulti.add(JmenuItenMultDosNum);
		JmenuItenMultTresNum = new JMenuItem("MULTIPLICAR TRES NUMEROS");
		JmenuItenMultTresNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int c =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.MultTresNum(a, b,c)+"", 3, 1); 
			}
		});
		JmenuMulti.add(JmenuItenMultTresNum);
		
		//-----> aqui las restas
		JmenuResta = new JMenu("RESTA");
		JmenuCalcular.add(JmenuResta);
		JmenuItemRestNumPos = new JMenuItem("RESTAR NUMEROS POSITIVOS");
		JmenuItemRestNumPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.RestarDosNumP(a, b)+"", 4, 1); 
			}
		});
		JmenuResta.add(JmenuItemRestNumPos);
		JmenuItemRestNumNeg = new JMenuItem("RESTAR NUMEROS NEGATIVOS");
		JmenuItemRestNumNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				int b =Integer.parseInt(JOptionPane.showInputDialog(frame, "introduzca el primer numero"));
				modo.setValueAt(calc.RestDosNumN(a, b)+"", 5, 1); 
			}
		});
		JmenuResta.add(JmenuItemRestNumNeg);
		frame.getContentPane().setLayout(null);
		
		//scrolpanel
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 424, 133);
		frame.getContentPane().add(scrollPane);
		
		//tabla
		table = new JTable();
		
		table = new JTable(modo);
		scrollPane.setViewportView(table);
	}
}