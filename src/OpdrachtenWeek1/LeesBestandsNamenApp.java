package OpdrachtenWeek1;

import java.util.Scanner;

public class LeesBestandsNamenApp {
    public static void main(String[] args) {

        OpdrachtenWeek1.LeesBestandsNamen leesBestandsNamen = new OpdrachtenWeek1.LeesBestandsNamen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een bestandsnaam in: ");
        String mapnaam = scanner.nextLine();

        leesBestandsNamen.printBestandsNamen(mapnaam);
    }
}