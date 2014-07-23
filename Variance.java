import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int l : list){
            sum += l;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / (double)(list.size());
        return average;
    }

    public static double variance(ArrayList<Integer> list) {

        double num = 0;
        for ( int l : list){
            num += Math.pow((l - average(list)), 2.0);
        }
        double denom = (double)(list.size()) - 1.0;
        double var = num/denom;
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
