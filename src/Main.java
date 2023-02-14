import Week1.LeesSteden;
import Week1.SchrijfBestand;

public class Main {
    public static void main(String[] args) {

        new SchrijfBestand().schrijfStedenNaarBestand("plaatsten.txt");
        new LeesSteden().printStedenUitBestand("plaatsen.txt");
    }
}