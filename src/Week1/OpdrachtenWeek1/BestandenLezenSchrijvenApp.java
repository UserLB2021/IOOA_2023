package OpdrachtenWeek1;

public class BestandenLezenSchrijvenApp {
    public static void main(String[] args) {
        LeesSteden leesSteden = new LeesSteden();
        SchrijfBestand schrijfBestand = new SchrijfBestand();

        leesSteden.printStedenUitBestand("plaatsen.txt");
        schrijfBestand.schrijfStedenNaarBestand("plaatsen.txt");
        leesSteden.printStedenUitBestand("plaatsen.txt");
    }
}