
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int i = 0;

        while (true){
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            if(guess == numberDrawn){
                break;
            } else if (guess < numberDrawn) {
                i++;
                System.out.println("Your number is greater, guesses made: " + i);      
            } else if (guess > numberDrawn) {
                i++;
                System.out.println("Your number is lesser, guesses made: " + i);
            }
        }
        System.out.println("Congratulations, your guess is correct");
    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
