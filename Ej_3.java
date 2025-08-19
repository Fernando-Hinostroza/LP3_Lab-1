import java.util.Random;

class Propuesto_3 {
    public static void main(String[] args) {
        int[] frecuencias = new int[6];
        Random rand = new Random();

        for (int i = 0; i < 20000; i++) {
            int cara = rand.nextInt(6); // valores de 0 a 5
            frecuencias[cara]++;
        }

        // Validación: la suma de todas las frecuencias debe ser 20000
        int total = 0;
        for (int f : frecuencias) total += f;

        System.out.println("📊 Resultados:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cara " + (i+1) + ": " + frecuencias[i] + " veces");
        }
        System.out.println("Total lanzamientos contados: " + total);
    }
}
