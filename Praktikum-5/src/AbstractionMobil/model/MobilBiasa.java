package model;

public class MobilBiasa extends Mobil {
    private String tipe;

    public MobilBiasa(String merk, int kecepatan, String tipe) {
        super(merk, kecepatan);
        this.tipe = tipe;
    }

    @Override
    public void jalankan() {
        System.out.println(merk + " tipe " + tipe + " berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void nyalakanAirbag() {
        System.out.println(merk + ": Airbag diaktifkan (manual).");
    }

    @Override
    public void aktifkanABS() {
        System.out.println(merk + ": ABS diaktifkan saat pengereman.");
    }
}
