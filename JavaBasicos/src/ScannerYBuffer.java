import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero1 = sc.nextInt();
		sc.nextLine(); //Así limpiamos el buffer
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		//Si se pone .next() en vez de nextLine() Java sólo
		//Va a leer hasta que haya un espacio, es decir,
		//si escribo Karla Leon, sólo va a leer Karla
		

		
		System.out.println("Tu nombre es: "+nombre
				+ " y tu número es: "+numero1);
		
		sc.close();//Esto es para cerrar el scanner, una vez que estamos seguros que ya no lo utilizaremos
		
//		System.out.println("Introduce otro número");
//		int numero2 = sc.nextInt();
//
//		//Se utiliza el mismo scanner
//		//no hay necesidad de declararlo más de una vez
//		System.out.println("Número1: " +numero1+ " Número2: "+numero2);
//		
		
		
		
	}
	
	
}
