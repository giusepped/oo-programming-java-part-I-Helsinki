
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String pass1 = "mightyducks";
        String user2 = "emily";
        String pass2 = "cat";
        System.out.println("Type your username: ");
        String username = reader.nextLine();
        System.out.println("Type your password: ");
        String password = reader.nextLine();
        if((username.equals(user1) && password.equals(pass1)) || (username.equals(user2) && password.equals(pass2))){
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
