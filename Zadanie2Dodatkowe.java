import java.util.Random;
import java.util.Scanner;

public class Zadanie2Dodatkowe
{
    /*
    Zadanie 2.
Napisz program, który dla zadanej tablicy typu int zwraca:a:
Największą wartość.
Najmniejszą wartośćc.
Sumę wszystkich wartościd.
Wartośćśredniąe.
Medianę.
Tablica ma być generowana dynamicznie na podstawie losowych wartości (patrz Random),
 użytkownik na wstępie powinien podać rozmiar tablicy.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Podaj rozmiar tablicy");
        int dlugoscTablicy = sc.nextInt();
        int[] tab = new int [dlugoscTablicy];
        // generato test
        int i;
        for ( i = 0;i<dlugoscTablicy;i++)
        {
            Random generator = new Random();
            tab[i]= generator.nextInt(100);
            System.out.print(" "+tab[i]);
        }
//poszukmay najwieksza wartosc

    }
}
