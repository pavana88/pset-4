import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length : ");
        double l = input.nextDouble();
        System.out.print("Width : ");
        double w = input.nextDouble();
        System.out.print("Diameter : ");
        double d = input.nextDouble();

        double bArea = l * w;
        double hArea = Math.PI * Math.pow(d/2 , 2);
        double fullArea = bArea - hArea;


        System.out.printf("%n%-13s: %,.2f", "Surface Area", fullArea);


    }
}
