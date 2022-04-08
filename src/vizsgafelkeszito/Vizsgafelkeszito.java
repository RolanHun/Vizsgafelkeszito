package vizsgafelkeszito;

public class Vizsgafelkeszito {

    public static void main(String[] args) throws Exception {
        Eszkoz kapa = new Eszkoz("kapa", 100);
        Eszkoz aso = new Eszkoz("aso", 100);
        Eszkoz kecske = new Eszkoz("kecske", 100);
        Eszkoz kutya = new Eszkoz("kutya", 100);
        
        Harcos h = new Harcos("Harcsa", 100, 100);
        System.out.println(h);
        Harcos h1 = new Harcos("Ha", 1000, 1000);
        System.out.println(h1);
        Harcos h2 = new Harcos("Kacsa", 1200, 1020);
        System.out.println(h2);
        Harcos h3 = new Harcos("Tücsök", 1030, 1300);
        System.out.println(h3);
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
