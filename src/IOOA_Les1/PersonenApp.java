package IOOA_Les1;

import java.util.ArrayList;

public class PersonenApp {

    public void vindLettersEnPrint(ArrayList<Persoon> personen, String letters){

    }

    public static void main(String[] args) {

        Persoon persoon1 = new Persoon("Piet", 20);
        Persoon persoon2 = new Persoon("Puck", 25);
        Persoon persoon3 = new Persoon("Klaas", 30);
        Persoon persoon4 = new Persoon("Kees", 35);
        Persoon persoon5 = new Persoon("Roos", 21);
        Persoon persoon6 = new Persoon("Guus", 26);

        ArrayList <String> personenLijst = new ArrayList<String>();
        personenLijst.add("Piet");
        personenLijst.add("Puck");
        personenLijst.add("Klaas");
        personenLijst.add("Kees");
        personenLijst.add("Roos");
        personenLijst.add("Guus");

        System.out.println("Aantal=" + personenLijst.size());

        boolean exists = personenLijst.contains("Piet");
        System.out.println("Komt Piet voor in de personenlijst? " + exists);



    }
}
