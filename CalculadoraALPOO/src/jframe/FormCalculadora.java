package jframe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import model.Calculadora;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormCalculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblValor;
	private JLabel lblValor_1;
	private JButton btnSomar;
	private JButton btnSubtrair;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JLabel lblMinhaPrimeiraCalculadora;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCalculadora window = new FormCalculadora();
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
	public FormCalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		Calculadora c = new Calculadora();
		frame = new JFrame();

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(97, 49, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(327, 49, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblValor = new JLabel("Valor 1");
		lblValor.setBounds(42, 52, 48, 14);
		frame.getContentPane().add(lblValor);
		
		lblValor_1 = new JLabel("Valor 2");
		lblValor_1.setBounds(269, 52, 48, 14);
		frame.getContentPane().add(lblValor_1);
		
		btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resultado;
				c.setValor1(Float.parseFloat(textField.getText()));
				c.setValor2(Float.parseFloat(textField_1.getText()));
				c.setOperador("+".charAt(0));
				resultado = String.valueOf(c.Resultado());
				lblNewLabel.setText(resultado);
			}
		});
		btnSomar.setBounds(10, 190, 89, 23);
		frame.getContentPane().add(btnSomar);
		
		btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String resultado;
				c.setValor1(Float.parseFloat(textField.getText()));
				c.setValor2(Float.parseFloat(textField_1.getText()));
				c.setOperador("-".charAt(0));
				resultado = String.valueOf(c.Resultado());
				lblNewLabel.setText(resultado);
			}
		});
		btnSubtrair.setBounds(118, 190, 89, 23);
		frame.getContentPane().add(btnSubtrair);
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String resultado;
				c.setValor1(Float.parseFloat(textField.getText()));
				c.setValor2(Float.parseFloat(textField_1.getText()));
				c.setOperador("*".charAt(0));
				resultado = String.valueOf(c.Resultado());
				lblNewLabel.setText(resultado);
			}
		});
		btnMultiplicar.setBounds(229, 190, 89, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		btnDividir = new JButton("Dividir");
		btnDividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String resultado;
				c.setValor1(Float.parseFloat(textField.getText()));
				c.setValor2(Float.parseFloat(textField_1.getText()));
				c.setOperador("/".charAt(0));
				resultado = String.valueOf(c.Resultado());
				lblNewLabel.setText(resultado);
			}
		});
		btnDividir.setBounds(335, 190, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Resultado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(134, 96, 162, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(42, 11, 96, 35);
		panel.add(lblNewLabel);
		
		lblMinhaPrimeiraCalculadora = new JLabel("Minha Primeira Calculadora!");
		lblMinhaPrimeiraCalculadora.setBounds(152, 11, 165, 14);
		frame.getContentPane().add(lblMinhaPrimeiraCalculadora);
	}

}
