package OpdrachtenWeek2.FigurenHeiko;

public class Vierhoek extends Figuur implements OmtrekBerekenbaar {
    private double lengteZijde2 = 1.0;


    public Vierhoek() {
    }

    public Vierhoek(double lengteZijde1, double lengteZijde2, String achtergrondkleur, String omtrekkleur) {
        super(achtergrondkleur, omtrekkleur, lengteZijde1);
        this.lengteZijde2 = lengteZijde2;

    }

    public double getLengteZijde2() {
        return lengteZijde2;
    }

    public void setLengteZijde2(double lengteZijde2) {
        this.lengteZijde2 = lengteZijde2;
    }
    @Override
    public double berekenOmtrek(){
        return this.getLengteZijde1() * this.getLengteZijde1() * this.lengteZijde2 * this.lengteZijde2;
    }
    @Override
    public String toString(){
        return String.format("" +
                        "De zijden hebben elk een lengte van %f en %f, die ervoor zorgen dat de vierhoek een omtrek van %f heeft.",
                this.getLengteZijde1(), getLengteZijde2(), this.berekenOmtrek());
    }
}
