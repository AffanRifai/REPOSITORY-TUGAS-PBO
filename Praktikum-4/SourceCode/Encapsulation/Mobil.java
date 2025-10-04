public class Mobil {
    private String merk;
    private String warna;
    private int kecepatan;

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = 0;
    }

    // Setter & Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Method tambahan
    public void tambahKecepatan(int nilai) {
        this.kecepatan += nilai;
    }

    public void kurangiKecepatan(int nilai) {
        this.kecepatan -= nilai;
        if (this.kecepatan < 0) {
            this.kecepatan = 0;
        }
    }
}
