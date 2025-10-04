public class Kendaraan {
    protected String merk;
    protected String warna;

    public Kendaraan(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void nyalakanMesin() {
        System.out.println(merk + " berwarna " + warna + " menyalakan mesin.");
    }

    public void matikanMesin() {
        System.out.println(merk + " mematikan mesin.");
    }
}
