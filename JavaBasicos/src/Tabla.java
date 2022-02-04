import java.util.Scanner;
public class Tabla {

	public static void main(String[] args) { 
		
		Scanner console = new Scanner(System.in); 
		int num; 
		System.out.print("Ingresa cualquier número positivo: "); 
		num = console.nextInt(); 
		System.out.println("Tabla de multiplicar de " + num); 
		console.close();
		
		int i=0;
		while (i<10) {
			i++;
			
			int tabla= num*i;
			System.out.println( num + " por " +i+ " es igual a " +tabla);
		}
//		Implementa un bucle while que imprima el resultado } 
//		} 3.- Debe imprimir la tabla de multiplicar del número 
//		en cuestión (solo los primeros 10 números
		
		
		}
	}

