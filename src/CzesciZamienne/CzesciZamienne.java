package CzesciZamienne;
/**
 *
 * @author rafal0191
 */
public class CzesciZamienne {
    private Bateria bateria;
    private DyskTwardy dyskTwardy;
    private KartaGraficzna kartaGraficzna;
    private Matryca matryca;
    private Naped naped;
    private PlytaGlowna plytaglowna;
    private Procesor procesor;
    private Radiator radiator;
    private Wentylator wentylator;
    private Zasilacz zasilacz;
    
    public CzesciZamienne(){
        bateria         =   new Bateria();     
        dyskTwardy      =   new DyskTwardy();
        kartaGraficzna  =   new KartaGraficzna();
        matryca         =   new Matryca();
        naped           =   new Naped();
        plytaglowna     =   new PlytaGlowna();
        procesor        =   new Procesor();
        radiator        =   new Radiator();
        wentylator      =   new Wentylator();
        zasilacz        =   new Zasilacz();
        System.out.println("Utworzono obiekt klasy CzesciZamienne");
    }
}
