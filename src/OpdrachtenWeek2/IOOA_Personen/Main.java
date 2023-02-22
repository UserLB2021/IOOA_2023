package OpdrachtenWeek2.IOOA_Personen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persoon> personenLijst = new ArrayList<Persoon>();
        personenLijst.add(new Clusterdirecteur("Lisa", 25, 175, 62));
        personenLijst.add(new Docent("Irene", 30, 177, 60));
        personenLijst.add(new Onderwijsmanager("Joelle", 35, 170, 70));
        personenLijst.add(new Secretaresse("Jannie", 55, 165, 58));
        personenLijst.add(new Student("Diana", 22, 166, 69));

        for (Persoon persoon : personenLijst) {
            persoon.werkt();
        }
        //for (Persoon persoon : personenLijst) {
            //System.out.println(persoon.toString());
        //}
    }
}