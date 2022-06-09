import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int a, b, c;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        int x, y, z;

        if(a < b && a < c) {
            // a é o menor
            x = a;

            if(b < c){
                y = b;
                z = c;
            } else {
                y = c;
                z = b;
            }
        } else if(b < c && b < a){
            // b é o menor
            x = b;

            if(a < c){
                y = a;
                z = c;
            } else {
                y = c;
                z = a;
            }
        } else {
            // c é o menor
            x = c;

            if(a < b){
                y = a;
                z = b;
            } else {
                y = b;
                z = a;
            }
        }

        System.out.println(x + "\n" + y + "\n" + z + "\n");
        System.out.println(a + "\n" + b + "\n" + c);

    }
}
