package OtherProjects.hust.soict.hedspi.lab01;
import java.util.Scanner;
import java.lang.Math;
public class Equation {
    public static void main(String[] args) {
        // Menu
        System.out.println("Please input the function number:");
        System.out.println("1.First-degree equation with one variable");
        System.out.println("2.First-degree equations with two variables");
        System.out.println("3.Second-degree equation with one variable");
        System.out.print("-> ");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        switch (k) {
            case 1: firstDegreeOneVariable();
                break;
            case 2: firstDegreeTwoVariables();
                break;
            case 3: secondDegreeOneVariable();
                break;
            default:
                break;
        }
        in.close();
    }


    // The first-degree equation (linear equation) with one variable
    static void findOneVariableSolution(double a, double b) {
        if (a==0 && b!=0)
            System.out.print("Equation has no solution!");
        else if (a==0 && b==0)
            System.out.print("Equation has infinitely many solutions!");
        else if (a!=0 && b==0)
            System.out.print("Solution is: 0");
        else
            System.out.print("Solution is: " + -b/a);
    }

    static void firstDegreeOneVariable() {
        Scanner in = new Scanner(System.in);
        System.out.println("First-degree equation with one variable: ax + b = 0");
        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();

        findOneVariableSolution(a, b);

        in.close();
    }


    // The system of first-degree equations (linear system) with two variables
    static void firstDegreeTwoVariables() {
        Scanner in = new Scanner(System.in);
        System.out.println("First-degree equations with two variables");
        System.out.println("Please input value for a[][]");

        double a[][] = new double[2][2];
        double b[] = new double[2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + (i+1) + "][" + (j+1) + "]: ");
                a[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("b[" + (i+1) + "]: ");
            b[i] = in.nextDouble();
        }

        Double D = a[0][0]*a[1][1] - a[1][0]*a[0][1];
        Double D1 = b[0]*a[1][1] - b[1]*a[0][1];
        Double D2 = a[0][0]*b[1] - a[1][0]*b[0];

        if (D != 0) 
            System.out.print("The system has an equation " + "(" + (D1/D) + ", " + (D2/D) + ")");
        else if (D==0 && (D1 != 0 || D2 != 0))
            System.out.print("The system has no sulution");
        else
            System.out.print("Infinitely many roots");

        in.close();
    }


    // The second-degree equation with one variable
    static void secondDegreeOneVariable() {
        Scanner in = new Scanner(System.in);
        System.out.println("Second-degree equation with one variable");

        System.out.print("a: ");
        double a = in.nextDouble();
        System.out.print("b: ");
        double b = in.nextDouble();
        System.out.print("c: ");
        double c = in.nextDouble();
        if (a==0) {
            findOneVariableSolution(b, c);
            in.close();
            return;
        }
        double delta = b*b - 4*a*c ;
        if(delta < 0)
            System.out.print("Equation has no solution");
        else if (delta == 0)
            System.out.print("Equation has an solution x1 = x2 = " + (-b/(2*a)));
        else {
            System.out.print("The equation has two solution\n") ;
            System.out.print("x1 = " + ((-b+Math.sqrt(delta))/(2*a)) + "\n");
            System.out.print("x2 = " + ((-b-Math.sqrt(delta))/(2*a)));
        }
        
        in.close();
    }

}
