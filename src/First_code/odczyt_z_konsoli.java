package First_code;

import java.util.Scanner;

public class odczyt_z_konsoli {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);       // klasa skanera do odczytu
        String password = console.nextLine();           // odczyt hasła  metodą nextLine()


        Scanner console = new Scanner(System.in);       // klasa skanera do odczytu
        int ceny = console.nextInt();                   // odczyt ceny  metodą nextInt()



        // Tworzymy obiekt Scanner do odczytu danych z klawiatury
        Scanner console = new Scanner(System.in);

        // Pobieramy i odczytujemy imię gracza
        System.out.println("Podaj imię gracza:");
        String playerName = console.nextLine();

        // Pobieramy i odczytujemy wiek gracza
        System.out.println("Podaj wiek gracza:");
        int playerAge = console.nextInt();

        // Najpierw wypisujemy wiek, potem imię, każde w nowej linii
        System.out.println(playerAge);
        System.out.println(playerName);
    }
}


