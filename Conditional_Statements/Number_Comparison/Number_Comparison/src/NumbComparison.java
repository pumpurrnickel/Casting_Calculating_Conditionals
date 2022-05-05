import java.util.Scanner;

public class NumbComparison {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numbOne = input.nextInt();

        System.out.println("Enter another number: ");
        int numbTwo = input.nextInt();

        if (numbOne > numbTwo) {
            System.out.println(numbOne + " is greater than " + numbTwo);
        } else if (numbOne == numbTwo) {
            System.out.println("Both numbers are equal.");
        } else {
            System.out.println(numbOne + " is less than " + numbTwo);
        }

        input.close();
    }
}
