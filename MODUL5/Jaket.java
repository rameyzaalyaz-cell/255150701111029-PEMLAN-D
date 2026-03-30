public class Jaket {
    final int hargaA = 100000;
    final int hargaB = 125000;
    final int hargaC = 175000;

    public int getHargaA(int jumlah){
        return (jumlah > 100) ? 95000 : hargaA;
    }

    public int getHargaB(int jumlah){
        return (jumlah > 100) ? 120000 : hargaB;
    }

    public int getHargaC(int jumlah){
        return (jumlah > 100) ? 160000 : hargaC;
    }

    public int totalA(int jumlah){
        return jumlah * getHargaA(jumlah);
    }

    public int totalB(int jumlah){
        return jumlah * getHargaB(jumlah);
    }

    public int totalC(int jumlah){
        return jumlah * getHargaC(jumlah);
    }
}
