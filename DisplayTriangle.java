import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input height: ");
        int n = keyboard.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++)
                System.out.print(" ");
            for (int j = 0; j < 2*i+1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        keyboard.close();
    }
    
}
