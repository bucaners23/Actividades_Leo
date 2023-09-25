package Calculadora_imc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class imc {

	private JFrame frmCalculadoraDeImc;
	private JLabel lblNewLabel;
	private JLabel lblAltura;
	private JTextField txtPes;
	private JTextField txtAlt;
	private JButton btnCalcular;
	private JLabel lblIMC;
	private JLabel lblNewLabel_1;
	private JLabel lblEst;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imc window = new imc();
					window.frmCalculadoraDeImc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public imc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeImc = new JFrame();
		frmCalculadoraDeImc.setIconImage(Toolkit.getDefaultToolkit().getImage(imc.class.getResource("/Calculadora_imc/imc.png")));
		frmCalculadoraDeImc.setTitle("Calculadora de imc");
		frmCalculadoraDeImc.setBounds(100, 100, 565, 362);
		frmCalculadoraDeImc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeImc.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Peso (Kg)");
		lblNewLabel.setBounds(24, 37, 78, 14);
		frmCalculadoraDeImc.getContentPane().add(lblNewLabel);
		
		lblAltura = new JLabel("Altura (m)");
		lblAltura.setBounds(24, 80, 78, 14);
		frmCalculadoraDeImc.getContentPane().add(lblAltura);
		
		txtPes = new JTextField();
		txtPes.setBounds(112, 34, 86, 20);
		frmCalculadoraDeImc.getContentPane().add(txtPes);
		txtPes.setColumns(10);
		
		txtAlt = new JTextField();
		txtAlt.setColumns(10);
		txtAlt.setBounds(112, 77, 86, 20);
		frmCalculadoraDeImc.getContentPane().add(txtAlt);
		
		btnCalcular = new JButton("Calcular imc");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// peso/altura*altura
				double peso=Double.parseDouble(txtPes.getText());
				double altura=Double.parseDouble(txtAlt.getText());
				double imc=peso/(altura*altura);
				lblIMC.setText("El imc es de : "+imc);
				if(imc<18.5) {
					lblEst.setText("Bajo peso");
					lblEst.setBackground(new Color (0,159,227) );
					lblIMC.setBackground(new Color (0,159,227) );

				}else if(imc<24.9) {
					lblEst.setText("Peso normal");
					lblEst.setBackground(new Color (148,193,32) );
					lblIMC.setBackground(new Color (148,193,32) );
				}else if(imc<29.9) {
					lblEst.setText("Sobre peso");
					lblEst.setBackground(new Color (247,195,50) );
					lblIMC.setBackground(new Color (247,195,50) );

				}else if(imc<34.9) {
					lblEst.setText("Obesidad l");
					lblEst.setBackground(new Color (232,155,17) );
					lblIMC.setBackground(new Color (232,155,17) );

				}else if(imc<39.9) {
					lblEst.setText("Obesidad ll");
					lblEst.setBackground(new Color (232,91,12) );
					lblIMC.setBackground(new Color (232,91,12) );

				}else {
					lblEst.setText("Obesidad lll");
					lblEst.setBackground(new Color (228,6,19) );
					lblIMC.setBackground(new Color (228,6,19) );

				}
			}
		});
		btnCalcular.setBounds(24, 138, 132, 23);
		frmCalculadoraDeImc.getContentPane().add(btnCalcular);
		
		lblIMC = new JLabel(" imc");
		lblIMC.setOpaque(true);
		lblIMC.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblIMC.setBounds(24, 194, 132, 33);
		frmCalculadoraDeImc.getContentPane().add(lblIMC);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(imc.class.getResource("/Calculadora_imc/imagen imc 1.png")));
		lblNewLabel_1.setBounds(224, 37, 315, 215);
		frmCalculadoraDeImc.getContentPane().add(lblNewLabel_1);
		
		lblEst = new JLabel(" Estado");
		lblEst.setOpaque(true);
		lblEst.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblEst.setBounds(21, 238, 135, 33);
		frmCalculadoraDeImc.getContentPane().add(lblEst);
		
		btnNewButton = new JButton("borrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEst.setText("");
				lblIMC.setText("");
				txtAlt.setText("");
				txtPes.setText("");
				lblEst.setBackground(null);
				lblIMC.setBackground(null);
				
				}
		});
		btnNewButton.setBounds(185, 248, 89, 23);
		frmCalculadoraDeImc.getContentPane().add(btnNewButton);
	}

}
