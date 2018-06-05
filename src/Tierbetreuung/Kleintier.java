package Tierbetreuung;

/**
 *
 * @authors ae & pp
 */
public class Kleintier extends Tier {

    //eigenheiten Kleintier
    private final boolean kaefig;
    private final boolean freilauf;

    public Kleintier(String name, String art, String standort, int alter, boolean verfuegbar, boolean kaefig, boolean freilauf) {
        super(name, art, standort, alter, verfuegbar);
        this.kaefig = kaefig;
        this.freilauf = freilauf;
    }

    public boolean getKaefig() {
        return kaefig;
    }

    public boolean getFreilauf() {
        return freilauf;
    }

}
