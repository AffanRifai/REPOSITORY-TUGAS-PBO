public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merk, String warna, int jumlahPintu) {
        super(merk, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public void bukaPintu() {
        System.out.println(merk + " membuka salah satu dari " + jumlahPintu + " pintunya.");
    }

    public void jalankan() {
        System.out.println(merk + " sedang berjalan di jalan raya.");
    }
}
