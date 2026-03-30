import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket j = new Jaket();

        System.out.println("======================================");
        System.out.println("     CV. LABKOMDAS - Penjualan Jaket");
        System.out.println("======================================");
        System.out.println("Harga Satuan (Normal):");
        System.out.println("Jaket A : Rp 100.000");
        System.out.println("Jaket B : Rp 125.000");
        System.out.println("Jaket C : Rp 175.000");
        System.out.println("======================================");
        System.out.println("Diskon berlaku jika beli > 100 buah:");
        System.out.println("Jaket A : Rp 95.000 / biji");
        System.out.println("Jaket B : Rp 120.000 / biji");
        System.out.println("Jaket C : Rp 160.000 / biji");
        System.out.println("======================================");

        System.out.print("Masukkan jumlah Jaket A yang dibeli : ");
        int a = in.nextInt();
        System.out.print("Masukkan jumlah Jaket B yang dibeli : ");
        int b = in.nextInt();
        System.out.print("Masukkan jumlah Jaket C yang dibeli : ");
        int c = in.nextInt();

       int hargaA = j.getHargaA(a);
        int hargaB = j.getHargaB(b);
        int hargaC = j.getHargaC(c);

        int totalA = j.totalA(a);
        int totalB = j.totalB(b);
        int totalC = j.totalC(c);


        int total = totalA + totalB + totalC;

        System.out.println("\n------ STRUK ---------");

        System.out.printf("Jaket A (%d) x Rp %,d = Rp %,d\n", a, hargaA, totalA);
        System.out.printf("Jaket B (%d) x Rp %,d = Rp %,d\n", b, hargaB, totalB);
        System.out.printf("Jaket C (%d) x Rp %,d = Rp %,d\n", c, hargaC, totalC);

        System.out.println("----------------------");
        System.out.printf("Total : Rp %,d\n", total);

        in.close();
    }
}


















