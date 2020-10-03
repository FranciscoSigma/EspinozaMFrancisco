package FibonacciSwing;

public class Fibonacci {
	
	public int[] CrearSerie(int intValor1, int intValor2, int intIterador)
	{
		int[] arregloRespuestas = new int[intIterador];
		int intAuxiliar;
		for(int x = 0; x<intIterador; x++)
		{
			arregloRespuestas[x] = intValor1;
			intAuxiliar = intValor1 + intValor2;
			intValor1 = intValor2;
			intValor2 = intAuxiliar;
		}
		return arregloRespuestas;
	}

}
