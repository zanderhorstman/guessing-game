import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {


        Scanner keybd = new Scanner(System.in);
        int num, guess;

        Random randomNumber = new Random();
        num = randomNumber.nextInt(10) + 1;
        num++;
        System.out.println("Guess a number from 1-10.");
        guess = keybd.nextInt();
        //System.out.println("Tries left: 2");
        while (guess != num) {

            if (guess < num && guess != -1) {
                System.out.println("Too low. Try again.");
                guess = keybd.nextInt();
            } else if (guess > num) {
                System.out.println("Too high. Try again.");
                guess = keybd.nextInt();
            }

            if (guess == -1) {
                break;
            }

        }

        if (guess != -1) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry! The answer is : " + num);
        }
    }
}
