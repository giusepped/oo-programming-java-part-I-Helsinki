//using a nested loop to print stars starting from an array


public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for(int i : array){
            for(int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
