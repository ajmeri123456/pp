package equations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bool = true;
        Scanner sc = new Scanner(System.in);
        while (bool) {
            System.out.println("Press 1: To Solve a Quadratic Equation.");
            System.out.println("Press 2: To Open Complex Calculator.");
            System.out.println("Press 0: To Exit.");
            System.out.print("\nYour Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the coefficints of Quadratic Equation, aX^2+bX+c=0.");
                    System.out.println("a: ");
                    double a = sc.nextDouble();
                    System.out.println("b: ");
                    double b = sc.nextDouble();
                    System.out.println("c: ");
                    double c = sc.nextDouble();
                    Quadratic quad = new Quadratic(a, b, c);
                    quad.natureOfRoots();
                    quad.roots();
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                   
                        e.printStackTrace();
                    }
                    continue;
                case 2:
                    new Complex();
                default:
                    System.exit(0);
            }
        }
        sc.close();
    }
}

