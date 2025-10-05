package model;

public class MahasiswaDiploma extends Mahasiswa {
    private double nilaiPraktek;

    public MahasiswaDiploma(String nama, String nim, double uts, double uas, double praktek) {
        super(nama, nim, uts, uas);
        this.nilaiPraktek = praktek;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (nilaiUTS * 0.3) + (nilaiUAS * 0.3) + (nilaiPraktek * 0.4);
    }
}
