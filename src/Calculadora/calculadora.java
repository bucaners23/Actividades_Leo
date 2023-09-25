package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class calculadora {

	private JFrame frmCalculadora;
	private JTextField txtn1;
	private JTextField txtn2;
	private JButton btnNewButton;
	private JLabel lblRes;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 599, 363);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("numero 1 ");
		lblNewLabel.setBounds(26, 34, 63, 14);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("numero 2");
		lblNumero.setBounds(26, 61, 63, 14);
		frmCalculadora.getContentPane().add(lblNumero);
		
		txtn1 = new JTextField();
		txtn1.setBounds(106, 31, 86, 20);
		frmCalculadora.getContentPane().add(txtn1);
		txtn1.setColumns(10);
		
		txtn2 = new JTextField();
		txtn2.setColumns(10);
		txtn2.setBounds(106, 58, 86, 20);
		frmCalculadora.getContentPane().add(txtn2);
		
		btnNewButton = new JButton("Suma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1=Integer.parseInt(txtn1.getText());
				int numero2=Integer.parseInt(txtn2.getText());
				lblRes.setText(" Resultado es : "+(numero1+numero2));
			}
		});
		btnNewButton.setBounds(10, 102, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButton);
		
		JButton btnMultiplicacion = new JButton("multiplicacion");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1=Integer.parseInt(txtn1.getText());
				int numero2=Integer.parseInt(txtn2.getText());
				lblRes.setText(" Resultado es : "+(numero1*numero2));
			}
		});
		btnMultiplicacion.setBounds(10, 136, 127, 23);
		frmCalculadora.getContentPane().add(btnMultiplicacion);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1=Integer.parseInt(txtn1.getText());
				int numero2=Integer.parseInt(txtn2.getText());
				lblRes.setText(" Resultado es : "+(numero1-numero2));
			}
		});
		btnResta.setBounds(106, 102, 89, 23);
		frmCalculadora.getContentPane().add(btnResta);
		
		JButton btnDivicion = new JButton("Divicion");
		btnDivicion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1=Double.parseDouble(txtn1.getText());
				double numero2=Double.parseDouble(txtn2.getText());
				if(numero2==0) {
					lblRes.setText(" NO se puede dividir a cero");
				}else {
					DecimalFormat df=new DecimalFormat("#.000");
				lblRes.setText(" Resultado es : "+df.format(numero1/numero2));
				}
			}
		});
		btnDivicion.setBounds(10, 170, 127, 23);
		frmCalculadora.getContentPane().add(btnDivicion);
		
		lblRes = new JLabel("  Resultado:");
		lblRes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblRes.setBounds(10, 273, 182, 20);
		frmCalculadora.getContentPane().add(lblRes);
		
		btnNewButton_1 = new JButton("Potencia");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1=Double.parseDouble(txtn1.getText());
				double numero2=Double.parseDouble(txtn2.getText());
				double potencia=Math.pow(numero1, numero2);
				lblRes.setText(" Resultado : "+potencia);
			}
		});
		btnNewButton_1.setBounds(10, 239, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Raiz cuadrada");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero1=Double.parseDouble(txtn1.getText());
               double raiz=Math.sqrt(numero1);
               txtn2.setText("");
               DecimalFormat df=new DecimalFormat("#.000");
               lblRes.setText(" Resultado : "+df.format(raiz));
			}
		});
		btnNewButton_2.setBounds(10, 205, 127, 23);
		frmCalculadora.getContentPane().add(btnNewButton_2);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(calculadora.class.getResource("/Calculadora/descarga.png")));
		lblNewLabel_1.setBounds(345, 22, 200, 260);
		frmCalculadora.getContentPane().add(lblNewLabel_1);
		
		btnNewButton_3 = new JButton("Borrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtn1.setText("");
				txtn2.setText("");
				lblRes.setText("");
			}
		});
		btnNewButton_3.setBounds(226, 46, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButton_3);
	}

}
