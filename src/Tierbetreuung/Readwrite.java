package Tierbetreuung;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ae & pp
 */
public class Readwrite {

    public void writeToFile(ArrayList<Tier> listeTiere) {
        Tier tier = null;

        BufferedWriter inDatei;

        try {
            inDatei = new BufferedWriter(new FileWriter("io.txt"));
            int size = listeTiere.size();
            for (int i = 0; i < size; i++) {
                tier = listeTiere.get(i);
                /*    inDatei.write(tier.getModell());
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getReserviert()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getVerliehen()));
                inDatei.write(";");
                 */
                inDatei.write(tier.getName());
                inDatei.write(";");
                inDatei.write(tier.getAlter());
                inDatei.write(";");
                inDatei.write(tier.getStandort());
                inDatei.write(";");
                /*   inDatei.write(tier.getRueckgabe());
                inDatei.write(";");
                inDatei.write(Double.toString(tier.getKosten()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getVersicherung()));
                inDatei.write(";");
                inDatei.write(Double.toString(tier.getKostenVersicherung()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getKm_Stand()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getServiceIntervall()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getLetztesService()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getTank()));
                inDatei.write(";");
                inDatei.write(Integer.toString(tier.getPersonen()));
                 */ inDatei.newLine();
            }
            inDatei.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void readFromFile(ArrayList<Tier> listeTiere) {

        File tierFile = new File("io.csv");

        if (!tierFile.canRead() || !tierFile.isFile()) {
            System.err.println("File not found");
            System.exit(0);
        }

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("io.txt"));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {

                String[] tier = null;
                tier = zeile.split(";");

                listeTiere.add(new Tier(tier[0], tier[1], tier[2], Integer.parseInt(tier[3]), Boolean.parseBoolean(tier[4])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
