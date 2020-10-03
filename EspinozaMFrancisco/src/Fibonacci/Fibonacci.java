package Fibonacci;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String arg[])
	{
		int intAnterior = 0, intSiguiente = 1, intAuxiliar = 0,  x = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de elementos de la serie de fibonacci");
		int intElementos = entrada.nextInt();
		do
		{
			System.out.print(intAnterior + ", ");
			intAuxiliar = intAnterior + intSiguiente;			
			intAnterior = intSiguiente;
			intSiguiente = intAuxiliar;		
			x++;
		}while(x <= intElementos);
	}
}
