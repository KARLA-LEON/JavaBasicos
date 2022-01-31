import java.util.Scanner;

public class EjercicioTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a1,a2,a3, total;
		
		System.out.println("Introduce el valor del primer ángulo:");
		a1=sc.nextInt();
		System.out.println("Introduce el valor del segundo ángulo:");
		a2=sc.nextInt();
		System.out.println("Introduce el valor del tercer ángulo:");
		a3=sc.nextInt();
		
			if(a1+a2+a3==180) {
				System.out.println("Los ángulos suman 180, es un triángulo");
			}else {
				total=a1+a2+a3;
				System.out.println("Lon ángulos suman " + total + " por lo tanto no es un triángulo.");
			}
	}

}
