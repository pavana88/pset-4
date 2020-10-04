import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Diameter  : ");
        double d = input.nextDouble();

        input.close();

        double r = d / 2;
        double a = Math.PI * Math.pow(r, 2);
        double c = Math.PI * d;

        System.out.print("\n");
        System.out.print("Area           : ");
        System.out.printf("%.2f", a);
        System.out.print("\n");
        System.out.print("Circumference  : ");
        System.out.printf("%.2f", c);

    }
}
