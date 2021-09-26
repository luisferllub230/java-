package tarea1;
import java.util.Date;
import java.util.Scanner;
@SuppressWarnings("unused")
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*---------------------------------------------------------------------------------------------------------*/
		
		//punto 1 declaracion de varias variables 
		
		/*String vstring = "jo1jo1o";
		int vint = 12; 
		float vfloat = 12.22222222222222222222222222222222222f;
		char vchar = 'c';
		double vdouble = 12.22222222222222222222222222222222222f;
		boolean vboolean = true;
		
		System.out.println("variable tipo int: "+vint+"\nvariable tipo float: "+vfloat+"\nvariable tipo double: "+vdouble+
				"\nvariable tipo char: "+vchar+"\nvariable tipo boolean: "+vboolean);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//punto 2 declaracion de constante
		
		/*int constante = 15;
		System.out.println(constante);
		constante += 2; 
		System.out.println(constante);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//declarar un enetero y incrementarolo y decrementarlo.
		
		/*int ventero = 0;
		while(ventero <= 15) {
				ventero += 3;
				System.out.println("jugando con el valor del entero de valor ("+ventero+").\n");
				ventero -= 1;
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Declarar un float con valor=10152466.25. Declara un byte que es igual a 5 + el float. 
		
		/*float vfloat = 10152466.25f;
		byte vbyte = 5;
		vbyte += vfloat;
		System.out.println(vbyte);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Declarar un entero y asignarle un valor. Si el valor < 5 imprimir "Pequeño", si no imprimir "Grande". 
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("digite un numero: ");
		int num = sc.nextInt();
		
		if(num < 5) {
			System.out.println("pequeno");
		}
		else {
			System.out.println("grande");
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Declarar une entero y asignarle un valor. Si el valor = 1 imprimir "no", = 2 imprimir "Dos", =3 
		//imprimir "3", si no imprimir "Ni uno, ni dos, ni tres". 
		
		/*System.out.println("digite un numero del uno al 3: ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3: System.out.println("3"); break;
			default: System.out.println("ni uno, ni dos, ni tres....");
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Declarar un entero = 0. Mientras el entero <5, imprimir su valor y incrementarlo de 1
		
		/*int entero = 0;
		while(entero < 5) {
			System.out.println(entero);
			entero += 1;
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Declarar un entero = 10. Mientras el entero >5, imprimir su valor y decrementarlo de 1, pero imprime por lo menos una vez su valor.
		
		/*int entero = 10;
		int contador = 1;
		do {
			if(contador == 1) {System.out.println(entero);}
			contador -= 1;
			entero -= 1;
		}while(entero > 5);
		System.out.println("entero fuera de bucle: "+entero);*/
	
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Crear un bucle que se ejecuta 10 veces utilizando un entero que va de 10 a 19
		//incrementándose en 1. Imprimir en cada bucle el valor del entero, menos cuando es igual a 15.
		
		/*for(int i=10;i<20;i++) {
			if (i != 15) {System.out.println(i);}
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Pedir dos números y decir si son iguales o no.
		
		/*System.out.println("ingresa el primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("ingresa el segundo numero: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {System.out.println("el numero ("+num1+") es igaul al numero ("+num2+")");}
		else {System.out.println("los numeros no son iguales");}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien usando un switch
		
		/*int nota = sc.nextInt();
		
		switch(nota) {
		case 7:System.out.println("suficiente"); break;
		case 8:System.out.println("suficiente"); break;
		case 9:System.out.println("bien"); break;
		case 10: System.out.println("bien"); break;
		default: if(nota >= 6) {System.out.println("insuficiente");} break;
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//13.	Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
		/*double elevado = 0;
		double num = 0;
		
		do{
			System.out.println("ingresa un  numero: ");
			num = sc.nextInt();
			elevado = Math.pow(num, 2);
			System.out.println(elevado);
		}while(num >= 0);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. 
		//Usando solo uno de los bucles mostrados en clase
		
		/*int num = 0;
		int suma = 0;
		num = sc.nextInt();
		while(num != 0) {
			suma += num;
			num = sc.nextInt();
		}
		System.out.println(suma);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Pedir 15 números y escribir la suma total.  Usando solo uno de los bucles mostrados en clase
		
		/*int num = 0;
		int suma = 0;
		int contador = 1;
		//num = sc.nextInt();
		while(contador <= 15) {
			num = sc.nextInt();
			contador += 1;
			suma += num;
		}
		System.out.println(suma);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//16.	Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
		
		/*int num = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" x "+num+" = "+(i*num));
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Determinar a cuánto es igual la suma de los elementos de la serie de Fibonacci entre 0 y 100. 
		
		 /*int numero = 12,fibo1 = 1,fibo2 = 1, sum = 0;
		  
		 System.out.print(fibo1 + " ");
	     for(int i=2;i<=numero;i++){
	    	 System.out.print(fibo2 + " ");
	         fibo2 = fibo1 + fibo2;
	         fibo1 = fibo2 - fibo1;
	         sum += fibo2;
	     }
	     System.out.println("\n"+sum);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Determinar a cuánto es igual el promedio entero de los elementos de la serie de Fibonacci entre 0 y 1000. 
		
		/*int numero = 26,fibo1 = 1,fibo2 = 1, sum = 0, promedio = 0;
		
		 System.out.print(fibo1 + " ");
	     for(int i=2;i<=numero;i++){
	    	 System.out.print(fibo2 + " ");
	         fibo2 = fibo1 + fibo2;
	         fibo1 = fibo2 - fibo1;
	         sum += fibo2;
	     }
	     promedio = sum / numero; 
	     System.out.print(" contador:  "+ promedio);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000. 
		
		/*int numero = 26,fibo1 = 1,fibo2 = 1, sum = 0, promedio = 0, contador = 0;
		
	     for(int i=2;i<=numero;i++){
	    	 System.out.print(fibo2 + " ");
	         fibo2 = fibo1 + fibo2;
	         fibo1 = fibo2 - fibo1;
	         sum += fibo2;
	         if (fibo2 > 1000 && fibo2 < 2000) {contador += 1;}
	     }
	     promedio = sum / numero; 
	     System.out.print("elementos entre 1000 y 2000:  "+ contador);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Leer un número y calcularle su factorial.
		
		/*int factorial = 1, num = 5;
		
		for(int i = 1; i<=num; i++) {factorial *= i;}
		
		System.out.println("el factorial de "+num+" es: "+factorial);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Leer un número y calcularles la factorial a todos los enteros comprendidos entre 1 y el número leído.
		/*int factorial = 1, num, almacen = 1;
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++, almacen++) {
			factorial = 1;
			for(int j = 1; j <= almacen; j++) {
				factorial *= j;
			}
			System.out.println("factorial de "+almacen+"/"+num+" es:"+factorial);
		}*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Leer un número entero y calcular el promedio entero de las factoriales de los enteros comprendidos entre 1 y el número leído. 
		
		/*int factorial = 1, num, almacen = 1, promedio = 0;
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++, almacen++) {
			factorial = 1;
			for(int j = 1; j <= almacen; j++) {
				factorial *= j;
			}
			System.out.println("factorial de "+almacen+"/"+num+" es:"+factorial);
			promedio += factorial; 
		}
		promedio /= num;
		System.out.println("\nel promedio es: "+promedio);*/
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		//Leer un número entero y calcular a cuánto es igual la sumatoria de 
		//todas las factoriales de los números comprendidos entre 1 y el número leído. 
		
		/*int factorial = 1, num, almacen = 1, sumatoria = 0;
		num = sc.nextInt();
		
		for(int i = 1; i<=num; i++, almacen++) {
			factorial = 1;
			for(int j = 1; j <= almacen; j++) {
				factorial *= j;
			}
			System.out.println("factorial de "+almacen+"/"+num+" es:"+factorial);
			sumatoria += factorial; 
		}
		System.out.println("\nel promedio es: "+sumatoria);*/
		
		//Asignación de fecha a la variable Fecha 
	    Date Fecha= new Date();
	    /*En esta parte se esta presentando la informacion por pantalla*/
	    System.out.println(Fecha);
	}
}
