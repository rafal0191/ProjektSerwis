
package Konto;

/**
 *
 * @author dmar625
 */
public class Konto {
    
    private Imie imie;
    private Nazwisko nazwisko;
    private Miejscowosc miejscowosc;
    private KodPocztowy kodpocztowy;
    private Telefon telefon;
    private HistoriaNapraw historianapraw;
    private StatusNaprawy statusnaprawy;
    
    public Konto(){
     imie           =    new Imie();
     nazwisko       =    new Nazwisko();
     miejscowosc    =    new Miejscowosc();
     kodpocztowy    =    new KodPocztowy();
     telefon        =    new Telefon();
     historianapraw =    new HistoriaNapraw();
     statusnaprawy  =    new StatusNaprawy();
     System.out.println("Utworzono obiekt klasy Konto");
    }
    
}
