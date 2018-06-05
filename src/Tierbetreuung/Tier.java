package Tierbetreuung;

/**
 *
 * @authors ae & pp
 */
public class Tier {

    private final String name;
    private final String art;
    private String standort;    // darf nicht final sein
    private final int alter;
    public boolean verfuegbar; // darf nicht final sein

    public Tier(String name, String art, String standort, int alter, boolean verfuegbar) {
        this.name = name;
        this.art = art;
        this.standort = standort;
        this.alter = alter;
        this.verfuegbar = verfuegbar;
    }

    public String getName() {
        return name;
    }

    public String getArt() {
        return art;
    }

    public void setStandort(String standort) {  // braucht set-Methode, weil es geändert werden kann
        this.standort = standort;
    }

    public String getStandort() {
        return standort;
    }

    public int getAlter() {
        return alter;
    }

    public void setVerfuegbar(boolean verfuegbar) { // braucht set-Methode, weil es geändert werden kann
        this.verfuegbar = verfuegbar;
    }

    public boolean getVerfuegbar() {
        return verfuegbar;
    }


@Override
        public String toString(){
             
        String str;
        if (this.verfuegbar == true) {
            str =  "verfuegbar";
           // System.out.println("Das Tier ist noch nicht betreut!!!");
            return "verfuegbar";
        } else {
            str = "nicht verfuegbar";
           // System.out.println("Das Tier ist schon in Betreuung");
            return "nicht verfuegbar***";
        }
    
        
    }
        
    

    public void umverteilen() {
        /*admin kann tiere umverteilen
         = setStandort >> standort ändern
         */
    }

    
 

    }
