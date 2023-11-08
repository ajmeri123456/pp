package equations;

import java.util.Scanner;

class Complex {
    Complex() {
        complexCalculations();
    }

    void complexCalculations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Complex Number Calculator.");
        System.out.println("\n\n-----------------------------------------------------------------\n\n");
        System.out.println("Press 1: To Add Two Complex Numbers.");
        System.out.println("Press 2: To Subtract Two Complex Numbers.");
        System.out.println("Press 3: To Multiply Two Complex Numbers.");
        System.out.println("Press 4: To get Mod of a complex number.");
        System.out.println("Press 0: To Go Back.");
        System.out.print("\nYour choice: ");
        int n = sc.nextInt();
        String z1, z2;
        switch (n) {
            case 1:
                System.out.println("Please Enter two Complex Numbers in format (a+bi)");
                System.out.print("Z1: ");
                z1 = sc.next();
                System.out.print("Z2:");
                z2 = sc.next();
                ComplexAddition cAdd = new ComplexAddition(z1, z2);
                cAdd.add();
                break;
            case 2:
                System.out.println("Please Enter two Complex Numbers in format (a+bi)");
                System.out.print("Z1: ");
                z1 = sc.next();
                System.out.print("Z2:");
                z2 = sc.next();
                ComplexSubtraction cSub = new ComplexSubtraction(z1, z2);
                cSub.sub();
                break;
            case 3:
                System.out.println("Please Enter two Complex Numbers in format (a+bi)");
                System.out.print("Z1: ");
                z1 = sc.next();
                System.out.print("Z2:");
                z2 = sc.next();
                ComplexMultiplication cMul = new ComplexMultiplication(z1, z2);
                cMul.multiply();
                break;
            case 4:
                System.out.println("Please Enter a Complex Number in format (a+bi)");
                System.out.print("Z1: ");
                z1 = sc.next();
                ModComplex mod = new ModComplex(z1);
                mod.findModulus();
                break;
            default:
                System.out.println("Returning to main menu.\n\n");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                return;
        }

    }
}