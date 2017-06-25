
public class GKREIS
{
    private SPIELSTEIN gelb;
    private int x,y,radius;
    
    public GKREIS(int xStart,int yStart, int rStart)
    {
        x = xStart;
        y = yStart;
        radius = rStart;
        gelb = new SPIELSTEIN(x,y,radius,6);
    }

    public void zeichne()
    {
        gelb.zeichne();
    }
}
