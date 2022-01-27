package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		//Operadores aritméticos 
		//+ - / * %
		int a =10;
		int b =20;
		double c=10;
		
		int sum =a+b;
		System.out.println(sum);
		//Suma
		String str1="El resultado de la suma es: ";
		System.out.println(str1+sum);
		//Resta
		System.out.println("El resultado de la resta: "+ (a-b));
		//Division
		int div=a/b;
		System.out.println("El resultado de la división es: " + div);
		
		double div2= (double)a/b;
		//por lo menos uno de los datos tiene que ser double
		System.out.println("El resultado de la división es: " + div2);
		
		//multiplicación
		double multi=c*a;
		System.out.println("El resultado de la multiplicación es: " + multi);
		
		//modulo
		int modulo=a%b;
		System.out.println("El residuo de la división es: " + modulo);
		
		//Operador de asignación
		int d, e;//Se pueden inicializar variable vacías
		d=5;
		e=6;
		
		System.out.println(d+ " | "+e);
		
		//Operadores de declaración compuesta +=, -=, *=, /=, %=
		//Nos permite simplificar la sintaxis de las operaciones
		
		int f, g;
		f=0;
		g=5;
		
		f+=5;
		System.out.println(f);
		
		//Operadores relacionales <, >, <=, >=, ==, !=
		//Dan como resultado un valor de tipo boolean
		
		int h, i;
		h=15;
		i=25;
		String j="Hola";
		
		System.out.println(h>i);
		System.out.println(i !=h);
		
		//Operador unario ++, --
		//preasignación ++k se le asigna un valor antes de usarse
		//post asignación k++ primero lee el valor y despues le suma 1
		
		int k=0, l=0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		//Jerarquía de operadores
		
		int oper=4+5*6/3;
		System.out.println(oper);
		
		int x=0, y=0;
		int oper2= ++x + y--;
		System.out.println(oper2);
		
		//Operador ternario
		//Es un if..else abreviado, sólo nos permite tomar una decisión
		int edad =19, val=0, val2=1;
		int resu=(edad<=18)? val : val2;
		
		System.out.println(resu);
		
		//Operadores lógicos &&, ||, !
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true||false);
		System.out.println(true&& !false);
		
		
		//Crear un nuevo proyecto llamado NumeroParImpar crear el método main crear una función que evalúe si un número es par o impar (se puede usar el operador ternario) Imprimir en terminal el resultado *extra, investigar cómo usar la clase Scanner en java. 		
		//Uso de scanner, se importa primero
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int num = sc.nextInt();
		System.out.println(num);
	}

}
