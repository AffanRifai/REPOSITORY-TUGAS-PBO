public class MainInheritance {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Toyota Avanza", "Hitam", 4);
        Truk hino = new Truk("Hino dutro", "Hijau", 10000);
        MobilSport ferrari = new MobilSport("Ferrari F8", "Merah", 2, 720);

        avanza.nyalakanMesin();
        avanza.bukaPintu();
        avanza.jalankan();
        avanza.matikanMesin();

        System.out.println();

        hino.nyalakanMesin();
        hino.muatBarang();
        hino.jalankan();
        hino.matikanMesin();

        System.out.println();

        ferrari.nyalakanMesin();
        ferrari.bukaPintu();
        ferrari.jalankan();
        ferrari.aktifkanTurbo();
        ferrari.matikanMesin();
    }
}
