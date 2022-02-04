package metodos;

public class PruebaMetodos {
	
	public static void main(String[] args) {
		//crear un nuevo objeto que va a contener los métodos y atributos
		Metodos metodoPrueba = new Metodos(); //aqui creamos el objeto
		
		metodoPrueba.a=10;
		metodoPrueba.b=26;
		
//		metodoPrueba.sumar();//se invoca el método void
//		
//		metodoPrueba.sumaConRetorno();//metodo con retorno
		
		//este tipo de metodos se pueden almacenar en una variable
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(resultadoSuma);//metodo con retorno
		
		//metodo con argumentos
		double multiplicacion = metodoPrueba.multiplicarConArgumentos(40, 20);
		System.out.println(multiplicacion);
	}

}
