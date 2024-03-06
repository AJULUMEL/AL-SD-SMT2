import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;
        int totalVotes = 0;

        while (true) {
            System.out.println("Enter your vote:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.println("4. Stop voting");

            int vote = scanner.nextInt();
            totalVotes++;

            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else if (vote == 3) {
                candidate3++;
            } else if (vote == 4) {
                break;
            } else {
                System.out.println("Invalid vote.");
            }
        }

        System.out.println("Total votes: " + totalVotes);
        System.out.println("Candidate 1: " + candidate1 + " votes (" + (candidate1 * 100.0 / totalVotes) + "%)");
        System.out.println("Candidate 2: " + candidate2 + " votes (" + (candidate2 * 100.0 / totalVotes) + "%)");
        System.out.println("Candidate 3: " + candidate3 + " votes (" + (candidate3 * 100.0 / totalVotes) + "%)");
    }
}