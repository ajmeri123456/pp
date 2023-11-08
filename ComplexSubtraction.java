package equations;

public class ComplexSubtraction {
    String z1, z2;

    ComplexSubtraction(String z1, String z2) {
        this.z1 = z1;
        this.z2 = z2;
    }

    void sub() {
        char ch = ' ';
        int index = 0;
        for (int i = 1; i < z1.length(); i++) {
            if (z1.charAt(i) == '+' || z1.charAt(i) == '-') {
                ch = z1.charAt(i);
                index = i;
            }
        }
        double a = Double.parseDouble(z1.substring(0, index));
        double b = Double.parseDouble(z1.substring(index + 1, z1.length() - 1));
        if (ch == '-') {
            b = -1 * b;
        }
        index = 0;
        ch = ' ';
        for (int i = 1; i < z2.length(); i++) {
            if (z2.charAt(i) == '+' || z2.charAt(i) == '-') {
                ch = z2.charAt(i);
                index = i;
            }
        }
        double c = Double.parseDouble(z2.substring(0, index));
        double d = Double.parseDouble(z2.substring(index + 1, z2.length() - 1));
        if (ch == '-') {
            d = -1 * d;
        }
        double R, I;
        R = a - c;
        I = b - d;
        if (I < 0) {
            ch = '-';
        }
        I = -1 * I;
        System.out.println("Answer is " + R + " " + ch + " " + I + "i");
    }
}