package OpdrachtenWeek2.FigurenHeiko;

public class Driehoek extends Figuur implements OmtrekBerekenbaar {

    private double lengteZijde1, lengteZijde2, lengteZijde3 = 1.0;
    public Driehoek() {
    }

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, String achtergrondkleur, String omtrekkleur) {
        super(achtergrondkleur, omtrekkleur, lengteZijde1);
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
    }
    public double getLengteZijde2() {
        return lengteZijde2;
    }

    public void setLengteZijde2(double lengteZijde2) {
        this.lengteZijde2 = lengteZijde2;
    }

    public double getLengteZijde3() {
        return lengteZijde3;
    }

    public void setLengteZijde3(double lengteZijde3) {
        this.lengteZijde3 = lengteZijde3;
    }

    public double berekenOmtrek() {
        return this.getLengteZijde1() * lengteZijde2 * lengteZijde3;
    }

    @Override
    public String toString(){
        return String.format("De zijden hebben de lengtes %f, %f en %f, die ervoor zorgen dat de driehoek een omtrek van %f heeft.",
                this.getLengteZijde1(), getLengteZijde2(), getLengteZijde3(), berekenOmtrek());
    }
}