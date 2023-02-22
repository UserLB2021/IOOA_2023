package OpdrachtenWeek2.IOOA_Personen;

public class Secretaresse implements Persoon {

    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Secretaresse(String naam, int leeftijd, int lengte, int gewicht) {
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
        System.out.println("De secretaresse werkt.");
    }
}