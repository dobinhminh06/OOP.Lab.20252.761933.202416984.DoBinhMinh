package Lab03.OtherProjects.Source;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] my_array1 = new int[s];
        for(int i = 0; i < s; i++){
            my_array1[i] = sc.nextInt();
        }
        Arrays.sort(my_array1);
        System.out.print("Sorted Array: ");
        for(int i = 0; i < s; i++){
            System.out.print(my_array1[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int num : my_array1) {
            sum += num;
        }
        
        double average = (double) sum / my_array1.length;

        System.out.println("Sumhekki: " + sum);
        System.out.println("Average: " + average);
    }
}