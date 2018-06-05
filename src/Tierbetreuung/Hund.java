package Tierbetreuung;

import org.apache.log4j.Logger;

/**
 *
 * @authors ae & pp
 */

public class Hund extends Tier {

    private final boolean magKinder;
    private final boolean magLeine;

    final static Logger logger = Logger.getLogger(Hund.class);

    public Hund(String name, String art, String standort, int alter, boolean verfuegbar, boolean magKinder, boolean magLeine) {
        super(name, art, standort, alter, verfuegbar);
        this.magKinder = magKinder;
        this.magLeine = magLeine;
    }

    public boolean getMagKinder() {
        return magKinder;
    }

    public boolean getMagLeine() {
        return magLeine;
    }
}
