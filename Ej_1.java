import java.util.Scanner;

class Propuesto_1 {
    static int sumaArreglo(int[] arr) {
        int suma = 0;
        for (int num : arr) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Ingrese el tamaño del arreglo (>0): ");
            n = sc.nextInt();
            if (n > 0) break;
            System.out.println("Error: el tamaño debe ser mayor a 0.");
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor en la posición " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("La suma del arreglo es: " + sumaArreglo(arr));
    }
}
