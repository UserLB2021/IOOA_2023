package OpdrachtenWeek1;

import java.io.*;

public class LeesSteden {
    public void printStedenUitBestand(String bestandnaam) {
        File bestand = new File(bestandnaam);
        try (FileReader reader = new FileReader(bestand)){
            try(BufferedReader bufferedReader = new BufferedReader(reader)) {
                String regel = bufferedReader.readLine();
                while(regel != null) {
                    System.out.println(regel.split(" ")[0]);
                    regel = bufferedReader.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("bestand bestond niet");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("er is iets fout gegaan");
        }
    }
}