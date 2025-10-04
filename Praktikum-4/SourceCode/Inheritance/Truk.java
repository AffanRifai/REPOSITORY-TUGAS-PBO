public class Truk extends Kendaraan {
    private int kapasitasMuatan;

    public Truk(String merk, String warna, int kapasitasMuatan) {
        super(merk, warna);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public void muatBarang() {
        System.out.println(merk + " sedang memuat barang hingga " + kapasitasMuatan + " kg.");
    }

    public void jalankan() {
        System.out.println(merk + " sedang berjalan membawa muatan berat.");
    }
}
