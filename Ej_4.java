import java.util.Scanner;

class Propuesto_4 {
    static double menor(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Ingrese el primer número: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        c = sc.nextDouble();

        System.out.println("El menor de los tres números es: " + menor(a, b, c));
    }
}
