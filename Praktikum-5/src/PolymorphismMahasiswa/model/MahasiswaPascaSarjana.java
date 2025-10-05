package model;

public class MahasiswaPascaSarjana extends Mahasiswa {
    private double nilaiPenelitian;

    public MahasiswaPascaSarjana(String nama, String nim, double uts, double uas, double penelitian) {
        super(nama, nim, uts, uas);
        this.nilaiPenelitian = penelitian;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (nilaiUTS * 0.25) + (nilaiUAS * 0.25) + (nilaiPenelitian * 0.5);
    }
}
