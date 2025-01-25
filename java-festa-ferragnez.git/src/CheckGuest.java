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

// Se nel file viene inserito <-- (sono note per me che metto per ricordare i passaggi e tenerli fissi, ho problemi di memoria.)

import java.util.Arrays;
import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {

        // Inizializzo Array
        String[] guestArray = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("Lista degli invitati: " + Arrays.toString(guestArray));

        // Inserisco nome guest
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String myNameGuest = scanner.nextLine();
        
        // Verifico se il nome è nella lista tramite una booleana per il check della condizione e il metodo "equalsIgnoreCase" serve per confrontare due stringhe e appiattire la differenza tra maiuscolo e minusocolo
        boolean userValid = false; //<-- inizializzo il valore booleando di user is valid settando l'elemento in false.
        for (int i = 0; i < guestArray.length; i++) { /* <-- i < guestArray.length; significa "finché il valore di i è inferiore alla lunghezza dell'array guestArray", dove guestArray.length restituisce il numero di elementi presenti nell'array.
                                                        Ad esempio, se guestArray ha 10 elementi, guestArray.length sarà uguale a 10. Quindi, il ciclo continuerà finché i è inferiore a 10 (ovvero, quando i è da 0 a 9). Quando i arriva a 10, la condizione diventa falsa e il ciclo termina. */
            if (guestArray[i].equalsIgnoreCase(myNameGuest)) {//<-- equalsIgnoreCase nella documentazioen di java corrisponde alla possibilità di ignorare maiuscole o minuscole 

                userValid = true;//<-- soddisfo il requisito della condizione perchè viene restituito come vero
                break; //<-- Interruzione
            }
        }
        
        // Stampo il messaggio corrispondente alla condizione che ho segnalato sopra
        if (userValid) {// la condizione "userValid è stata soddisfatta nel for sopra e se risulta true il messaggio viene stampato"
            System.out.println("Benvenuto alla festa, " + myNameGuest + "!!!");
        } else {//viceversa se il messaggio nella condizione for superiore risulta non presente, semplicemente l'utente non entra :(
            System.out.println("Mi dispiace sono desolato che tu abbia fatto tutta questa strada :(, " + myNameGuest + ". Non sei sulla lista degli invitati, BUTTAFUORIIIIIII, QUALCUNO CHIAMI IL BUTTAFUORIIIIIIIIIII!!!!!");
        }
    }
}
