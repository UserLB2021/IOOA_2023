package IOOA_Les1;

public class Persoon {

    String naam;
    int leeftijd;

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

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String bevatLetters(String letters) {

        return letters;
    }
}
