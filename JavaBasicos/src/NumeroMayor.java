import java.util.Scanner;

	public class NumeroMayor{
	
	/*public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int cantNum;

    int num;

    int mayor=0;

    int contador;

 

    System.out.println("Inserte la cantidad de números a evaluar: ");

    cantNum = sc.nextInt();

 

    for(contador = 0;contador < cantNum;contador++ ){

        System.out.println("Inserte un número: ");

        num = sc.nextInt();

        if(num>mayor)

        {

            mayor=num;

        }

    }

    System.out.println("El número más grande es "+mayor);

	}
}
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num1, num2, num3;
        
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        num3 = sc.nextInt();
        	if (num1 > num2 && num1>num3 ) {
                System.out.println("El mayor es: " + num1);                                             
            } else if(num2>num1 && num2>num3) {
                System.out.println("el mayor es: " + num2);     
            
            } else {
            	System.out.println("el mayor es: " + num3);
            }
    	}
	}
