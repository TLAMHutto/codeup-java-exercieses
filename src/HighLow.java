import java.util.Scanner;

public class HighLow {
    public static int randomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return randomNumber;
    }
    public static int userGuess(int input) {
        int randomNumber = randomNumber(1, 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number that is between 1 and 100");

        while (true) {

            int userInput = scanner.nextInt();
            if (userInput > randomNumber) {
                System.out.println("Too high!");
            } else if (userInput < randomNumber) {
                System.out.println("Too low!");
            } else if (userInput == randomNumber) {
                System.out.println("You got it!");
                break;
            }
        }
        return userGuess(input);
    }
    public static void main (String[] args) {

        userGuess(0);
    }
}
