package OpdrachtenWeek1.week1_oefeningen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException; import java.io.FileReader;
import java.io.IOException;
         public class FileReaderWithException {

         // verander de file name om een FileNotFoundException te genereren.
         String fileName = "tekstbestand.txt";

             File myFile;
         FileReader fileReader;
         BufferedReader bufReader;
         public static void main(String[] args) {

             FileReaderWithException app = new FileReaderWithException();
             app.leesVanFile();
         }
         public void leesVanFile() {

            try {
                this.myFile = new File(fileName);
                this.fileReader = new FileReader(myFile);
                this.bufReader = new BufferedReader(fileReader);

                String regel = bufReader.readLine();

                while(regel != null) {
                    System.out.println(regel);
                    regel = bufReader.readLine();
                }
                bufReader.close();
                fileReader.close();

            } catch (FileNotFoundException fnfe) {

                System.out.println("Exception opgetreden: " + fnfe.toString());
                System.out.println("Stack trace:");
                fnfe.printStackTrace();

            } catch (IOException ioe) {
                System.out.println("Exception opgetreden: " + ioe.toString());
                System.out.println("Stack trace:");
                ioe.printStackTrace();
            }
         }
    }