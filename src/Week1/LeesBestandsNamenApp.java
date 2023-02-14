package Week1;

import java.util.Scanner;

public class LeesBestandsNamenApp {
    public static void main(String[] args) {

        LeesBestandsNamen leesBestandsNamen = new LeesBestandsNamen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer een bestandsnaam in: ");
        String mapnaam = scanner.nextLine();

        leesBestandsNamen.printBestandsNamen(mapnaam);
    }
}