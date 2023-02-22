package OpdrachtenWeek2.IOOA_Personen;
// De klasse Opleiding heeft de eigenschappen naam en plaats.
public class Opleiding {
    private String naam;
    private String plaats;
    public Opleiding(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getPlaats() {
        return plaats;
    }
    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}