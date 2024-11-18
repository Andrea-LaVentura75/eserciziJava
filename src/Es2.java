import java.util.Scanner;

public class Es2 {
    public void inserisciStringhe() {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire tre stringhe
        System.out.println("Inserisci la prima stringa:");
        String primaStringa = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine();

        // Stampa la concatenazione in ordine di inserimento
        System.out.println("Concatenazione in ordine: " + primaStringa + " " + secondaStringa + " " + terzaStringa);

        // Stampa la concatenazione in ordine inverso
        System.out.println("Concatenazione in ordine inverso: " + terzaStringa + " " + secondaStringa + " " + primaStringa);

        // Chiude lo scanner
        scanner.close();
    }
}