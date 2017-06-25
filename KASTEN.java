
public class KASTEN
{
    private int links;
    private int oben; 

    public KASTEN(int links0, int oben0)
    {
        links=links0;
        oben=oben0;
    }

    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().zeichneRechteck(links,oben,100,100);
    }
}
