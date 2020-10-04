import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String txt;

        System.out.print("Text    : ");
        txt = input.nextLine();
        txt = txt.toUpperCase();

        System.out.print("\n" + txt.substring(txt.length() / 2) + txt.substring(0 , txt.length() / 2 ) + ".");

        input.close();
    }
}