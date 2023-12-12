import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n= 0, k = 1;
        char ch;
        int nom = 1 + random.nextInt(1000);

        System.out.println("I have a number between 1 and 1000.");
        System.out.println("Can you guess my number?");
        System.out.println("Please type your first guess.");

        n = scanner.nextInt();

        while (k == 1) {
            if (nom == n) {
                System.out.println("Excellent! You guessed the number!");
                System.out.println("Would you like to play again (y or n)?");
                ch = scanner.next().charAt(0);
                if (ch == 'y') {
                    k = 1;
                    System.out.println("Please type your guess.");
                    n = scanner.nextInt();
                } else {
                    k = 0;
                    break;
                }
            } else if (n > nom) {
                System.out.println("Guess a smaller number!");
                n = scanner.nextInt();
            } else {
                System.out.println("Guess a greater number!");
                n = scanner.nextInt();
            }
        }
        scanner.close();
    }
}
