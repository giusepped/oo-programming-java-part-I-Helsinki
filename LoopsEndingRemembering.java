import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        double sum = 0;
        int i = 0;
        int even = 0;
        int odds = 0;
        
        while (true){
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1){
                break;
            }
            sum += number;
            i++;
            if( number % 2 == 0){
                even++;
            }else{
                odds++;
            }
            
        }
        System.out.println("Thank you and see you later!");
        int intsum = (int)sum;
        System.out.println("The sum is " + intsum); 
        double average = sum / i;
        System.out.println("How many numbers: " + i);
        System.out.println("Average: "+ average); 
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odds);
    }
}
