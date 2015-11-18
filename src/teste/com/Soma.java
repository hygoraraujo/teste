package teste.com;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num1, num2, soma;
		
		System.out.print("Escreva um numero: ");
		
		num1 = scan.nextInt();
		
		System.out.print("Escreva outro numero: ");
		
		num2 = scan.nextInt();
		
		soma = num1+num2;
		
		System.out.print("A soma dos numeros e: "+ soma);
		
		scan.close();
	}

}