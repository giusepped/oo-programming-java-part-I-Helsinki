
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        while (i < name.length()){
            int j = i + 1;
            System.out.println(j +". Character: " + name.charAt(i));
            i++;
        }
    }
}
