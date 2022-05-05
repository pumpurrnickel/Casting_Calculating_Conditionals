import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String one = input.nextLine();

        System.out.println("Enter another word: ");
        String two = input.nextLine();

        if (one.equals(two)) {
            System.out.println("They're the same word. Imagine that.");
        } else {
            System.out.println("They're different words. What a wonder of the world.");
        }

        input.close();
    }
}
