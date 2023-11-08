package equations;

public class Quadratic {
    double a, b, c;

    Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void roots() {
        double discriminant, root1, root2, x2;
        discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            root1 = (-1 * b) / (2 * a);
            root2 = root1;
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else {
            if (discriminant > 0) {
                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are " + root1 + " and " + root2);
            }

            else {
                discriminant = Math.abs(discriminant);
                double x1 = (-b) / (2 * a);
                x2 = Math.sqrt(discriminant) / (2 * a);
                String r1 = x1 + " + " + x2 + "i";
                String r2 = x1 + " - " + x2 + "i";
                System.out.println("Roots are: (" + r1 + ") and (" + r2 + ")");

            }
        }
    }

    void natureOfRoots() {
        String s;
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            s = "Roots are real and equal.";
        } else {
            if (discriminant > 0) {
                s = "Roots are real and unequal.";
            } else {
                s = "Roots are imaginary.";
            }
        }
        System.out.println(s);
    }
}