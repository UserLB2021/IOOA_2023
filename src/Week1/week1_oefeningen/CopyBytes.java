package Week1.week1_oefeningen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException  {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("originele_tekst.txt");
            out = new FileOutputStream("gekopierde_tekst.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
//I/O Streams: voorbeeld
//Aandachtspunten
//• Als je met I/O werkt, moet je gebruik maken van een Try-Catch constructie.
//• In de finally-clausule worden de input stream en output stream gesloten.