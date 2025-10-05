package model;

public class MobilSport extends Mobil {
    private boolean modeSport;

    public MobilSport(String merk, int kecepatan, boolean modeSport) {
        super(merk, kecepatan);
        this.modeSport = modeSport;
    }

    @Override
    public void jalankan() {
        String mode = modeSport ? "SPORT" : "NORMAL";
        System.out.println(merk + " berjalan dalam mode " + mode + " pada kecepatan " + kecepatan + " km/jam!");
    }

    @Override
    public void nyalakanAirbag() {
        System.out.println(merk + ": Airbag otomatis aktif saat tabrakan.");
    }

    @Override
    public void aktifkanABS() {
        System.out.println(merk + ": ABS aktif penuh untuk stabilitas tinggi.");
    }
}
