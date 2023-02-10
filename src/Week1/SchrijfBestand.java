package Week1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SchrijfBestand {

    public void schrijfStedenNaarBestand(String bestandnaam) {
        File bestand = new File(bestandnaam);
        try(FileWriter writer = new FileWriter(bestand, true)) {
            try(PrintWriter printer = new PrintWriter(writer)) {
                printer.println("Amsterdam 900000");
                printer.println("Bunnink 500");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//In de method voeg je het volgende toe aan plaatsen.txt
//o Amsterdam 900000
//o Bunnink 500
//- Gebruik dan weer LeesSteden om de inhoud van het tekstbestand opnieuw te tonen op
//console