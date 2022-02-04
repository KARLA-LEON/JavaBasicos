//números enteros: 1, 6, 45, 53, 80, 102, 145, 326, 450, 892 
//Crea un programa que use un ciclo que tome los números de arreglo 
//y devuelva la suma total, 
//la suma de los números pares y la suma de los números impares. 

public class ManipularArreglo {
	public static void main(String[] args) {
		
		int enteros[];
		enteros=new int[10];
		enteros[0]=1;
		enteros[1]=6;
		enteros[2]=45;
		enteros[3]=53;
		enteros[4]=80;
		enteros[5]=102;
		enteros[6]=145;
		enteros[7]=326;
		enteros[8]=450;
		enteros[9]=892;	
	
		int sum = 0;
		int sumPar=0;
		int sumImpar=0;
	    for (int i = 0; i < enteros.length; i++) {
	        sum+=enteros[i];
	        if (i%2==0){
	        	sumPar += enteros [i];
	        }else {
	        	sumImpar += enteros [i];
	        }
	        
	    }
	    
		System.out.println("La suma total de los números es: " + sum);
		System.out.println("La suma de los números pares es: " + sumPar);
		System.out.println("La suma de los números impares es: " + sumImpar);
	    
	        
	}
}
