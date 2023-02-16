package OpdrachtenWeek2.FigurenHeiko;

public class Vierkant extends Figuur implements OmtrekBerekenbaar {

    public Vierkant() {
    }

    public Vierkant(double lengteZijde1, String achtergrondkleur, String omtrekkleur) {
        super(achtergrondkleur, omtrekkleur, lengteZijde1);
    }
    @Override
    public double berekenOmtrek(){
        return this.getLengteZijde1() * 4;
    }
    @Override
        public String toString(){
        return String.format("De zijden hebben elk een lengte van %f, die ervoor zorgen dat het vierkant een omtrek van %f heeft.",
                this.getLengteZijde1(), this.berekenOmtrek());
    }
}