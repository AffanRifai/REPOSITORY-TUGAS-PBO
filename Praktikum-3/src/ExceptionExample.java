import java.io.*;

public class ExceptionExample {
    // method dengan throws
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader br = new BufferedReader(file);

        String line;
        System.out.println("Isi file:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) {
        // Unchecked Exception (ArithmeticException)
        try {
            int result = 10 / 0;
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa dibagi nol!");
        } finally {
            System.out.println("Blok finally selalu jalan.");
        }

        // Checked Exception (IOException)
        try {
            readFile("data.txt"); // file mungkin tidak ada
        } catch (IOException e) {
            System.out.println("Error: File tidak ditemukan.");
        }

        // Throw manual
        try {
            int umur = -5;
            if (umur < 0) {
                throw new IllegalArgumentException("Umur tidak boleh negatif!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception manual: " + e.getMessage());
        }
    }
}
