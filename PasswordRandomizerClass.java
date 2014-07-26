import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String Password = "";
        while (i < length){
            int randomNumber = random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvxyz".charAt(randomNumber);
            Password += symbol;
            i++;
        }
        return Password;
    }
}
