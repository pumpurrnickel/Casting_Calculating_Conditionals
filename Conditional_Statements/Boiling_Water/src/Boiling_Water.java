import java.util.Scanner;

public class Boiling_Water {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number greater than 212: ");
        int numb = input.nextInt();

        if (numb > 212) {
            System.out.println("Water is boiling");
        } else {
            System.out.println("...I said to enter a number greater than 212 :/");
        }

        input.close();
    }
}
