
public class Ciclos {

	public static void main(String[] args) {
	
//	int control=0;
//	while (control<10) {
//		System.out.println("Control= "+control);
//		control++;
//	}
//		
	
//		int control=3;
//
//		//Si queremos que algo se ejecute al menos una vez aunque no se cumpla la condición
//		do {
//			System.out.println("Control= "+control);
//			//código a ejecutar
//			control++;
//			
//		}while(control<3);
		
		
		
//		for(int i=0; i<3; i++) {
//			System.out.println("Control= "+ i);
////la variable de control sólo es local, sólo vive dentro del for
//			
//		}
		
		
//		//break & continue
//		for (int i=0; i<10; i++) {
//			if(i% 2==0) {
//				System.out.println("Control= "+ i);
//				break;//termina el ciclo, solo se ejecuta una vez lo anterior 
//			}
//		}
		
		for (int i=0; i<10; i++) {
			if(i% 2==0) {
				continue;//Permite omitir una ejecución del ciclo
				//pero deja que continue el ciclo
			}
		System.out.println("Control= "+ i);

		}
	}
	
}
