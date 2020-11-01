package Hilos;

import javax.swing.JProgressBar;
public class Progreso implements Runnable
{
	private JProgressBar JProgressBar;
	public Progreso(JProgressBar JProgressBar)
	{
		this.JProgressBar = JProgressBar;
	}
	public void run()
	{
		while(!Hilo.blnTerminado)
		{
			JProgressBar.setValue(Hilo.intProgresoHilo);
			JProgressBar.repaint();
			if(Hilo.blnTerminado)
			{
				JProgressBar.setValue(100);
				break;
			}
		}
	}
}
