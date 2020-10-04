import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Name   : ");
        String fName = input.nextLine();
        System.out.print("Middle Name  : ");
        String mName = input.nextLine();
        System.out.print("Last Name    : ");
        String lName = input.nextLine();

        String fInitial = fName.substring(0, 1);
        String mInitial = mName.substring(0, 1);
        String lInitial = lName.substring(0, 1);

        String complInitials = (fInitial + mInitial + lInitial).toUpperCase();

        input.close();

        System.out.print("\n");
        System.out.print(complInitials + ".");

    }
}