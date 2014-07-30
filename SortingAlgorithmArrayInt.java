
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i : array){
            if(smallest > i){
                smallest = i;
            }  
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array){
        int indexSmallest = 0;
        for(int i = 0; i < array.length; i++){
            if(array[indexSmallest] > array[i]){
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int indexSmallestStarting = index;
        for(int i = index; i < array.length; i++){
            if(array[indexSmallestStarting] > array[i]){
                indexSmallestStarting = i;
            }
        }
        return indexSmallestStarting;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
