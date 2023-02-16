package Week1.OpdrachtenWeek1;

public class BestandenLezenSchrijvenApp {
    public static void main(String[] args) {
        OpdrachtenWeek1.LeesSteden leesSteden = new OpdrachtenWeek1.LeesSteden();
        OpdrachtenWeek1.SchrijfBestand schrijfBestand = new OpdrachtenWeek1.SchrijfBestand();

        leesSteden.printStedenUitBestand("plaatsen.txt");
        schrijfBestand.schrijfStedenNaarBestand("plaatsen.txt");
        leesSteden.printStedenUitBestand("plaatsen.txt");
    }
}