import java.util.Scanner;

/* * Pedir al usuario 2 números por consola y preguntarle 
 * que desea realizar 
 * * 1) Suma * 2) Resta * 3) División * 4) Multiplicación * 
 * * y despues imprimir el resultado */ 
public class CalculadoraSwitch {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n1=0, n2= 0, r=0, opcion= sc.nextInt();
	System.out.println("Elije la operación a realizar escribiendo el número correspondiente: (1 para suma, 2 para resta, 3 para multiplicación, 4 para división)");

	opcion= sc.nextInt();
	
	if(opcion >= 1 && opcion <= 4){ 
		

		System.out.print("Ingresa el primer número para la operación: ");

		n1 = sc.nextInt();


		System.out.print("Ingresa el segundo número para la operación: ");

		n2 = sc.nextInt();
		
			switch(opcion){ 

			case 1:
				r = n1 + n2;
				System.out.println("El resultado de la suma es: " + r);
				break;

			case 2:
				r = n1 - n2;
				System.out.println("El resultado de la resta es: " + r);
				break;

			case 3:
				r = n1 * n2;
				System.out.println("El resultado de la multiplicacion es: " + r);
				break;

			case 4:
				r = n1 / n2;
				System.out.println("El resultado de la division es: " + r);
				break;

				
			default:
				System.out.println("Debes elegir una operación válida con un número del 1 al 4");
				break;

			}
			
			
		} 


	}
	
		
}


