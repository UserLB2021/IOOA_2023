package OpdrachtenWeek2.FigurenHeiko;

//Maak een driehoek, vierkant en vierhoek aan en bewaar deze 3 in één ArrayList. De
//eigenschappen van elk object mag je zelf verzinnen. Laat vervolgens van elk object de
//eigenschappen zien op het beeldscherm.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figuur> figuren = new ArrayList<>(Arrays.asList(
                new Driehoek(),
                new Vierkant(),
                new Vierhoek()));
        for (Figuur f : figuren) {
            System.out.println(f);

        }
    }

}
