package OpdrachtenWeek2.IOOA_Personen;
//3. Een onderwijsmanager heeft een dynamisch aantal docenten in zijn team.
//4. Een onderwijsmanager heeft altijd precies 1 secretaresse.
//5. Een onderwijsmanager is altijd manager van 1 opleiding.

import java.util.ArrayList;

public class Onderwijsmanager implements Persoon {
    private ArrayList<Docent> docenten;
    private Secretaresse secretaresse;
    private Opleiding opleiding;

    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Onderwijsmanager(String naam, int leeftijd, int lengte, int gewicht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public int getLengte() {
        return lengte;
    }

    public int getGewicht() {
        return gewicht;
    }


    @Override
    public void werkt() {

    }
}