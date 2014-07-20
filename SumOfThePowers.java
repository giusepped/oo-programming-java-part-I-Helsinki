
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int power = 0;
        int result = 0;
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        while (power <= number){
            result += (int)Math.pow(2, power);
            power++;
        }
        System.out.println("The result is " + result);

    }
}
