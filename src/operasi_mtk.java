public class operasi_mtk {
    public static void main(String[] args) {
        double a = 200;
        double b = 33.4568;
        double c = 10;
        double d = 10 ;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignment
        c += 10; // c = c+10
        d = d + 10;
        System.out.println(c + d);
        c -= -10;
        System.out.println(c);
        c *= -10;
        System.out.println(c);
        c /= -10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);

        // Unary Operator
        a++; b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(!false);




    }
}
