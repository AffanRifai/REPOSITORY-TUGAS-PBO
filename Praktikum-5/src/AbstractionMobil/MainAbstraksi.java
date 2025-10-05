import model.*;

public class MainAbstraksi {
    public static void main(String[] args) {
        Mobil[] garasi = {
            new MobilBiasa("Toyota Avanza", 120, "MPV"),
            new MobilSport("Ferrari", 280, true),
            new MobilListrik("Tesla Model 3", 200, 85)
        };

        for (Mobil m : garasi) {
            m.hidupkanMesin();
            m.jalankan();
            m.nyalakanAirbag();
            m.aktifkanABS();
            m.matikanMesin();
            System.out.println("-----------------------------");
        }
    }
}
