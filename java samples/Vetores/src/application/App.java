package application;

public class App {

	public static void main(String[] args) {
		
		int tamanho = 5;
		int[] numeros = {11, 23, 34, 57, 82};
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(numeros[i]);
		}
		
		int tamanho2 = 1000;
		int[] vetor = new int[1000];
		
		for(int pos = 0; pos < tamanho2; pos++) {
			vetor[pos] = pos + 1;
		}
		
		for(int pos = 0; pos < tamanho2; pos++) {
			System.out.println("Vetor[" + pos + "] = " + vetor[pos]);
		}
		
	}

}
