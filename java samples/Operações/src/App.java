public class App {
    public static void main(String[] args) throws Exception {
        
        double a = 10.0, b = 3.0;

        double divi = a/b;
        double soma = a+b;
        double prod = a*b;
        double dife = a-b;

        System.out.println("A soma vale: " + soma);
        System.out.println("A diferença vale: " + dife);
        System.out.println("O produto vale: " + prod);
        System.out.println("A divisão vale: " + divi);

        System.out.println("O produto da soma pela difereça vale: " + soma*dife);

    }
}
