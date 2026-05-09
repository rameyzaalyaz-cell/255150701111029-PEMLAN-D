package pratikum10;

import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\Lenovo\\Documents\\COOLYEAHH\\PEMDAS\\Java Lang\\sem 2 (pemlan)\\belajar"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();

            
            for (File file : daftarFile) {
                if (file.isFile()) {
                    file.delete();
                    System.out.println(file.getName() + " berhasil dihapus");
                }
            }

        if (folder.delete()) {
                System.out.println("Direktori berhasil dihapus");
            } else {
                System.out.println("Direktori gagal dihapus");
            }

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
