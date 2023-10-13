import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in) ;
        System.out.print("Input number of rows: ");
        int n = keyboard.nextInt(); 
        System.out.print("Input number of collumns: ");
        int m = keyboard.nextInt();
        int arr1[][] = new int[n][m];
        int arr2[][] = new int[n][m];
        int sum[][] = new int[n][m];

        System.out.print("Input matrix1: ");

        for(int i=0; i < n; i++)
            for(int j=0; j<m; j++)
                arr1[i][j] = keyboard.nextInt();

        System.out.print("Input matrix2: ");

        for(int i=0; i < n; i++)
            for(int j=0; j<m; j++)
                arr2[i][j] = keyboard.nextInt() ;
            
        System.out.println("Matrix1 + matrix2:");

        for(int i=0; i < n; i++)
            for(int j=0; j<m; j++)
                sum[i][j] = arr1[i][j] + arr2[i][j] ;

        for(int i=0; i < n; i++) {
            for(int j=0; j<m; j++)
                System.out.print(sum[i][j] + " ");

            System.out.print("\n");
        }

        keyboard.close();
    } 
}