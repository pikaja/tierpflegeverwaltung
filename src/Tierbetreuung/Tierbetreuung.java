package Tierbetreuung;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import org.apache.log4j.Logger;


/**
 *
 * @authors ae & pp
 */
public class Tierbetreuung extends javax.swing.JFrame {

    Readwrite readwrite = new Readwrite();  // zugriff auf klasse für file lesen / schreiben
    DefaultComboBoxModel dcm = null;    //  drop down menü für Standort-Wahl
    DefaultListModel dlm = null;        // DefaultListModel (datentyp durch swing vorgegeben!) namens "dlm" mit wert "null" erstellen
    DefaultListModel dlmOrt = null; // DLM für Rückgabe-orte
    ArrayList<Tier> listeTiere = new ArrayList();   // array-liste, die objekte des datentyps "Tier" aufnehmen kann
    ArrayList<Tier> listeStandort = new ArrayList();  // array-liste mit tieren eines bestimmten standorts
    Katze katze;
    Hund hund;
    Kleintier kleintier;
    Tier tier;      

    final String standort1 = "Liesing";   // standorte in variablen speichern
    final String standort2 = "Favoriten";
    final String standort3 = "Neubau";
    
    public Tierbetreuung() {
        initComponents();

        dcm = new DefaultComboBoxModel();   // neues objekt namens "dcm" comboboxmodel erstellen
        menuStandortWahl.setModel(dcm);     // mein menü (menuStandortWahl = name des menüs) mit DCM verknüpfen, damit meine items in gui angezeigt werden
        dlm = new DefaultListModel();       // neues objekt namens "dlm" listmodel erstellen
        itemlistTiere.setModel(dlm);       // meine item-liste (itemlistTiere = variablenname der liste) mit DLM verknüpfen, sodass meine items in gui angelegt werden
        dlmOrt = new DefaultListModel();
        itemlistOrte.setModel(dlmOrt);      // item liste mit orten zur rückgabe wird mit gui-dlm verknüpft

        // STANDORTE in Drop Down Menü einfügen
        dcm.addElement(standort1);
        dcm.addElement(standort2);
        dcm.addElement(standort3);

        // Standorte für RÜCKGABE in GUI-Liste einfügen
        dlmOrt.addElement(standort1);
        dlmOrt.addElement(standort2);
        dlmOrt.addElement(standort3);

        // GUI-Elemente ein-/ausblenden
        resetGUI();

        // TIERE ERSTELLEN
        // KATZEN
        Katze katze1 = new Katze("Minki", "Katze", standort1, 4, true, true);
        Katze katze2 = new Katze("Tiggi", "Katze", standort2, 6, true, false);
        Katze katze3 = new Katze("Ruby", "Katze", standort3, 12, true, true);
        Katze katze4 = new Katze("Schnurli", "Katze", standort2, 5, true, false);
        Katze katze5 = new Katze("Leon", "Katze", standort1, 9, true, false);

        // zur listeTiere hinzufügen
        listeTiere.add(katze1);
        listeTiere.add(katze2);
        listeTiere.add(katze3);
        listeTiere.add(katze4);
        listeTiere.add(katze5);
  
        //HUNDE
        Hund hund1 = new Hund("Pauli", "Hund", standort2, 11, true, true, true);
        Hund hund2 = new Hund("Mrs. Bean", "Hund", standort3, 7, true, true, true);
        Hund hund3 = new Hund("Waldi", "Hund", standort1, 2, true, true, true);
        Hund hund4 = new Hund("Balu", "Hund", standort3, 7, true, true, true);
        Hund hund5 = new Hund("Clara", "Hund", standort2, 13, true, true, false);

        // zur listeTiere hinzufügen
        listeTiere.add(hund1);
        listeTiere.add(hund2);
        listeTiere.add(hund3);
        listeTiere.add(hund4);
        listeTiere.add(hund5);
 
       // KLEINTIERE
        Kleintier kleintier1 = new Kleintier("Rambo", "Frettchen", standort1, 3, true, true, true);
        Kleintier kleintier2 = new Kleintier("Lucia", "Wiesel", standort3, 5, true, true, true);
        Kleintier kleintier3 = new Kleintier("Romeo", "Hase", standort3, 2, true, false, true);
        Kleintier kleintier4 = new Kleintier("Speedy", "Ratte", standort2, 1, true, false, true);
        Kleintier kleintier5 = new Kleintier("Pinky", "Maus", standort1, 1, true, true, true);

        // zur listeTiere hinzufügen
        listeTiere.add(kleintier1);
        listeTiere.add(kleintier2);
        listeTiere.add(kleintier3);
        listeTiere.add(kleintier4);
        listeTiere.add(kleintier5);
        
        readwrite.writeToFile(listeTiere);
      //  readwrite.readFromFile(listeTiere);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuStandortWahl = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        labelStandortWahl = new javax.swing.JLabel();
        listeTiereGuiParent = new javax.swing.JScrollPane();
        itemlistTiere = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDetailsTiere = new javax.swing.JTextArea();
        btnBetreuen = new javax.swing.JButton();
        btnRueckgabe = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemlistOrte = new javax.swing.JList<>();
        btnRueckgabeBestaetigen = new javax.swing.JButton();
        toggleBtnAdmin = new javax.swing.JToggleButton();
        btnTiereUmverteilen = new javax.swing.JButton();
        btnSpaeter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuStandortWahl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liesing", "Neubau", "Favoriten" }));
        menuStandortWahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStandortWahlActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Tierbetreuung");

        labelStandortWahl.setText("Wo wollen Sie ein Tier abholen?");

        listeTiereGuiParent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        itemlistTiere.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemlistTiere.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemlistTiere.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                itemlistTierePropertyChange(evt);
            }
        });
        itemlistTiere.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                itemlistTiereVetoableChange(evt);
            }
        });
        itemlistTiere.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemlistTiereValueChanged(evt);
            }
        });
        listeTiereGuiParent.setViewportView(itemlistTiere);

        jScrollPane2.setBorder(null);

        textAreaDetailsTiere.setEditable(false);
        textAreaDetailsTiere.setBackground(new java.awt.Color(215, 217, 223));
        textAreaDetailsTiere.setColumns(14);
        textAreaDetailsTiere.setRows(5);
        textAreaDetailsTiere.setAlignmentX(1.0F);
        textAreaDetailsTiere.setAlignmentY(1.0F);
        textAreaDetailsTiere.setAutoscrolls(false);
        textAreaDetailsTiere.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textAreaDetailsTiere.setFocusable(false);
        textAreaDetailsTiere.setHighlighter(null);
        jScrollPane2.setViewportView(textAreaDetailsTiere);

        btnBetreuen.setFont(new java.awt.Font("DejaVu Sans", 0, 11)); // NOI18N
        btnBetreuen.setText("Ich möchte dieses Tier betreuen");
        btnBetreuen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBetreuenActionPerformed(evt);
            }
        });

        btnRueckgabe.setText("Rückgabe");
        btnRueckgabe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRueckgabeActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        itemlistOrte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        itemlistOrte.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        itemlistOrte.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemlistOrteValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(itemlistOrte);

        btnRueckgabeBestaetigen.setText("bestätigen");
        btnRueckgabeBestaetigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRueckgabeBestaetigenActionPerformed(evt);
            }
        });

        toggleBtnAdmin.setBackground(new java.awt.Color(255, 51, 51));
        toggleBtnAdmin.setText("ADMIN");
        toggleBtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleBtnAdminActionPerformed(evt);
            }
        });

        btnTiereUmverteilen.setBackground(new java.awt.Color(255, 102, 102));
        btnTiereUmverteilen.setText("jetzt umverteilen");
        btnTiereUmverteilen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiereUmverteilenActionPerformed(evt);
            }
        });

        btnSpaeter.setText("später");
        btnSpaeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpaeterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTiereUmverteilen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpaeter)
                        .addGap(379, 379, 379))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(toggleBtnAdmin)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuStandortWahl, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBetreuen, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRueckgabe, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnRueckgabeBestaetigen, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listeTiereGuiParent, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(241, 241, 241))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStandortWahl, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStandortWahl, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuStandortWahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(listeTiereGuiParent, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBetreuen)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRueckgabe)
                        .addComponent(btnRueckgabeBestaetigen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpaeter)
                    .addComponent(btnTiereUmverteilen))
                .addGap(40, 40, 40)
                .addComponent(toggleBtnAdmin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void menuStandortWahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStandortWahlActionPerformed
        /* >> Standort wurde ausgewählt << 
           >> Tiere werden in der Item-Liste standortabhängig angezeigt << */

        //GUI-Elemente ein-/ausblenden
        setGUIStandortWahl();

        // In Drop Down Menü gewählten Index speichern
        int index = menuStandortWahl.getSelectedIndex();

        // Gewählten Standort je nach Index in Variable "gewaehlterStandort" speichern
        String gewaehlterStandort = null;

        switch (index) {
            case 0:
                gewaehlterStandort = standort1;
                break;
            case 1:
                gewaehlterStandort = standort2;
                break;
            case 2:
                gewaehlterStandort = standort3;
                break;
        }

        /*    listeTiere mit Schleife durchlaufen
                - bei jedem Tier überprüfen, ob der Standort mit gewähltem Standort übereinstimmt
                - wenn ja: Name des Tieres wird in dlm- item-liste gespeichert
                - UND in der listeStandort >> enthält immer nur diejenigen tiere, die sich gerade am ausgewählten standort befinden!
         */
        
        dlm.removeAllElements();        // alle Tiernamen in itemListe entfernen, damit die Liste bei erneuter Standortwahl leer ist und neu befüllt werden kann
        listeStandort.clear();          // alle Objekte Tiere aus listeStandort entfernen, damit Liste danach neu befüllt werden kann

        // Prüfen, welche Tiere sich am gewählten Standort befinden 
        for (Tier aktuellesTier : listeTiere) { // liste tiere durchlaufen
            String tierStandort = aktuellesTier.getStandort();      // variable "tierStandort" enthält den standort des jeweils aktuellen tiers in der schleife

            if (tierStandort.equals(gewaehlterStandort)) {         // wenn standort des aktuellen tieres derselbe wie der im menü gewählte ist...
                listeStandort.add(aktuellesTier);                   // ... wird das aktuelle Objekt Tier der listeStandort hinzugefügt
                dlm.addElement(aktuellesTier.getArt() + " " + aktuellesTier.getName());       // und name + art in die dlm-liste gespeichert :)
                // die indizes der beiden listen (dlm und listeStandort) stimmen überein!
            }
        }
    }//GEN-LAST:event_menuStandortWahlActionPerformed

    private void itemlistTiereValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemlistTiereValueChanged
        // Details über gewähltes Tier in TextArea anzeigen

        // Inhalte der GUI-Elemente anpassen:
        textAreaDetailsTiere.setText(""); // Inhalt der TextArea mit Details über das Tier wird gelöscht, wenn ein neues Tier gewählt wird
        toggleBtnAdmin.setVisible(false); // admin-button nach auswahl eines tieres nicht mehr sichtbar!

        // GEWÄHLTES TIER
        int selectedIndex = itemlistTiere.getSelectedIndex(); // selectedIndex: Index des in GUI-liste ausgewählten Tieres
        System.out.println("Index gewähltes Tier: " + selectedIndex);  // # kontrollausgabe: Index vom gewählten Tier

        if (selectedIndex == -1){
            toggleBtnAdmin.setVisible(true);    // wenn aus der liste ein standort gewählt wird, 
        } 
        
        if (selectedIndex != -1) {          // Wenn kein Tier gewählt wurde, ist der Index -1 (= immer bei neuer standortwahl)
            btnBetreuen.setVisible(true); //button "tier betreuen" ist nur sichtbar, wenn ein Tier gewählt ist

            tier = listeStandort.get(selectedIndex);        // "tier"ist nur dann gesetzt, wenn index nicht -1 ist
            /* in Variable "tier" ist jetzt das Objekt Tier gespeichert, das in der Liste ausgewählt wurde
            die Variable kann jetzt verwendet werden, um Details über das gewählte Tier auszugeben */

            //DETAILS ZU TIER in TextArea anzeigen
            textAreaDetailsTiere.append(tier.getArt() + " " + tier.getName() + "\nAlter: " + tier.getAlter() + "\n");

            //TIERART überprüfen: Welcher Klasse gehört das Tier an?
            int klasse = 0;
            if (tier instanceof Katze) {  // wenn Katze: klasse = 1
                klasse = 1;
            }
            if (tier instanceof Hund) {   // wenn Hund: klasse = 2
                klasse = 2;
            }
            if (tier instanceof Kleintier) {  // wenn Kleintier: klasse = 3
                klasse = 3;
            }

            // Tier je nach Klasse casten und DETAILS ZUR TIERART
            switch (klasse) {
                case 1: // KATZE: Garten
                    katze = ((Katze) tier);   // gewaehltesTier wird gecastet als katze 
                    boolean garten = katze.getGarten();
                    if (garten == true) {
                        textAreaDetailsTiere.append("\nDiese Katze benötigt einen Gartenplatz!");
                    } else {
                        textAreaDetailsTiere.append("\nDiese Katze ist eine Wohnungskatze.");
                    }
                    break;
                case 2: // HUND: Kinder, Leine
                    hund = ((Hund) tier);
                    boolean kinder = hund.getMagKinder();
                    boolean leine = hund.getMagLeine();
                    if (kinder == true) {
                        textAreaDetailsTiere.append("\n" + hund.getName() + " ist kinderfreundlich");
                    } else {
                        textAreaDetailsTiere.append("\n" + hund.getName() + " mag keine Kinder");
                    }
                    if (leine == true) {
                        textAreaDetailsTiere.append("\nund muss immer an der Leine geführt werden!");
                    } else {
                        textAreaDetailsTiere.append("\nund kommt beim Freilauf verlässlich zurück.");
                    }
                    break;
                case 3: // KLEINTIER: Käfig, Freilauf
                    kleintier = ((Kleintier) tier);
                    boolean kaefig = kleintier.getKaefig();
                    boolean freilauf = kleintier.getFreilauf();
                    if (kaefig == true) {
                        textAreaDetailsTiere.append("\n" + kleintier.getName() + " kann mit Käfig abgeholt werden");
                    } else {
                        textAreaDetailsTiere.append("\n" + kleintier.getName() + " braucht einen Käfig");
                    }
                    if (freilauf == true) {
                        textAreaDetailsTiere.append("\nund braucht regelmäßig Freilauf im Zimmer!");
                    } else {
                        textAreaDetailsTiere.append("\nund sollte nur unter Beaufsichtigung frei laufen.");
                    }
                    break;
            }
        }
    }//GEN-LAST:event_itemlistTiereValueChanged


    private void btnBetreuenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBetreuenActionPerformed
        setGUIbtnBetreuen(); // gui anpassen

        //nachdem "betreuung" aktiviert, textarea wird überschrieben
        textAreaDetailsTiere.setText("Gratuliere,\nbitte holen Sie " + tier.getName() + " in " + tier.getStandort() + " ab. \nWir wünschen eine Schöne Zeit mit " + tier.getName() + "! :)");

        //wenn das tier betreut wird, wird verfügbarkeit auf false gesetzt und standort auf null
        tier.setVerfuegbar(false);
        tier.setStandort(null);

    }//GEN-LAST:event_btnBetreuenActionPerformed

    private void itemlistTierePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_itemlistTierePropertyChange

    }//GEN-LAST:event_itemlistTierePropertyChange

    private void itemlistTiereVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_itemlistTiereVetoableChange

    }//GEN-LAST:event_itemlistTiereVetoableChange

    private void btnRueckgabeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRueckgabeActionPerformed

        setGUIrueckgabe();  // GUI Elemente ein-/ausblenden

        textAreaDetailsTiere.setText("\n\nWenn du dein Tier zurückbringen möchtest,\ndann wähle bitte einen Standort aus.");
    }//GEN-LAST:event_btnRueckgabeActionPerformed

    private void btnRueckgabeBestaetigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRueckgabeBestaetigenActionPerformed

        //GUI btnRueckgabeBestaetigen nach einmal klicken DEAKTIVIEREN
        btnRueckgabeBestaetigen.setEnabled(false);  //deaktivert
        itemlistOrte.setEnabled(false); //deaktivert
        btnRueckgabe.setVisible(false); //unsichtbar gesetzt

        // GEWÄHLTEN ORT ERMITTELN
        String selectedIndexOrt = itemlistOrte.getSelectedValue(); // selectedIndexOrte: Value des in GUI-liste ausgewählten Orte.
        System.out.println("Index gewählter Ort: " + selectedIndexOrt);  // # kontrollausgabe: Index vom gewählten Ort

        //TIER wird neuer Standort zugewiesen 
        tier.setStandort(selectedIndexOrt);
        tier.setVerfuegbar(true); //tier ist wieder verfügbar

        //## KONTROLLAUSGABE
        System.out.println(tier.getName());
        System.out.println("hat nun folgenden Standort: " + tier.getStandort());
        System.out.println("und ist nun " + tier.getVerfuegbar());
        textAreaDetailsTiere.setText("");

        resetGUI();
    }//GEN-LAST:event_btnRueckgabeBestaetigenActionPerformed

    // METHODE COUNT STANDORT (Wie viele Tiere befinden sich auf welchem Standort?)
    private Integer[] countStandort() {
        Integer countStandort[] = new Integer[3];  // array mit 3 plätzen
        countStandort[0] = 0;
        countStandort[1] = 0;
        countStandort[2] = 0;

        // TIERE PRO STANDORT ZÄHLEN
        for (Tier aktuellesTier : listeTiere) { // liste tiere durchlaufen
            String tierStandort = aktuellesTier.getStandort();      // variable "tierStandort" enthält den standort des jeweils aktuellen tiers in der schleife
            if (tierStandort.equals(standort1)) {
                countStandort[0]++;
            }
            if (tierStandort.equals(standort2)) {
                countStandort[1]++;
            }
            if (tierStandort.equals(standort3)) {
                countStandort[2]++;
            }
        }
        return countStandort;
    }

    private void toggleBtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleBtnAdminActionPerformed
        //ADMIN --> Soll Warnung bekommen, wenn zuviele Tiere an einem Standort  
        //überprüfen, wie viele tiere an welchem standort
        //variablen, in der die Anzahl der Tiere nach Standort gespeichert werden
        
        Integer countStandort[] = countStandort();  // methode tiere zählen aufrufen
        int countStandort1 = countStandort[0];
        int countStandort2 = countStandort[1];
        int countStandort3 = countStandort[2];

        //Anzeige für Admin: Wo sind wie viele Tiere?
        textAreaDetailsTiere.setText(standort1 + ": " + countStandort1 + " Tiere\n");
        textAreaDetailsTiere.append(standort2 + ": " + countStandort2 + " Tiere\n");
        textAreaDetailsTiere.append(standort3 + ": " + countStandort3 + " Tiere\n\n");

        // wenn auf allen Standorten gleich viele Tiere sind
        if (countStandort1 == countStandort2 && countStandort2 == countStandort3) {
            textAreaDetailsTiere.append("Auf allen Standorten befinden sich " + countStandort1 + " Tiere.\nDie Tiere sind optimal verteilt.");
        } else {
            textAreaDetailsTiere.append("Tiere sind ungleich verteilt!\n");
            setGUIadmin();  // umverteilen-button einblenden
        }
    }//GEN-LAST:event_toggleBtnAdminActionPerformed

    private void itemlistOrteValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemlistOrteValueChanged
        //AUSGABE FÜR USER, WELCHEN STANDORT ER GEWÄHLT HAT
        String selectedIndexOrt = itemlistOrte.getSelectedValue(); // selectedIndexOrte: Value des in GUI-liste ausgewählten Orte.
        textAreaDetailsTiere.setText("Bitte bringe das Tier\n zu folgendem Standort zurück:");
        textAreaDetailsTiere.append("\n" + selectedIndexOrt);
        btnRueckgabeBestaetigen.setEnabled(true);
    }//GEN-LAST:event_itemlistOrteValueChanged

    private void btnTiereUmverteilenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiereUmverteilenActionPerformed
        // tiere umverteilen!        

        Integer countStandort[] = countStandort();  // methode tiere zählen aufrufen
        int countStandort1 = countStandort[0];
        int countStandort2 = countStandort[1];
        int countStandort3 = countStandort[2];

        if (countStandort1 == countStandort2 && countStandort2 == countStandort3) {  // wenn auf allen Standorten gleich viele Tiere sind
            textAreaDetailsTiere.setText("Auf allen Standorten befinden sich " + countStandort1 + " Tiere.\nDie Tiere sind optimal verteilt.");
        }

        // VERTEILUNG BERECHNEN
        //MINIMUM UND MAXIMUM
        String max = null;  // Standort mit den meisten Tieren
        String min = null;   // Standort mit den wenigsten Tieren
        textAreaDetailsTiere.setText("");   // vor Schleife: clear TextArea
        while ((countStandort1 != countStandort2) || (countStandort2 != countStandort3) || (countStandort3 != countStandort2)) {  // solange nicht überall gleich viele tiere sind
            if (countStandort1 >= countStandort2) {
                max = standort1;        // String "standort1" ist nun in String "max" gespeichert, weiil er der größte ist
                min = standort2;
                if (countStandort3 > countStandort1) {   // wenn 3 noch größer ist: max = 3
                    max = standort3;
                }
                if (countStandort3 < countStandort2) {
                    min = standort3;
                }
            } else if (countStandort3 > countStandort2) {
                max = standort3;
                min = standort1;
            } else {
                max = standort2;
                min = standort1;
                if (countStandort3 < countStandort1) {
                    min = standort3;
                }
            }

            // UMVERTEILEN
            //jetzt steht in "min" der standort mit den wenigsten tieren und in max der standort mit den meisten tieren
            // nun muss die liste tiere durchgegangen werden, getstandort vom aktuellen tier, wenn standort = max >> setstandort zu min
            for (Tier aktuellesTier : listeTiere) { // liste tiere durchlaufen
                String tierStandort = aktuellesTier.getStandort();      // variable "tierStandort" enthält den standort des jeweils aktuellen tiers in der schleife
                if (max.equals(tierStandort)) {
                    textAreaDetailsTiere.append(aktuellesTier.getName() + " wurde von " + aktuellesTier.getStandort());
                    aktuellesTier.setStandort(min);
                    textAreaDetailsTiere.append(" nach " + aktuellesTier.getStandort() + " gebracht.\n");
                    break;
                }
            }
            // tiere nochmal zählen
            Integer countStandort0[] = countStandort();
            countStandort1 = countStandort0[0];
            countStandort2 = countStandort0[1];
            countStandort3 = countStandort0[2];
       
        }

        if (countStandort1 == countStandort2 && countStandort2 == countStandort3) {  // wenn auf allen Standorten gleich viele Tiere sind
            textAreaDetailsTiere.append("\n\nAuf allen Standorten befinden sich nun " + countStandort1 + " Tiere.\n\n");
            textAreaDetailsTiere.append(standort1 + ": " + countStandort1 + " Tiere\n");
            textAreaDetailsTiere.append(standort2 + ": " + countStandort2 + " Tiere\n");
            textAreaDetailsTiere.append(standort3 + ": " + countStandort3 + " Tiere");

        }

        //#TESTAUSGABE  ANZAHL DER TIERE PRO STANDORT + maximum + minimum
        System.out.println("Anzahl der Tiere in: " + standort1 + " " + countStandort1);
        System.out.println("Anzahl der Tiere in: " + standort2 + " " + countStandort2);
        System.out.println("Anzahl der Tiere in: " + standort3 + " " + countStandort3);
        System.out.println("Die meisten Tiere sind in: " + max);
        System.out.println("Die wenigsten Tiere sind in: " + min);

        resetGUI();
    }//GEN-LAST:event_btnTiereUmverteilenActionPerformed

    private void btnSpaeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpaeterActionPerformed
        resetGUI();
        textAreaDetailsTiere.setText("");
    }//GEN-LAST:event_btnSpaeterActionPerformed

    private void resetGUI() {
        // GUI wird nach Rückgabe wieder wie bei Programmstart angezeigt
        btnTiereUmverteilen.setVisible(false);
        itemlistOrte.setVisible(false);
        btnRueckgabeBestaetigen.setVisible(false);
        btnRueckgabeBestaetigen.setEnabled(true);
        itemlistTiere.setEnabled(true);
        btnRueckgabe.setEnabled(true);
        btnBetreuen.setEnabled(true);
        btnBetreuen.setVisible(false);
        itemlistOrte.setEnabled(true);
        labelStandortWahl.setVisible(true);
        menuStandortWahl.setVisible(true);
        menuStandortWahl.setEnabled(true);
        itemlistTiere.setVisible(false); // GUI: liste mit tieren bei programmstart nicht sichtbar
        toggleBtnAdmin.setVisible(true);
        btnSpaeter.setVisible(false);
    }

    private void setGUIrueckgabe() {
        // GUI-Settings bei Klick auf Button "Rückgabe" [btnRueckgabe]
        btnRueckgabe.setEnabled(false); // Button Rückgabe deaktiviert
        btnRueckgabeBestaetigen.setVisible(true);   // Button Rückgabe bestätigen sichtbar
        btnRueckgabeBestaetigen.setEnabled(false);   // Button Rückgabe bestätigen noch  nicht aktiv (erst bei auswahl eines standortes)
        itemlistTiere.setVisible(false); //Liste der Tiere nicht sichtbar
        menuStandortWahl.setVisible(false); // Drop Down Standortwahl nicht sichtbar
        itemlistOrte.setVisible(true); //Orte zur Rückgabe werden angezeigt.
    }

    private void setGUIStandortWahl() {
        // beim betreuen der tiere
        // Inhalte der GUI-Elemente anpassen:
        itemlistTiere.setVisible(true); // erst dann, wenn standort aus drop-down gewählt ist, wird die liste mit den tiernamen sichtbar
        textAreaDetailsTiere.setText(""); // text Area mit Details über Tier wird gelöscht, wenn ein neuer Standort gewählt wird
        btnBetreuen.setVisible(false); //button "tier betreuen" nicht sichtbar
        btnRueckgabe.setVisible(false); //button nicht sichtbar
        toggleBtnAdmin.setVisible(true); // button admin nach standortwahl sichtbar (aber nicht nach tierwahl)

    }

    private void setGUIadmin() {
        btnTiereUmverteilen.setVisible(true);
        btnSpaeter.setVisible(true);
        menuStandortWahl.setEnabled(false);
        labelStandortWahl.setVisible(false);
    }

    private void setGUIbtnBetreuen() {
        //GUI button "betreuen" nicht mehr sichtbar, sobald einmal gewählt
        btnBetreuen.setEnabled(false);
        btnRueckgabe.setVisible(true); //GUI btn Rückgabe ab jetzt verfügbar
        itemlistTiere.setEnabled(false); //GIU Liste der Tiere nicht mehr sichtbar, nachdem ein Tier ausgewählt wurde
        menuStandortWahl.setEnabled(false); //GUI Liste mit Standorten auch nicht mehr sichtbar
        labelStandortWahl.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tierbetreuung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tierbetreuung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tierbetreuung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tierbetreuung.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tierbetreuung().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBetreuen;
    private javax.swing.JButton btnRueckgabe;
    private javax.swing.JButton btnRueckgabeBestaetigen;
    private javax.swing.JButton btnSpaeter;
    private javax.swing.JButton btnTiereUmverteilen;
    private javax.swing.JList<String> itemlistOrte;
    private javax.swing.JList<String> itemlistTiere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelStandortWahl;
    private javax.swing.JScrollPane listeTiereGuiParent;
    private javax.swing.JComboBox<String> menuStandortWahl;
    private javax.swing.JTextArea textAreaDetailsTiere;
    private javax.swing.JToggleButton toggleBtnAdmin;
    // End of variables declaration//GEN-END:variables

}

