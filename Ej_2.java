import java.util.Scanner;

class Propuesto_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Ingrese número " + (i+1) + ": ");
                int num = sc.nextInt();

                // Validación: el primer número puede ser cualquiera,
                // los siguientes deben ser estrictamente mayores
                if (i == 0 || num > arr[i-1]) {
                    arr[i] = num;
                    break;
                } else {
                    System.out.println("❌ Error: debe ser mayor que " + arr[i-1]);
                }
            }
        }

        System.out.println("✅ Arreglo final:");
        for (int x : arr) System.out.print(x + " ");
    }
}
