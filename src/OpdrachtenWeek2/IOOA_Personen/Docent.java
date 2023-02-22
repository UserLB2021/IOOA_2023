package OpdrachtenWeek2.IOOA_Personen;
//1. Een docent geeft les aan een klas met studenten, waarbij het aantal verschilt
// 2. Een docent geeft les bij uitsluitend opleiding.

import java.util.ArrayList;

public class Docent implements Persoon{
    private ArrayList<Student> studenten;
    private Opleiding opleiding;

    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Docent(String naam, int leeftijd, int lengte, int gewicht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
    public int getLengte() {
        return lengte;
    }
    public void setLengte(int lengte) {
        this.lengte = lengte;
    }
    public int getGewicht() {
        return gewicht;
    }
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public Opleiding getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }
    @Override
    public void werkt() {
        System.out.println("De docent geeft les.");

    }
}