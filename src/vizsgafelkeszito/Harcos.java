package vizsgafelkeszito;

import java.util.ArrayList;

public class Harcos extends Karakter{
    private double ero;
    private double ugyesseg;
    private ArrayList<Eszkoz> eszkozok;
    
    public Harcos(String nev, String faj, double ero, double ugyesseg) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
        eszkozok = new ArrayList<>();
    }
    
    
}
