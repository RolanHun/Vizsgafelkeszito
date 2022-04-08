package gui;

public class Dolgozo{
    private String Nev, Neme; 
    private int Kor, MunkaToltEv; 

    public Dolgozo(String sor) {
        String[] s = sor.split(";");
        this.Nev = s[0];
        this.Neme = s[2];
        try{
            this.Kor = Integer.parseInt(s[1]);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        
        try{
            if (s.length>3){
                this.MunkaToltEv = Integer.parseInt(s[3]);
            }
        }
        catch (NumberFormatException ex){
            this.MunkaToltEv =0;
        }
    }
    

    public String getNev() {
        return Nev;
    }
    
    public String getNeme() {
        return Neme;
    }
    
    public int getKor() {
        return Kor;
    }
    
    public int getMunkaToltEv() {
        return MunkaToltEv;
    }
}
