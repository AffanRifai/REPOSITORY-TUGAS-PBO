import model.*;

public class MainPolymorphism {
    public static void main(String[] args) {
        Mahasiswa m1 = new MahasiswaDiploma("Rian", "D2201", 80, 75, 85);
        Mahasiswa m2 = new MahasiswaSarjana("Lia", "S2302", 85, 80, 90);
        Mahasiswa m3 = new MahasiswaPascaSarjana("Tono", "P2403", 90, 85, 95);

        Mahasiswa[] daftar = {m1, m2, m3};

        for (Mahasiswa m : daftar) {
            m.tampilkanInfo("Teknik Informatika");
            System.out.println("Nilai Akhir: " + m.hitungNilaiAkhir());
            System.out.println("---------------------------");
        }
    }
}
