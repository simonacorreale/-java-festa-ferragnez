/* 

State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)
Consegna:
Creare un progetto java-festa-ferragnez a cui aggiungere la classe CheckGuest
Nel programma bisogna:
- creare e inizializzare l’array contenente i nomi degli invitati
- chiedere all’utente come si chiama
- verificare che il nome sia presente nella lista
- lasciarlo entrare o rispedirlo cortesemente da dove è venuto :sunglasses:
Bonus
se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa
Buon lavoro e buon weekend! :slightly_smiling_face: :tada:
Lista invitati:
Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic
 */

import java.util.Scanner;

public class CheckGuest{

    public static void main(String[] args) throws Exception {
        String[] guestArray = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del tuo invitato:");
        String myNameString = scanner.nextLine();
        System.out.println(myNameString);
        
        int guestNumber = guestArray.length;
        System.out.println(guestNumber);
    }
}
