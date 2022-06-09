package application;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double a = sc.nextDouble();
		
		System.out.print("Digite outro numero: ");
		double b = sc.nextDouble();
		
		double prod = a * b;
		
		System.out.println("A soma destes numeros é: " + prod);
		
	}

}
