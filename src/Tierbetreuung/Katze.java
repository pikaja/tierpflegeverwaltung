package Tierbetreuung;

/**
 *
 * @author ae & pp
 */
public class Katze extends Tier {

    private final boolean garten;

    public Katze(String name, String art, String standort, int alter, boolean verfuegbar, boolean garten) {
        super(name, art, standort, alter, verfuegbar);
        this.garten = garten;
    }

    public boolean getGarten() {
        return this.garten;
    }

}
