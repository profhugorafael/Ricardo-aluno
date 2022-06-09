package application;

import entities.Quadrilatero;

public class Program {

	public static void main(String[] args) {
		
		Quadrilatero quad = new Quadrilatero(1, 2, 4, 3); 
		Quadrilatero quad2 = new Quadrilatero(2, 4);
		Quadrilatero quad3 = new Quadrilatero(3);
	
		System.out.println(quad);
		System.out.println(quad2);
		System.out.println(quad3);
		
	}
	
}
