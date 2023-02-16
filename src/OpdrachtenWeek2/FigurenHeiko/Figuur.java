package OpdrachtenWeek2.FigurenHeiko;

public abstract class Figuur {
    private String achtergrondkleur = "wit";
    private String omtrekkleur = "zwart";
    private double lengteZijde1 = 1.0;

    public Figuur() {
    }

    public Figuur(String achtergrondkleur, String omtrekkleur, double lengteZijde1) {
        this.achtergrondkleur = achtergrondkleur;
        this.omtrekkleur = omtrekkleur;
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

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }
}
