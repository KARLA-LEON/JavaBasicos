package metodos;

public class Metodos {
//Método es una función
//atributos de la clase
	int a, b;
	
	//Método void (void significa vacío)
	
	public void sumar() {
	//public es para que sea accesible para otras clases o métodos
		int resultado = a+b;
		System.out.println("El resultado de sumar" +a+ " mas "+b+" es "+resultado);
		
		
	}
	
	//metodo con retorno de valores
	public int sumaConRetorno() {
//		int resultado = a+b;
//		
//		return resultado;
		return a+b;
	}
	
	//argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, int arg2) {
	int c = arg1;
	int d = arg2;
	return c*d;
	
	}
}
