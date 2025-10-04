public class MobilSport extends Mobil {
    private int tenagaMesin;

    public MobilSport(String merk, String warna, int jumlahPintu, int tenagaMesin) {
        super(merk, warna, jumlahPintu);
        this.tenagaMesin = tenagaMesin;
    }

    public void aktifkanTurbo() {
        System.out.println(merk + " mengaktifkan turbo dengan tenaga " + tenagaMesin + " HP!");
    }
}
