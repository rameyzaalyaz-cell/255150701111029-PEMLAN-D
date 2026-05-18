package pratikum11;

import java.util.*;

public class Soal1 {

    public static void main(String[] args) {

        Integer[][] dataA = {
            {168,50},{170,60},{165,56},{168,55},{172,60},
            {170,70},{169,66},{165,56}, {171,72},{166,56}
        };
        Integer[][] dataB = {
            {170,66},{167,60},{165,59},{166,58},{168,58},
            {175,71},{172,68},{171,68},{168,65},{169,60}
        };

       //tinggi & berat gabungan (Tim A + B)
        List<Integer> semuaTinggi = new ArrayList<>();
        List<Integer> semuaBerat  = new ArrayList<>();
        for (Integer[] p : dataA) { semuaTinggi.add(p[0]); semuaBerat.add(p[1]); }
        for (Integer[] p : dataB) { semuaTinggi.add(p[0]); semuaBerat.add(p[1]); }
        
        // max/min per tim
        List<Integer> tinggiA = new ArrayList<>();
        List<Integer> beratA  = new ArrayList<>();
        List<Integer> tinggiB = new ArrayList<>();
        List<Integer> beratB  = new ArrayList<>();
        for (Integer[] p : dataA) { tinggiA.add(p[0]); beratA.add(p[1]); }
        for (Integer[] p : dataB) { tinggiB.add(p[0]); beratB.add(p[1]); }

        // Sort Tinggi Badan 
        System.out.println("\nUrut Tinggi Badan (Tim A + Tim B)");
        Collections.sort(semuaTinggi);
        System.out.println("  Ascending  : " + semuaTinggi);
        Collections.sort(semuaTinggi, Collections.reverseOrder());
        System.out.println("  Descending : " + semuaTinggi);

        // Sort Berat Badan
        System.out.println("\nUrut Berat Badan (Tim A + Tim B)");
        Collections.sort(semuaBerat);
        System.out.println("  Ascending  : " + semuaBerat);
        Collections.sort(semuaBerat, Collections.reverseOrder());
        System.out.println("  Descending : " + semuaBerat);

        //Max & Min per Tim 
        System.out.println("\nNilai Maksimum & Minimum per Tim");
        System.out.println("  TIM A:");
        System.out.println("    Tinggi Badan ; Max: " + Collections.max(tinggiA) + " cm | Min: " + Collections.min(tinggiA) + " cm");
        System.out.println("    Berat Badan  ; Max: " + Collections.max(beratA)  + " kg | Min: " + Collections.min(beratA)  + " kg");
        System.out.println("  TIM B:");
        System.out.println("    Tinggi Badan ; Max: " + Collections.max(tinggiB) + " cm | Min: " + Collections.min(tinggiB) + " cm");
        System.out.println("    Berat Badan  ; Max: " + Collections.max(beratB)  + " kg | Min: " + Collections.min(beratB)  + " kg");

        // Copy Tim B ke Tim C 
        System.out.println("\nCopy Tim B → Tim C");
        List<Integer> tinggiC = new ArrayList<>(Collections.nCopies(tinggiB.size(), 0));
        List<Integer> beratC  = new ArrayList<>(Collections.nCopies(beratB.size(),  0));
        Collections.copy(tinggiC, tinggiB);
        Collections.copy(beratC,  beratB);
        System.out.println("  Tim C (salinan Tim B) berhasil dibuat:");
        System.out.printf("  %-4s %-14s %-12s%n", "No", "Tinggi (cm)", "Berat (kg)");
        System.out.println("  " + "-".repeat(32));
        for (int i = 0; i < tinggiC.size(); i++) {
            System.out.printf("  %-4d %-14d %-12d%n", (i+1), tinggiC.get(i), beratC.get(i));
        }
    }
}
