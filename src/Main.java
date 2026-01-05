import java.util.Scanner;

class Esercizio {


    public static int moltiplica(int a, int b) {
        return a * b;
    }


    public static String concatena(String testo, int numero) {
        return testo + numero;
    }


    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];

        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = nuovaStringa;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }


    public static void main(String[] args) {

        int risultato = moltiplica(3, 4);
        System.out.println("Risultato moltiplica: " + risultato);

        String concatenata = concatena("Numero: ", 5);
        System.out.println(concatenata);

        String[] array = {"A", "B", "C", "D", "E"};
        String[] nuovoArray = inserisciInArray(array, "X");

        System.out.println("Nuovo array:");
        for (String s : nuovoArray) {
            System.out.println(s);
        }
    }}











