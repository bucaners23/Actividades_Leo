package zignos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class zidiacal {

	private JFrame frmZignosZodiacales;
	private JTextField txtDia;
	private JTextField txtMes;
	private JLabel lblZig;
	private JLabel lblFec;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zidiacal window = new zidiacal();
					window.frmZignosZodiacales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public zidiacal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZignosZodiacales = new JFrame();
		frmZignosZodiacales.setIconImage(Toolkit.getDefaultToolkit().getImage(zidiacal.class.getResource("/zignos/horoscopo.png")));
		frmZignosZodiacales.setTitle("Zignos zodiacales");
		frmZignosZodiacales.setBounds(100, 100, 566, 364);
		frmZignosZodiacales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZignosZodiacales.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("D I A");
		lblNewLabel.setBounds(24, 33, 46, 14);
		frmZignosZodiacales.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("M E S (en numero)");
		lblNewLabel_1.setBounds(24, 65, 107, 14);
		frmZignosZodiacales.getContentPane().add(lblNewLabel_1);
		
		txtDia = new JTextField();
		txtDia.setBounds(160, 30, 107, 20);
		frmZignosZodiacales.getContentPane().add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.setColumns(10);
		txtMes.setBounds(160, 62, 107, 20);
		frmZignosZodiacales.getContentPane().add(txtMes);
		
		JButton btnNewButton = new JButton("Mi zigno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dia=Integer.parseInt(txtDia.getText());
				int mes=Integer.parseInt(txtMes.getText());
				if((dia>31 || dia<0) ||(mes>12 || mes<0)) {
					lblZig.setText("NO EXISTE");
					lblFec.setText("NO EXISTE la fecha");

				}else {
                if((dia>=21 && mes==3 || dia>19 && mes==4)) {
                	lblZig.setText("Aries");
                	if(mes==3) {
                	lblFec.setText(dia+" de Marzo");
                	}
                	if(mes==4) {
                    	lblFec.setText(dia+" de Abril");
                	}
                }else if((dia>=20 && mes==4 || dia<20 && mes==5)) {
                	lblZig.setText("Tauro");
                	if(mes==4) {
                    	lblFec.setText(dia+" de Abril");
                    	}
                    	if(mes==5) {
                        	lblFec.setText(dia+" de Mayo");
                    	}
                }else if((dia>=21 && mes==5 || dia<20 && mes==6)) {
                	lblZig.setText("Geminis");
                	if(mes==5) {
                    	lblFec.setText(dia+" de Mayo");
                    	}
                    	if(mes==6) {
                        	lblFec.setText(dia+" de Junio");
                    	}
                }else if((dia>=21 && mes==6 || dia<22 && mes==7)) {
                	lblZig.setText("Cancer");
                	if(mes==6) {
                    	lblFec.setText(dia+" de Junio");
                    	}
                    	if(mes==7) {
                        	lblFec.setText(dia+" de Julio");
                    	}
                }else if((dia>=23 && mes==7 || dia<22 && mes==8)) {
                	lblZig.setText("Leo");
                	if(mes==7) {
                    	lblFec.setText(dia+" de Julio");
                    	}
                    	if(mes==8) {
                        	lblFec.setText(dia+" de Agosto");
                    	}
                }else if((dia>=23 && mes==8 || dia<22 && mes==9)) {
                	lblZig.setText("Virgo");
                	if(mes==8) {
                    	lblFec.setText(dia+" de Agosto");
                    	}
                    	if(mes==9) {
                        	lblFec.setText(dia+" de Septimebre");
                    	}
                }else if((dia>=23 && mes==9 || dia<22 && mes==10)) {
                	lblZig.setText("Libra");
                	if(mes==9) {
                    	lblFec.setText(dia+" de Septimebre");
                    	}
                    	if(mes==10) {
                        	lblFec.setText(dia+" de Octubre");
                    	}
                }else if((dia>=23 && mes==10 || dia<21 && mes==11)) {
                	lblZig.setText("Escorpio");
                	if(mes==10) {
                    	lblFec.setText(dia+" de Octubre");
                    	}
                    	if(mes==11) {
                        	lblFec.setText(dia+" de Noviembre");
                    	}
                }else if((dia>=22 && mes==11 || dia<21 && mes==12)) {
                	lblZig.setText("Sagitario");
                	if(mes==11) {
                    	lblFec.setText(dia+" de NOVIEMBRE");
                    	}
                    	if(mes==12) {
                        	lblFec.setText(dia+" de Diciembre");
                    	}
                }else if((dia>=22 && mes==12 || dia<19 && mes==1)) {
                	lblZig.setText("Capricornio");
                	if(mes==12) {
                    	lblFec.setText(dia+" de Diciembre");
                    	}
                    	if(mes==1) {
                        	lblFec.setText(dia+" de Enero");
                    	}
                }else if((dia>=20 && mes==1 || dia<18 && mes==2)) {
                	lblZig.setText("Acuario");
                	if(mes==1) {
                    	lblFec.setText(dia+" de Enero");
                    	}
                    	if(mes==2) {
                        	lblFec.setText(dia+" de Febrero");
                    	}
                }else if((dia>=219&& mes==2 || dia<20 && mes==3)) {
                	lblZig.setText("Picis");
                	if(mes==2) {
                    	lblFec.setText(dia+" de Febrero");
                    	}
                    	if(mes==3) {
                        	lblFec.setText(dia+" de Marzo");
                    	}
                }
				}
			}
		});
		btnNewButton.setBounds(24, 112, 89, 23);
		frmZignosZodiacales.getContentPane().add(btnNewButton);
		
		lblZig = new JLabel("Zigno : ");
		lblZig.setBounds(24, 180, 121, 14);
		frmZignosZodiacales.getContentPane().add(lblZig);
		
		lblFec = new JLabel("Fecha : ");
		lblFec.setBounds(24, 213, 121, 14);
		frmZignosZodiacales.getContentPane().add(lblFec);
		
		btnNewButton_1 = new JButton("borrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblZig.setText("Zigno :");
				lblFec.setText("Fecha");
				txtDia.setText("");
				txtMes.setText("");
			}
		});
		btnNewButton_1.setBounds(134, 112, 89, 23);
		frmZignosZodiacales.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(zidiacal.class.getResource("/zignos/horoscopo.png")));
		lblNewLabel_2.setBounds(266, 33, 256, 257);
		frmZignosZodiacales.getContentPane().add(lblNewLabel_2);
	}

}
