package vizsgafelkeszito;

public abstract class Karakter {
    private String nev;
    private String faj;

    public Karakter(String nev, String faj) throws Exception {
        
        if(nev.length()<4) {
            tulRovidNev();
        }else{
            this.nev = nev;
            this.faj = faj;
        }
    }
    
    static void tulRovidNev() throws Exception {
        System.err.println("Túl rövid a név!");
    }

    @Override
    public String toString() {
        return "Karakter{" + "nev=" + nev + ", faj=" + faj + '}';
    }
    
    
}
