package model;

public class MahasiswaSarjana extends Mahasiswa {
    private double nilaiTugasAkhir;

    public MahasiswaSarjana(String nama, String nim, double uts, double uas, double tugasAkhir) {
        super(nama, nim, uts, uas);
        this.nilaiTugasAkhir = tugasAkhir;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (nilaiUTS * 0.3) + (nilaiUAS * 0.3) + (nilaiTugasAkhir * 0.4);
    }
}
