package day13;

public class Q2 {
    public static void SumAvg(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        SumAvg(arr);
    }
    
}
