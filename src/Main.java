import OpdrachtenWeek1.LeesSteden;
import OpdrachtenWeek1.SchrijfBestand;

public class Main {
    public static void main(String[] args) {

        new SchrijfBestand().schrijfStedenNaarBestand("plaatsten.txt");
        new LeesSteden().printStedenUitBestand("plaatsen.txt");
    }
}