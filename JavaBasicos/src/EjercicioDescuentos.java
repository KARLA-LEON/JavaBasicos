import java.util.Scanner;

// solicitar el total de una compra por consola. 
// si la cuenta es de menos de 1000 
// sila cuenta es de 1001 - 4999 10% 
// si la cuenta es de 5001 a 9999 20% 
// si la copra es de 10000 o más 30% 
public class EjercicioDescuentos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double descuento=0;
		double total=0;
		double compra=0;

		System.out.println("Introduzca el monto de su compra");
		compra= sc.nextDouble();
		System.out.println("Su compra es de: "+ compra);

		if(compra>=1000 && compra<=4999){
		descuento=compra*0.10;
		}else if (compra>=5000 && compra<=9999){
			descuento=compra*0.20;
		}else if(compra>=10000){
		descuento=compra*0.30;
		}else {
			System.out.println("Necesitas comprar al menos 1000 pesos para obtener un descuento");
		}
		
		System.out.println ("El descuento es de: " + descuento);
		
		total= compra-descuento;
		System.out.println ("El total de su compra con descuento es de: " + total);
		} 

}

