package taller1;

import java.util.Scanner;

public class AplMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el numero 1 para el requerimiento 1 : ");

		int numero1Rec1 = sc.nextInt();

		System.out.println("Ingrese el numero 2 para el requerimiento 1( debe ser diferente de 0 ) : ");
		int numero2Rec1 = sc.nextInt();
if(numero2Rec1 !=0) {
		System.out.println("\n");
		// Requerimiento1
		System.out.println("Requerimiento 1: ");
		Requerimiento1 calculadora = new Requerimiento1(numero1Rec1, numero2Rec1);
		System.out.println("la suma de " + numero1Rec1 + " y de " + numero2Rec1 + " es = " + calculadora.sumar());
		System.out.println("la resta de " + numero1Rec1 + " y de " + numero2Rec1 + " es = " + calculadora.restar());
		System.out.println(
				"la multiplicacion de " + numero1Rec1 + " y de " + numero2Rec1 + " es = " + calculadora.multiplicar());
		System.out
				.println("la division de  " + numero1Rec1 + " y de " + numero2Rec1 + " es = " + calculadora.dividir());
		System.out.println("El modulo de " + numero1Rec1 + " y de " + numero2Rec1 + " es = " + calculadora.modulo());

		// Requerimiento2
		System.out.println("\n");
		System.out.println("Requerimiento 2: ");
		System.out.println("Ingrese el numero 1 para el requerimiento 2 : ");
		int numero1Rec2 = sc.nextInt();
		System.out.println("Ingrese el numero 2 para el requerimiento 2 : ");
		int numero2Rec2 = sc.nextInt();
		System.out.println("Ingrese el numero 3 para el requerimiento 2 : ");
		int numero3Rec2 = sc.nextInt();

		Requerimiento2 ordenNumeros = new Requerimiento2(numero1Rec2, numero2Rec2, numero3Rec2);
		System.out.println("El numero mayor es : " + ordenNumeros.mayor() + ", el numero del medio es : "
				+ ordenNumeros.medio() + " y el numero menor es : " + ordenNumeros.menor());
}else {
	System.out.println("No es posible dividir entre cero");
}
		// Requerimiento3
		System.out.println("\n");
		System.out.println("Requerimiento 3: ");
		System.out.println("Ingrese el numero 1 para el requerimiento 3 : ");
		int numero1Rec3 = sc.nextInt();
		if (numero1Rec3 > 9 && numero1Rec3 < 100) {

			Requerimiento3 numeroInvertido = new Requerimiento3(numero1Rec3);
			System.out.println("El numero " + numero1Rec3 + " y su inverso es  " + numeroInvertido.invertir());

		} else {
			System.out.println(numero1Rec3 + " no es un numero de dos digitos");
		}
		// Requerimiento4
		System.out.println("\n");
		System.out.println("Requerimiento 4: ");
		System.out.println("Ingrese el numero 1 para el requerimiento 4 : ");
		int numero1Rec4 = sc.nextInt();
		Requerimiento4 valorNumero = new Requerimiento4(numero1Rec4);
		System.out.println("El numero " + numero1Rec4 + " es  " + valorNumero.positivoCero());

		// Requerimiento5
		System.out.println("\n");
		System.out.println("Requerimiento 5: ");
		System.out.println("Ingrese el numero 1 para el requerimiento 5 : ");
		int numero1Rec5 = sc.nextInt();
		Requerimiento5 parImpar = new Requerimiento5(numero1Rec5);
		System.out.println("El numero " + numero1Rec5 + " es  " + parImpar.parCero());

	}

}
