package vizsgafelkeszito;

public class Vizsgafelkeszito {

    public static void main(String[] args) throws Exception {
        Eszkoz kapa = new Eszkoz("kapa", 100);
        Eszkoz aso = new Eszkoz("aso", 100);
        Eszkoz kecske = new Eszkoz("kecske", 100);
        Eszkoz kutya = new Eszkoz("kutya", 100);
        
        Harcos h = new Harcos("Ha", "Kutya", 100, 100);
        h.felvesz(kapa);
        h.felvesz(aso);
        h.felvesz(kecske);
        h.felvesz(kutya);
        h.felvesz(kapa);
        System.out.println(h);
        h.eldob(kapa);
        System.out.println(h);
        h.eldob(2);
        System.out.println(h);
    }
    
}
