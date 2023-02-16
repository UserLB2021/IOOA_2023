package OpdrachtenWeek2.Figuren.Figuren;

public class Vierkant implements Figuur {
    private double lengteZijde1 = 1.0;
    private String achtergrondkleur = "wit";
    private String omtrekkleur = "zwart";
    public Vierkant() {

    }
    public Vierkant(double lengteZijde1, String achtergrondkleur, String omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }
    public double getLengteZijde1() {
        return lengteZijde1;
    }
    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }
    public String getAchtergrondkleur() {
        return achtergrondkleur;
    }
    public void setAchtergrondkleur(String achtergrondkleur) {
        this.achtergrondkleur = achtergrondkleur;
    }
    public String getOmtrekkleur() {
        return omtrekkleur;
    }
    public void setOmtrekkleur(String omtrekkleur) {
        this.omtrekkleur = omtrekkleur;
    }
    @Override
    public double berekenOmtrek() {
        return lengteZijde1 * 4;
    }
    @Override
    public String toString() {
        return "De zijden hebben elk een lengte van " + lengteZijde1 + ", die ervoor zorgen dat het " +
                "vierkant een omtrek van " + berekenOmtrek() + " heeft.";
    }
}