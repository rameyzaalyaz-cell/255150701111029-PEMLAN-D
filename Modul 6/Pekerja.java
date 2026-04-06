import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja (double gaji, int tahun, int bulan, int hari, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }
     public double getGaji() {
        return gaji;
    }

    public double getBonus() {
        int lamaKerja = Period.between(tahunMasuk, LocalDate.now()).getYears();

        if (lamaKerja >= 0 && lamaKerja <= 5) {
               return gaji * 0.05;
           } else if (lamaKerja <= 10) {
               return gaji * 0.10;
           } else {
              return gaji * 0.15;
}
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

   @Override
    public String toString() {
       return super.toString() + "\n" +
        String.format(
            "Tahun Masuk   : %d %d %d\n" +
            "Jumlah Anak   : %d\n" +
            "Gaji          : %.1f",
            tahunMasuk.getDayOfMonth(),
            tahunMasuk.getMonthValue(),
            tahunMasuk.getYear(),
            jumlahAnak,
            gaji
        );
    }
   
}
