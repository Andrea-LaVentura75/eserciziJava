import java.util.Scanner;

public class Es3 {

    Scanner scanner = new Scanner(System.in);

    public void perimetroRettangolo() {
        // Inserimento altezza
        System.out.println("Inserisci altezza rettangolo:");
        double altezza = scanner.nextDouble(); // Accetta numeri decimali

        // Inserimento larghezza
        System.out.println("Inserisci larghezza rettangolo:");
        double larghezza = scanner.nextDouble(); // Accetta numeri decimali

        // Calcolo del perimetro
        double calcoloPerimetro = 2 * (altezza + larghezza);
        System.out.println("Il perimetro del rettangolo è: " + calcoloPerimetro);
    }

    public void pariDispari() {
        System.out.println("Inserisci numero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero è pari");
        } else {
            System.out.println("il numero  è dispari");
        }
    }

    public void areaTriangolo(){
        System.out.println("Inserisci altezza rettangolo:");
        double altezza = scanner.nextDouble();

        System.out.println("Inserisci base rettangolo:");
        double base = scanner.nextDouble();

        double calcoloArea= (base * altezza)/2;

        System.out.println("l'area del triangolo è: " + calcoloArea);
    }
}
