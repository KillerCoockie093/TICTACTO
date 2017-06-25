
public class BKREIS
{
    private SPIELSTEIN blau;
    private int x,y,radius;
    
    public BKREIS(int xStart, int yStart, int rStart)
    {
        x = xStart;
        y = yStart;
        radius = rStart;
        blau = new SPIELSTEIN(x,y,radius,2);
    }

    public void zeichne()
    {
        blau.zeichne();
    }
}
