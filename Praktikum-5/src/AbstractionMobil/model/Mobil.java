package model;

public abstract class Mobil implements FiturKeselamatan {
    protected String merk;
    protected int kecepatan;

    public Mobil(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void hidupkanMesin() {
        System.out.println(merk + " mesin dinyalakan.");
    }

    public void matikanMesin() {
        System.out.println(merk + " mesin dimatikan.");
    }

    public abstract void jalankan();
}
