import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text){
        String reversed = "";
        int i = text.length() - 1;
        while (i >= 0){
            reversed = reversed + text.charAt(i);
            i--;
        }
        return reversed;
    }

    public static boolean palindrome(String text) {
        // write code here
        String textrev = reverse(text);
       if (text.equals(textrev)){
           return true;
       }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
