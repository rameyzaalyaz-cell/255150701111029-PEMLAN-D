public abstract class Kue {
    
    private String nama;
    public double harga;

    public Kue (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();
    
    @Override
    public String toString() {
       return String.format(
            "Nama kue: %s\n" +
            "Harga Kue: %.2f\n", 
           nama, harga
        );

    
    }

    
}
