import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, hours;
        double valuePerHour;

        number = sc.nextInt();
        hours = sc.nextInt();
        valuePerHour = sc.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", hours*valuePerHour);

    }
}
