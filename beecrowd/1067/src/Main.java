import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int iterator = 1;
        
        while( iterator <= n ){ // enquanto
            System.out.println(iterator);
            iterator += 2;
        }

    }
}
