import java.util.Scanner;

class Propuesto_6 {
    static int convertir(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese horas (>=0): ");
        int h = sc.nextInt();
        System.out.print("Ingrese minutos (0-59): ");
        int m = sc.nextInt();
        System.out.print("Ingrese segundos (0-59): ");
        int s = sc.nextInt();

        // Validaciones
        if (h < 0 || m < 0 || m >= 60 || s < 0 || s >= 60) {
            System.out.println("❌ Error: valores de tiempo no válidos.");
        } else {
            System.out.println("⏱ Equivalente en segundos: " + convertir(h, m, s));
        }
    }
}
