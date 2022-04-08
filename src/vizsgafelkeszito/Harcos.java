package vizsgafelkeszito;

import java.util.ArrayList;

public class Harcos extends Karakter{
    private double ero;
    private double ugyesseg;
    private ArrayList<Eszkoz> eszkozok;
    
    public Harcos(String nev, String faj, double ero, double ugyesseg) throws Exception {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
        eszkozok = new ArrayList<>();
    }
    public void felvesz(Eszkoz eszkoz){
        eszkozok.add(eszkoz);
    }
    public void eldob(Eszkoz eszkoz){
        eszkozok.remove(eszkoz);
    }
    public void eldob(int slot){
        int real = slot-1;
        eszkozok.remove(real);
    }

    @Override
    public String toString() {
        return "Harcos{" + super.toString() + "ero=" + ero + ", ugyesseg=" + ugyesseg + ", eszkozok=" + eszkozok + '}';
    }
    
}
