package FibonacciSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class miVentanita extends JFrame {

	private JPanel contentPane;
	private JTextField txtVariable1;
	private JTextField txtVariable2;
	private JTextField txtIterador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					miVentanita frame = new miVentanita();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public miVentanita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 162);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor 1:");
		lblNewLabel.setFont(new Font("Open Sans", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor 2:");
		lblValor.setFont(new Font("Open Sans", Font.BOLD, 12));
		lblValor.setBounds(10, 37, 61, 14);
		contentPane.add(lblValor);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setFont(new Font("Open Sans", Font.BOLD, 12));
		lblIteraciones.setBounds(10, 68, 77, 14);
		contentPane.add(lblIteraciones);
		
		txtVariable1 = new JTextField();
		txtVariable1.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtVariable1.setForeground(Color.WHITE);
		txtVariable1.setBackground(Color.DARK_GRAY);
		txtVariable1.setBounds(106, 9, 86, 20);
		contentPane.add(txtVariable1);
		txtVariable1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(106, 27, 86, -16);
		contentPane.add(separator);
		
		txtVariable2 = new JTextField();
		txtVariable2.setForeground(Color.WHITE);
		txtVariable2.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtVariable2.setColumns(10);
		txtVariable2.setBackground(Color.DARK_GRAY);
		txtVariable2.setBounds(106, 35, 86, 20);
		contentPane.add(txtVariable2);
		
		txtIterador = new JTextField();
		txtIterador.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtIterador.setForeground(Color.WHITE);
		txtIterador.setColumns(10);
		txtIterador.setBackground(Color.DARK_GRAY);
		txtIterador.setBounds(106, 66, 86, 20);
		contentPane.add(txtIterador);
		JComboBox cboResultado = new JComboBox();
		cboResultado.setBounds(216, 66, 96, 20);
		contentPane.add(cboResultado);
		
		JButton btnCapturar = new JButton("Crear serie");
		btnCapturar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cboResultado.removeAllItems();				
				Fibonacci miSerie = new Fibonacci();
				int intIterador, intValor1, intValor2;
				intIterador = Integer.parseInt(txtIterador.getText());
				intValor1 = Integer.parseInt(txtVariable1.getText());
				intValor2 = Integer.parseInt(txtVariable2.getText());
				int[] intRespuestas = new int[intIterador];
				intRespuestas = miSerie.CrearSerie(intValor1, intValor2, intIterador);
				
				for(int x =0; x< intIterador; x++)
				{
					cboResultado.addItem(intRespuestas[x]);
				}
				txtVariable1.setText(null);
				txtVariable2.setText(null);
				txtIterador.setText(null);
			}
		});
		btnCapturar.setBounds(216, 17, 110, 34);
		contentPane.add(btnCapturar);
		

	}
}
