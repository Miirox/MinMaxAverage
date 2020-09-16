import java.util.Arrays;
import java.util.Scanner;

public class MinMaxAverage {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a size of an array: ");

        int N = in.nextInt();
        double[] array = new double[N];

        for(int i = 0; i < N; i++){
            array[i] = (double)((int)(Math.random() * 100)) / 100;
        }

        double min = array[0];
        double max = array[0];

        double average = 0;

        double sum = 0;

        for(int i = 0; i < N; i++){
            if(min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }

            sum += array[i];
        }

        average = (double)((int)((sum / N) * 100)) / 100;

        System.out.println(Arrays.toString(array) + "\n");

        System.out.println("Min element: " + min);

        System.out.println("Max element: " + max);

        System.out.println("Average of an array: " + average);
    }
}
