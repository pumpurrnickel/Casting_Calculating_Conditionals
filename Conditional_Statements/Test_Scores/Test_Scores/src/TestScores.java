import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score between 0 and 100.");
        int test = input.nextInt();

        if (test >= 100) {
            System.out.println("Yeah yeah alright, we got little Einstein over here flexing their perfect score and more.");
        } else if (test >= 90) {
            System.out.println("An 'A'...not bad. But a " + test + " isn't exactly a 100.");
        } else if (test >= 80) {
            System.out.println("Your grade is a 'B', huh? Most people would say that 'B' stands for 'Be better'...and they would be right.");
        } else if (test >= 70) {
            System.out.println("Lots of words start with 'C', like 'calculus' or 'cucumber'...or even phrases like 'Check your answers more often.'");
        } else if (test >= 60) {
            System.out.println("Y'know, a 'D' really isn't that bad. But it's still bad, though.");
        } else if (test >= 50) {
            System.out.println( "That's a pretty big 'F' if I've ever seen one. I always wondered why we skip 'E' for grading. ");
        } else if (test >= 0) {
            System.out.println("It's actually substantially impressive that you managed to get a score that low.");
        } else {
            System.out.println("You probably just entered that in wondering what I'd say about it. Maybe you should enter in the Guinness World Records for 'lowest test score ever recorded in human history' or 'biggest clown since Ronald McDonald'.");
        }

        input.close();
    }
}
