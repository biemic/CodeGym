package First_code;

public class zamiana_tekstu_na_cyfry_i_dodawanie {
    public static void main(String[] args) {
        // Punkty przychodzą jako tekstowe ciągi z liczbami ujemnymi
        String runda = "-10";
        String runda2 = "-25";

        // Konwertujemy ciągi na liczby typu int
        int cyfry = Integer.parseInt(runda);
        int cyfry2 = Integer.parseInt(runda2);

        // Dodajemy wyniki dwóch rund
        int suma = cyfry + cyfry2;


        // Wyświetlamy łączny wynik na ekranie
        System.out.println(suma);
    }
}
