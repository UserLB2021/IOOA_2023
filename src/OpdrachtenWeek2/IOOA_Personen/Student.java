package OpdrachtenWeek2.IOOA_Personen;

public class Student implements Persoon {
    private Opleiding opleiding;
    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Student(String naam, int leeftijd, int lengte, int gewicht) {
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
        System.out.println("De student studeert.");

    }
}
