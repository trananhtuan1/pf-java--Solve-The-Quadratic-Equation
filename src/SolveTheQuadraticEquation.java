import java.util.Scanner;

public class SolveTheQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double result;
        if (a == 0) {
            result = -c / b;
            System.out.println("Phương trình " + b + "x +" + c + "\t" + "= " + result);
        } else {
            if (b == 0) {
                result = c / a;
                System.out.print("Phương trình có nghiệm=  " + result);
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("vô nghiệm");
                } else if (delta > 0) {
                    result = (-b - Math.sqrt(delta)) / 2 * a;
                    double result1 = (-b + Math.sqrt(delta)) / 2 * a;
                    System.out.println("Phương trình có 2 nghiệm " + result + "and " + result1);
                } else {
                    result = -b / 2 * a;
                    System.out.println("Phương trình có 1 nghiệm " + result);
                }
            }
        }
    }
}

