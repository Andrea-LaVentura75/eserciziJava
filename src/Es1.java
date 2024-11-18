import java.util.Scanner;
public class Es1 {

    Scanner scanner= new Scanner(System.in);

    public void moltiplica() {
        System.out.println("inserisci il primo numero");
        int a = scanner.nextInt();

        System.out.println("inserisci il secondo numero");
        int b = scanner.nextInt();

        int risultato = a * b; // Calcolo la moltiplicazione
        System.out.println("Il risultato della moltiplicazione è: " + risultato);
    }

    public void concatena(String stringa, int a) {
        System.out.println(stringa + a);
    }

    public String[] inserisciInArray(String[] arrayOriginale, String nuovaStringa) {
        // Controllo che l'array originale abbia esattamente 5 elementi
        if (arrayOriginale.length != 5) {
            throw new IllegalArgumentException("L'array originale deve avere esattamente 5 elementi.");
        }
        String[] nuovoArray = new String[6];

        nuovoArray[0] = arrayOriginale[0];
        nuovoArray[1] = arrayOriginale[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = arrayOriginale[2];
        nuovoArray[4] = arrayOriginale[3];
        nuovoArray[5] = arrayOriginale[4];

        return nuovoArray;
    }

}
