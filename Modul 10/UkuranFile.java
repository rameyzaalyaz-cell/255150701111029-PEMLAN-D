import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            double size = file.length();

            if (size < 1024 * 1024) {
                System.out.printf("Ukuran: %.2f KB\n", size / 1024);
            } else {
                System.out.printf("Ukuran: %.2f MB\n", size / (1024 * 1024));
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}
