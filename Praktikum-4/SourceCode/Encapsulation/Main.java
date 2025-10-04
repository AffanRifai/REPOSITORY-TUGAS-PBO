public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Merah");

        System.out.println("Merk: " + mobil1.getMerk());
        System.out.println("Warna: " + mobil1.getWarna());
        System.out.println("Kecepatan: " + mobil1.getKecepatan() + " km/jam");

        mobil1.tambahKecepatan(60);
        System.out.println("Setelah menambah kecepatan: " + mobil1.getKecepatan() + " km/jam");

        mobil1.kurangiKecepatan(30);
        System.out.println("Setelah mengurangi kecepatan: " + mobil1.getKecepatan() + " km/jam");
    }
}
