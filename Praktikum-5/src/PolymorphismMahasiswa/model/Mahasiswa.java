package model;

public class Mahasiswa {
    protected String nama;
    protected String nim;
    protected double nilaiUTS;
    protected double nilaiUAS;

    public Mahasiswa(String nama, String nim, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Overloading
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }

    public void tampilkanInfo(String jurusan) {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    // Akan dioverride oleh subclass
    public double hitungNilaiAkhir() {
        return (nilaiUTS + nilaiUAS) / 2;
    }
}
