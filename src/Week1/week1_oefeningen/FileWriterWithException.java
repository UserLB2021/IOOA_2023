package Week1.week1_oefeningen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterWithException {

    String fileName = "rekening-en-saldo.txt";

    File file = new File("./src/week_1_oefeningen/tekstbestand.txt");
    File myFile;
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;

    public static void main(String[] args) {
        FileWriterWithException app = new FileWriterWithException();
        app.schrijfNaarFile();
    }
    public void schrijfNaarFile() {
        try {
            this.myFile = new File(fileName);
            this.fileWriter = new FileWriter(myFile, true);
            printWriter = new PrintWriter(fileWriter);

            printWriter.print("44444 ");
            printWriter.print("44.00\n");

            System.out.println("String naar file geschreven.");
        } catch (IOException ioe) {
            System.out.println("Exception opgetreden: " + ioe.toString());
            System.out.println("Stack trace:");
            ioe.printStackTrace();
        } finally {
            printWriter.close();
            ;
            try {
                fileWriter.close();
            } catch (IOException ioe) {
            }
        }
    }
}