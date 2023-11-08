package equations;

public class ModComplex {
    String z1;

    ModComplex(String z1) {
        this.z1 = z1;
    }

    void findModulus() {
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
        double mod = Math.sqrt(a * a + b * b);
        System.out.println("Answer is " + mod);
    }
}