package application;

public class Programa {

	public static void main(String[] args) {
		
		
		int contador = 0;
		
		while (true) {
			
			if(contador == 10) {
				System.out.println("hora de parar porque contador igul a " + contador);
				break;
			} else {
				System.out.println("pode continuar ... ");
			}
			
			System.out.println("teste #00" + contador);
			contador++;
		}
		
		// System.out.println("fim do programa");
		
		
	}

}
