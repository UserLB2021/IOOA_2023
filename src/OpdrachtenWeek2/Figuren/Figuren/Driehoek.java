package OpdrachtenWeek2.Figuren.Figuren;

public class Driehoek implements Figuur {
    private double lengteZijde1 = 1.0;
    private double lengteZijde2 = 1.0;
    private double lengteZijde3 = 1.0;
    private String achtergrondkleur = "wit";
    private String omtrekkleur = "zwart";

    public Driehoek() {}

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, String achtergrondkleur,
                    String omtrekkleur) {
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
    }
    public double getLengteZijde1() {
                return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
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

    @Override()
    public double berekenOmtrek() {
        return lengteZijde1 + lengteZijde2 + lengteZijde3;
    }

    @Override
    public String toString() {
        return "De zijden hebben de lengtes " + lengteZijde1 + ", " + lengteZijde2 + " en " +
                lengteZijde3 + ", die ervoor zorgen dat de driehoek een omtrek van " + berekenOmtrek() + " heeft.";
    }
}