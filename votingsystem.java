import java.util.Scanner;

public class votingsystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, ballot, count[] = new int[6];
        char ch;

        for (i = 1; i <= 5; i++) {
            count[i] = 0;
        }

        do {
            System.out.print("\nEnter the ballot number: ");
            ballot = scanner.nextInt();

            switch (ballot) {
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                default:
                    count[0]++;
            }

            System.out.print("\nWant to vote again? (y/n): ");
            ch = scanner.next().charAt(0);
        } while (ch == 'y');

        for (i = 1; i <= 5; i++) {
            System.out.println("No. of votes for candidate " + i + " = " + count[i]);
        }

        System.out.println("Spoilt ballots are " + count[0]);

        scanner.close();
    }
}

