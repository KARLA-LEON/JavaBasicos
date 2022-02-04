import java.util.Scanner;

public class DeletreaNombre {
	
		public static void main(String [] args){
			String name = "pipiripao";
			Scanner sc = new Scanner(System.in);
			System.out.print("Escribe tu nombre"); 
			name = sc.nextLine();
			

			for (int i = 0; i < name.length(); i++){
			    char c = name.charAt(i);  
			    System.out.println(c);
			}   	
	}
}
