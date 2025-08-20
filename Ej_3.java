import java.util.Random;

class Propuesto_3 {
    public static void main(String[] args) {
        int[] frecuencias = new int[6];
        Random rand = new Random();

        for (int i = 0; i < 20000; i++) {
            int cara = rand.nextInt(6);
            frecuencias[cara]++;
        }

        int total = 0;
        for (int f : frecuencias) total += f;

        System.out.println("📊 Resultados:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cara " + (i+1) + ": " + frecuencias[i] + " veces");
        }
        System.out.println("Total lanzamientos contados: " + total);
    }
}
