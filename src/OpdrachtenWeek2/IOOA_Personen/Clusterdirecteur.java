package OpdrachtenWeek2.IOOA_Personen;
//6. Een clusterdirecteur heeft een vast aantal van 4 onderwijsmanagers onder zich.
//7. Een clusterdirecteur heeft daarbij altijd 2 secretaresses.
//8. Een student kan altijd maar 1 opleiding volgen.

public class Clusterdirecteur implements Persoon {
    private Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
    private Secretaresse[] secretaresses = new Secretaresse[2];
    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Clusterdirecteur(String naam, int leeftijd, int lengte, int gewicht) {
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
    @Override
    public void werkt() {
        System.out.println("De directeur werkt.");
    }

    public Onderwijsmanager[] getOnderwijsmanagers() {
        return onderwijsmanagers;
    }

    public void setOnderwijsmanagers(Onderwijsmanager[] onderwijsmanagers) {
        this.onderwijsmanagers = onderwijsmanagers;
    }

    public Secretaresse[] getSecretaresses() {
        return secretaresses;
    }

    public void setSecretaresses(Secretaresse[] secretaresses) {
        this.secretaresses = secretaresses;
    }
}