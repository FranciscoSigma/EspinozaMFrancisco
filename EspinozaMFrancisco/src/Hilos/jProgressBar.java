package Hilos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class jProgressBar {

	private JFrame frame;
	JProgressBar psbProceso1 = new JProgressBar();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jProgressBar window = new jProgressBar();
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
	public jProgressBar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 107);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		psbProceso1.setBounds(190, 26, 193, 21);
		frame.getContentPane().add(psbProceso1);
		
		JButton btnIniciarProcesos = new JButton("Iniciar hilos");
		btnIniciarProcesos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hilo objHilo1 = new Hilo("Hilo 1");
				Thread varHilo1 = new Thread(objHilo1);
				
				Progreso objHilo2 = new Progreso(psbProceso1);
				Thread varHilo2 = new Thread(objHilo2);
				
				varHilo1.start();
				varHilo2.start();
			}
		});
		btnIniciarProcesos.setBounds(10, 24, 112, 23);
		frame.getContentPane().add(btnIniciarProcesos);
	}
	
}
