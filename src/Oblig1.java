import javax.crypto.spec.PSource;
import java.util.Arrays;

/// Denne obligen er levert av: Andreas Rud Zimmer, S344051.

public class Oblig1 {

    public static void main(String[] args) {

        System.out.println("Høyeste tallet i listen er: " + maks(new int[]{1, 2, 3, 333, 100002, 4, 5, 65, 7, 8, 9, 10, 9999}));

        System.out.println("Antall ombyttinger er: " + ombyttinger(new int[]{1, 2, 3, 333, 100002, 4, 5, 65, 7, 8, 9, 10, 9999}));

        System.out.println("Antall forskjellige tall i listen er: " + antallUlikeSotert(new int[]{1,1,1,2,2,3,3,3,5,5,5,5,6,6,7,7,8}));

        int a[] = {1, -1, -2, 2, 6, 2, 8, 13};
        delsortering(a);

        System.out.println();

        char b[] = {'a','b','c','d','k','l','h'};
        rotasjon(b);

    }


    ///Oppgave 1, del 1
    public static int maks(int[] a) {

        int minus = 1;
        int holder = 0;
        for (int i = 0; i < a.length - minus; i++) {
            if (a[i] > a[i + 1]) {
                holder = a[i + 1];
                a[i + 1] = a[i];
                a[i] = holder;

            }
        }
        return a[a.length - minus];
    }


    ///Oppgave 1, del 2
    public static int ombyttinger(int[] a) {
        int minus = 1;
        int holder = 0;
        int tellerOmbyttinger = 0;
        for (int i = 0; i < a.length - minus; i++) {
            if (a[i] > a[i + 1]) {
                holder = a[i + 1];
                a[i + 1] = a[i];
                a[i] = holder;
                tellerOmbyttinger++;
            }

        }
        return tellerOmbyttinger;

    }


    ///Oppgave 2


    public static int antallUlikeSotert(int[] a){

        int teller = 0;

        for(int i = 0; i < a.length-1; i++){
            if (a[i] < a[i+1]){
                teller++;
            }
            ///Mangler IllegalStateExpectation.
        }
        if (teller > 0){
            teller++;
        }
        return teller;
    }

    /// Oppgave 3
    public static int antallUlikeUsotert(int[] a){
        return 1;
    }

    /// Oppgave 4
    public static void delsortering(int[] a){

        int venstre = 0, høyre = a.length - 1;
        while (venstre < høyre)
        {
            while (a[venstre]%2 == 0 && venstre < høyre)
                venstre++;

            while (a[høyre]%2 == 1 && venstre < høyre)
                høyre--;


            if (venstre < høyre)
            {
                int temp = a[venstre];
                a[venstre] = a[høyre];
                a[høyre] = temp;
                venstre++;
                høyre--;
            }
        }
        for (int i = 0; i < a.length; i++) {

            if (a[i]<0)
            {a[i]=a[i]*-1;}
            System.out.print(a[i] + " ");
        }
    }

    ///Oppgave 5

    public static void rotasjon(char[] a){
        char huske = a[a.length-1];
        for(int i = a.length-1; i > 0; i--)
        {
            a[i]=a[i-1];
        }
        a[0] = huske;
        System.out.print(a);


    }

}

