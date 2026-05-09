package pratikum10;
import java.io.File;

public class TampilFile {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\Lenovo\\Documents\\COOLYEAHH\\PEMDAS\\Java Lang\\sem 2 (pemlan)"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();

            System.out.println("Daftar file dalam direktori:");

            for (File file : daftarFile) {
                System.out.println(file.getName());
            }

        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}