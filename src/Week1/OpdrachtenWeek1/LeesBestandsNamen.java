package OpdrachtenWeek1;

import java.io.File;

public class LeesBestandsNamen {

    public void printBestandsNamen(String folder){
        File directory = new File(folder);

        if (!directory.isDirectory()) {
            System.out.println("De directory is niet gevonden");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("De directory is niet gevonden");
            System.out.println("De directory is wel gevonden, maar er zijn geen bestanden gevonden");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        LeesBestandsNamen reader = new LeesBestandsNamen();
        String folderpath = "lezen";
        reader.printBestandsNamen(folderpath);
    }

}
