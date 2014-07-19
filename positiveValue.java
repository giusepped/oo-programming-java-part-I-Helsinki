import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
