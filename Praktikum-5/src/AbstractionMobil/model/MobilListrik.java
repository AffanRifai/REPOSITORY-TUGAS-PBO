package model;

public class MobilListrik extends Mobil {
    private int dayaBaterai; // dalam persen

    public MobilListrik(String merk, int kecepatan, int dayaBaterai) {
        super(merk, kecepatan);
        this.dayaBaterai = dayaBaterai;
    }

    @Override
    public void jalankan() {
        System.out.println(merk + " berjalan tanpa suara, kecepatan " + kecepatan +
                           " km/jam, baterai " + dayaBaterai + "%.");
    }

    @Override
    public void nyalakanAirbag() {
        System.out.println(merk + ": Airbag pintar aktif sesuai sensor.");
    }

    @Override
    public void aktifkanABS() {
        System.out.println(merk + ": Sistem ABS listrik diaktifkan.");
    }
}
