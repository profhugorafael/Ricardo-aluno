package application;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[10];
		
		// preencho as posições através do Scanner
		for(int i = 0; i < 10; i++) {
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Apresentando os valores do vetor: ");
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] <= 0) {
				vetor[i] = 1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Vetor[" + i + "] = " + vetor[i]);
		}
		
	}

}