/* #
            PROBLEM (gelöst durch instance of!) wie können wir auf attribute der klasse "katze" "kleintier" etc. zugreifen?
             >> es gibt nur eine liste mit "tieren", in denen sich auch "katzen" befinden, aber auf katze.getGarten() kann man nicht zugreifen
            idee: listen mit hunden, katzen und kleintieren schrieben (siehe ganz oben)
            dann switch-case mit tierart machen, und das tier als katze/hund/kleintier speichern
            #*/
//WELCHE TIERE SIND VERFÜGBAR  >> aus "button admin" entfernt und ersetzt durch switch case standort
/* auskommentiert um es mit listeTiere (ohne liste verfTier) zu machen # pp
        for (Tier verfTier : listeTiere) { //liste tiere durchlaufen
            //String tierStandort = aktuellesTier.getStandort(); 
            System.out.append("\n" + verfTier.getName());
            System.out.append("\n" + verfTier.getStandort());

            //1.verfuegbare Tiere werden in ArrayList gespeichert.
            if (verfTier.verfuegbar != false) {
                System.out.println("\n***verfuegbar\n" + verfTier.getName());
                verfuegbareTiere.add(verfTier.getStandort());

            } else {
                System.out.println("\nnicht verfuegbar");
            }
        }
       
                
        //# KONTROLLAUSGABE DES ARRAYS
     //   System.out.println("arrayliste verfuegbareTiere" + verfuegbareTiere);
 */

 /*
        
        
        
        if (countStandort1 >= 4) {        //ÜBERPRÜFE, ob mehr als 4 Tiere sind, wenn ja Ausgabe
            System.out.println("VORSICHT!! Zuviele Tiere am Standort\n--> " + standort1 + countStandort1);
            System.out.println("Es dürfen nicht mehr als 4 Tiere in " + standort1 + " sein!");
            textAreaDetailsTiere.append("!! VORSICHT !!\n Es sind zuviele Tiere in " + standort1 + "--> " + countStandort1);
            textAreaDetailsTiere.append("\nWillst du die Tiere umverteilen?");
            btnTierUmverteilen.setVisible(true);

        } else if (countStandort2 >= 2) {    //Überprüfen, ob mehr als 2 Tiere in Favoriten sind, wenn ja Ausgbabe
            System.out.println("VORSICHT!!Es sind ZU VIELE TIERE am Standort" + standort2 + "!\n--> " + countStandort2);
            textAreaDetailsTiere.append("!! VORSICHT !!\nEs sind zu viele Tiere in " + standort2 + "-->" + countStandort2);
            textAreaDetailsTiere.append("\nWillst du die Tiere umverteilen?");
            btnTierUmverteilen.setVisible(true);

        } //anzahl der Tiere in Neubau
        else if (countStandort3 >= 3) {
            System.out.println("VORSICHT!!Es sind ZUVIELE TIERE am Standort " + standort3 + "\n-->" + countStandort3);
            textAreaDetailsTiere.append("!! VORSICHT !!\n Es sind ZUVIELE TIERE n " + standort3 + "-->" + countStandort3);
            textAreaDetailsTiere.append("\nWillst du die Tiere umverteilen?");
            btnTierUmverteilen.setVisible(true);
        }
 */

 /*  
        #### tiere zählen ausgelagert in methode mit array! ###
        falls methode funktioniert: das hier löschen
        
        // TIERE PRO STANDORT ZÄHLEN
        for (Tier aktuellesTier : listeTiere) { // liste tiere durchlaufen
            String tierStandort = aktuellesTier.getStandort();      // variable "tierStandort" enthält den standort des jeweils aktuellen tiers in der schleife
            switch (tierStandort) {
                case standort1:
                    countStandort1++;
                    break;
                case standort2:
                    countStandort2++;
                    break;
                case standort3:
                    countStandort3++;
                    break;
            }
        }*/
