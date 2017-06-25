
public class SPIELFELD
{
    private KASTEN kasten1, kasten2, kasten3, kasten4, kasten5, kasten6, kasten7, kasten8, kasten9;
    
    public SPIELFELD()
    {
        kasten1 = new KASTEN(50,50);
        kasten2 = new KASTEN(150,50);
        kasten3 = new KASTEN(250,50);
        kasten4 = new KASTEN(50,150);
        kasten5 = new KASTEN(150,150);
        kasten6 = new KASTEN(250,150);
        kasten7 = new KASTEN(50,250);
        kasten8 = new KASTEN(150,250);
        kasten9 = new KASTEN(250,250);
    }

    public void zeichne()
    {
        kasten1.zeichne();
        kasten2.zeichne();
        kasten3.zeichne();
        kasten4.zeichne();
        kasten5.zeichne();
        kasten6.zeichne();
        kasten7.zeichne();
        kasten8.zeichne();
        kasten9.zeichne();
    }
}