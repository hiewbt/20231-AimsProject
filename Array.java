import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = keyboard.nextInt();
        int[] arr = new int[n];
        System.out.print("Input array \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = keyboard.nextInt();
        }
        keyboard.close();

        Arrays.sort(arr);

        double sum = 0 ;
        for(int x : arr)
            sum += x ;
        System.out.println("Sum of array " + sum);
        sum = sum/n ;
        System.out.println("Average value of array elements " + sum);
    }
}