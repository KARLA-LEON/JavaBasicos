
public class Arrays {
	public static void main(String[] args) {
		//Sólo un tipo de dato
		//Especificar el tamaño o cantidad de elementos que contendrá
		//Método#1
		int numeros[];//Aquí creamos la variable
		numeros=new int[4];//Aqui estamos creando el arreglo y especificando su longitud
		numeros[0]=10;
		numeros[1]=8;
		numeros[2]=100;
		numeros[3]=200;
		//Los arreglos en java no se pueden modificar una vez que se especificaron
		
		
		System.out.println(numeros[2]);
		
		//para que nos devuelva los elementos del array
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Elemento de números " +numeros[i]);
		}
		
		
		
		//Método#2
		String[] nombres=new String[4];//Se basa en cero, y 4 es el número de elementos
		nombres[0]="Juan";
		nombres[1]="Paco";
		nombres[2]="Pedro";
		nombres[3]="Mar";
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Elemento de nombres " +nombres[i]);
		}
		
		//Método#3 Array literal
		String []nombreFrutas = new String[] {"Manzana", "Plátano", "Uva", "Pera"};
		//Desde el inicio se especifican sus elementos
		
		for(int i=0; i<nombreFrutas.length; i++) {
			System.out.println("Nombres de frutas " +nombreFrutas[i]);
		}
	}
}
