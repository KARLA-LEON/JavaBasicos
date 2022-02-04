import java.util.Scanner;

public class EstructuraDeControlSwitch {

	//Sirve par controla el flujo de comportamiento de un programa, para posterior
	//toma de decisiones
	
	/*
	 switch(condición a evaluar){
	 case "valor":
	 	código a ejecutar
	 	break
	 	...
	 	case "n":
	 	código a ejecutar
	 	break
	 	default:
	 	código a ejecutar
	 	}
	 	
	 */
	
	//Solicitar al usuario un día de la semana y mostrar un mensaje
	
	public static void main(String[] args) {
	
		System.out.println("Escribe un día de la semana y tendrás un bonito mensaje motivacional.");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un café.");
			break;
			
		case "martes":
			System.out.println("Lunes chiquito.Esto está cansado, pero ya casi, tú puedes.");
			break;
			
		case "miercoles":
			System.out.println("Miércoles, pero a qué costo.");
			break;
			
		case "jueves":
			System.out.println("Juebebes con sed de la mala.");
			break;
			
		case "viernes":
			System.out.println("Lo lograste, ya es viernes. Vamos por una pizzita, te lo mereces.");
			break;
			
		case "sabado":
		case "domingo":
			System.out.println("Fin de semana, listo para comenzar de nuevo?");
			break;
					
			default:
				System.out.println("Ay no te entiendo, sorry.");
			
		
		}
	}
}
