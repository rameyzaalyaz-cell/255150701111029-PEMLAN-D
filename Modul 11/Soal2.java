package pratikum11;
import java.util.*;

public class Soal2 {

    public static void main(String[] args) {

        Integer[][] dataA = {
            {168,50},{170,60},{165,56},{168,55},{172,60},
            {170,70},{169,66},{165,56},{171,72},{166,56}
        };
        Integer[][] dataB = {
            {170,66},{167,60},{165,59},{166,58},{168,58},
            {175,71},{172,68},{171,68},{168,65},{169,60}
        };



        //ArrayList Tim A dan Tim B 
        System.out.println("\nArrayList Tim A dan Tim B");
        ArrayList<Integer> listTinggiA = new ArrayList<>();
        ArrayList<Integer> listBeratA  = new ArrayList<>();
        ArrayList<Integer> listTinggiB = new ArrayList<>();
        ArrayList<Integer> listBeratB  = new ArrayList<>();
        for (Integer[] p : dataA) { listTinggiA.add(p[0]); listBeratA.add(p[1]); }
        for (Integer[] p : dataB) { listTinggiB.add(p[0]); listBeratB.add(p[1]); }
        System.out.println("  Tinggi Tim A : " + listTinggiA);
        System.out.println("  Berat  Tim A : " + listBeratA);
        System.out.println("  Tinggi Tim B : " + listTinggiB);
        System.out.println("  Berat  Tim B : " + listBeratB);

        //Yang tinggi 168 & 160 di Tim B
        System.out.println("\nJumlah pemain Tim B berdasarkan tinggi badan");
        int freq168B = Collections.frequency(listTinggiB, 168);
        int freq160B = Collections.frequency(listTinggiB, 160);
        System.out.println("  Pemain Tim B dengan tinggi 168 cm : " + freq168B + " orang");
        System.out.println("  Pemain Tim B dengan tinggi 160 cm : " + freq160B + " orang");

        ArrayList<Integer> sortedTinggiB = new ArrayList<>(listTinggiB);
        Collections.sort(sortedTinggiB);
        int idx168 = Collections.binarySearch(sortedTinggiB, 168);
        int idx160 = Collections.binarySearch(sortedTinggiB, 160);
        System.out.println("  BinarySearch tinggi 168 cm : " + (idx168 >= 0 ? "ditemukan di index " + idx168 : "tidak ditemukan (" + idx168 + ")"));
        System.out.println("  BinarySearch tinggi 160 cm : " + (idx160 >= 0 ? "ditemukan di index " + idx160 : "tidak ditemukan (" + idx160 + ")"));

        //Cari berat 56 & 53 di Tim A
        System.out.println("\nJumlah pemain Tim A berdasarkan berat badan");
        int freq56A = Collections.frequency(listBeratA, 56);
        int freq53A = Collections.frequency(listBeratA, 53);
        System.out.println("  Pemain Tim A dengan berat 56 kg : " + freq56A + " orang");
        System.out.println("  Pemain Tim A dengan berat 53 kg : " + freq53A + " orang");

        ArrayList<Integer> sortedBeratA = new ArrayList<>(listBeratA);
        Collections.sort(sortedBeratA);
        int idx56 = Collections.binarySearch(sortedBeratA, 56);
        int idx53 = Collections.binarySearch(sortedBeratA, 53);
        System.out.println("  BinarySearch berat 56 kg : " + (idx56 >= 0 ? "ditemukan di index " + idx56 : "tidak ditemukan (" + idx56 + ")"));
        System.out.println("  BinarySearch berat 53 kg : " + (idx53 >= 0 ? "ditemukan di index " + idx53 : "tidak ditemukan (" + idx53 + ")"));

        //Mengecek kesamaan Tim A vs Tim B ──
        System.out.println("\nApakah ada kesamaan tinggi/berat antara Tim A dan Tim B?");
        boolean disjointTinggi = Collections.disjoint(listTinggiA, listTinggiB);
        boolean disjointBerat  = Collections.disjoint(listBeratA,  listBeratB);

        System.out.println("  Tinggi badan : " + (disjointTinggi
            ? "Tidak ada kesamaan antara Tim A dan Tim B"
            : "Ada kesamaan tinggi badan antara Tim A dan Tim B"));
        System.out.println("  Berat badan : " + (disjointBerat
            ? "Tidak ada kesamaan antara Tim A dan Tim B"
            : "Ada kesamaan berat badan antara Tim A dan Tim B"));

        // Detail kesamaan tinggi (gunaiin binarySearch)
        System.out.println("\n  Detail kesamaan Tinggi Badan:");
        ArrayList<Integer> sortedTinggiB2 = new ArrayList<>(listTinggiB);
        Collections.sort(sortedTinggiB2);
        for (int i = 0; i < listTinggiA.size(); i++) {
            int t = listTinggiA.get(i);
            int idx = Collections.binarySearch(sortedTinggiB2, t);
            if (idx >= 0)
                System.out.printf(" Pemain A[%d]: tinggi %d cm (Tim B)%n", (i+1), t);
        }

        // Detail kesamaan berat (gunaiin binarySearch)
        System.out.println("\n  Detail kesamaan Berat Badan:");
        ArrayList<Integer> sortedBeratB = new ArrayList<>(listBeratB);
        Collections.sort(sortedBeratB);
        for (int i = 0; i < listBeratA.size(); i++) {
            int b = listBeratA.get(i);
            int idx = Collections.binarySearch(sortedBeratB, b);
            if (idx >= 0)
                System.out.printf(" Pemain A[%d]: berat %d kg (Tim B)%n", (i+1), b);
        }
    }
}
