import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        int factorial = 1;
        if (number == 0){
            factorial = 1;
            System.out.println("Factorial is " + factorial);
        } else {
            while (number > 1){
                factorial = factorial * number;
                number--;
                
            }
        System.out.println("Factorial is " + factorial);
            
        }

    }
}
