public class Loop {

  public static void main(String[] args) {
    
    int estoque = 100; // inicialização
    int objetivo = 20;

    while( estoque != objetivo ){ // condição
      System.out.println("estoque: " + estoque);
      System.out.println("-");
      System.out.println(".");

      // atualização
        estoque = estoque - 1; // diminui um do estoque
    }

    // System.out.println("finish the program");

  }

}