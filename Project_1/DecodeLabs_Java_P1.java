import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("************************************");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("************************************");

        while (playAgain) {

            int targetNumber = random.nextInt(100) + 1;

            int attempts = 0;
            int score = 100;
            boolean guessedCorrectly = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("Try to guess it!");

            while (!guessedCorrectly) {

                try {

                    System.out.print("\nEnter your guess: ");
                    int guess = sc.nextInt();

                    attempts++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("Please enter a number between 1 and 100.");
                        continue;
                    }

                    if (guess > targetNumber) {
                        System.out.println("Too High!");
                        score -= 5;
                    }
                    else if (guess < targetNumber) {
                        System.out.println("Too Low!");
                        score -= 5;
                    }
                    else {

                        guessedCorrectly = true;

                        if (score < 0) {
                            score = 0;
                        }

                        System.out.println("\n***********************************");
                        System.out.println("Congratulations!");
                        System.out.println("You guessed the correct number.");
                        System.out.println("Target Number : " + targetNumber);
                        System.out.println("Attempts      : " + attempts);
                        System.out.println("Final Score   : " + score);
                        System.out.println("***********************************");
                    }

                }
                catch (InputMismatchException e) {

                    System.out.println("Invalid input!");
                    System.out.println("Please enter a valid integer.");

                    sc.next();
                }
            }

            String choice;

            while (true) {

                System.out.print("\nDo you want to play again? (Y/N): ");
                choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    playAgain = true;
                    break;
                }
                else if (choice.equalsIgnoreCase("N")) {
                    playAgain = false;
                    break;
                }
                else {
                    System.out.println("Please enter only Y or N.");
                }
            }
        }

        System.out.println("\nThank you for playing!");
        System.out.println("Program terminated successfully.");

        sc.close();
    }
}