package OpdrachtenWeek2.Figuren.Figuren;

import java.util.ArrayList;
import java.util.List;

public class FigurenApp {
    public static void main(String[] args) {
        ArrayList<Figuur> figuurList = new ArrayList<Figuur>();
        figuurList.add(new Driehoek());
        figuurList.add(new Vierkant());
        figuurList.add(new Vierhoek());
        for (Figuur f : figuurList) {
            System.out.println(f);
        }
    }
}