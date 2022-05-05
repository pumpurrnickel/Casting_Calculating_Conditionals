import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numbOne = input.nextInt();

        System.out.println("Enter another number: ");
        int numbTwo = input.nextInt();

        System.out.println(numbOne + " + " + numbTwo + " = " + (numbOne + numbTwo)); // Addition
        System.out.println(numbOne + " - " + numbTwo + " = " + (numbOne - numbTwo)); // Subtraction
        System.out.println(numbOne + " * " + numbTwo + " = " + (numbOne * numbTwo)); //Multiplication

        System.out.println(numbOne + " / " + numbTwo + " = " + ((double)numbOne / (double)numbTwo)); // Division

        System.out.println(numbOne + " % " + numbTwo + " = " + (numbOne % numbTwo)); // Modulus

        input.close();
    }
}
