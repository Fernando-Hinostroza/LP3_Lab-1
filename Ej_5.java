import java.util.Scanner;

class Propuesto_5 {
    static double tarifa(int horas) {
        if (horas <= 0) return 0;
        if (horas == 1) return 3.0;
        double total = 3.0 + (horas - 1) * 0.5;
        return Math.min(total, 12.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de horas de estacionamiento: ");
        int horas = sc.nextInt();

        if (horas < 0) {
            System.out.println("Error: no se aceptan horas negativas.");
        } else {
            System.out.println("El costo por " + horas + " horas es: S/" + tarifa(horas));
        }
    }
}
