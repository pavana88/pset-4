import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inches  : ");
        double enteredInches = keyboard.nextDouble();
        keyboard.close();

        int inch = (int) enteredInches;

        int mi = inch / 63360;
        int firstFt = inch - (mi * 63360);

        int ft = firstFt / 12;
        int leftInches = firstFt - (ft * 12);

        System.out.print("\nMiles  : " + mi + "\nFeet   : " + ft + "\nInches : " + leftInches + "\n");
    }
}