
public class SPIELSTEIN
{
    protected int x, y, radius, farbe;
    
    public SPIELSTEIN(int xStart, int yStart, int radiusStart, int farbStart)
    {
        x=xStart;
        y=yStart;
        radius = radiusStart;
        farbe = farbStart;
    }
    
    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().fuelleKreis(x,y,radius,farbe);        
    }    
}
