import javax.swing.*;
import java.awt.event.*;

public class SPIEL implements KeyListener
{
    private SPIELFELD spielfeld;
    private BKREIS bk1,bk2,bk3,bk4,bk5,bk6,bk7,bk8,bk9;
    private GKREIS gk1,gk2,gk3,gk4,gk5,gk6,gk7,gk8,gk9;
    private JButton nspiel;
    private int spielezahl;
    private int bs1, bs2, bs3, bh1, bh2, bh3, bd1, bd2;
    private int gs1, gs2, gs3, gh1, gh2, gh3, gd1, gd2;
    private int f1,f2,f3,f4,f5,f6,f7,f8,f9 = 0;
    private static int z1,z2,z3,z4,z5,z6,z7,z8,z9 = 0;
    private KeyListener KeyHandler;

    public SPIEL()
    {
        spielfeld= new SPIELFELD();
        spielezahl = 1;
        
        nspiel = new JButton("Erneut Spielen!");
        nspiel.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    zeichne();
                }
            }
        );
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(nspiel,"unten");
    }
    
    public void zeichne()
    {
        spielfeld.zeichne();
    }
    
    public void nSpiel()
    {
        ZEICHENFENSTER.gibFenster().loescheAlles();
        zeichne();
        spielezahl = 1;
        f1 = 0;
        f2 = 0;
        f3 = 0;
        f4 = 0;
        f5 = 0;
        f6 = 0;
        f7 = 0;
        f8 = 0;
        f9 = 0;
    }
    
    public void maleZeichen()
    {
        if((spielezahl/2) !=0)
        {
            if(spielezahl < 10)
            {
                if((z1 == 1) && (f1 == 0))
                {
                    bk1= new BKREIS(100,100,40);
                    bk1.zeichne();
                    spielezahl++;
                    f1 = 1;
                    bs1++;
                    bh1++;
                    bd1++;
                    prüfe();
                }
                else if((z2 == 1) && (f2 == 0))
                {
                    bk2= new BKREIS(200,200,40);
                    bk2.zeichne();
                    spielezahl++;
                    f2 = 1;
                    bs2++;
                    bh1++;
                    prüfe();
                }
                else if((z3 == 1) && (f3 == 0))
                {
                    bk3= new BKREIS(300,100,40);
                    bk3.zeichne();
                    spielezahl++;
                    f3 = 1;
                    bs3++;
                    bh1++;
                    bd2++;
                    prüfe();
                }
                
                else if((z4 == 1) && (f4 == 0))
                {
                    bk4= new BKREIS(100,200,40);
                    bk4.zeichne();
                    spielezahl++;
                    f4 = 1;
                    bs1++;
                    bh2++;
                    prüfe();
                }
                
                else if((z5 == 1) && (f5 == 0))
                {
                    bk5= new BKREIS(200,200,40);
                    bk5.zeichne();
                    spielezahl++;
                    f5 = 1;
                    bs2++;
                    bh2++;
                    bs1++;
                    bd2++;
                    prüfe();
                }
                
                else if((z6 == 1) && (f6 == 0))
                {
                    bk6= new BKREIS(300,200,40);
                    bk6.zeichne();
                    spielezahl++;
                    f6 = 1;
                    bs3++;
                    bh2++;
                    prüfe();
                }
                
                else if((z7 == 1) && (f7 == 0))
                {
                    bk7= new BKREIS(100,300,40);
                    bk7.zeichne();
                    spielezahl++;
                    f7 = 1;
                    bs1++;
                    bh3++;
                    bd2++;
                    prüfe();
                }
                
                else if((z8 == 1) && (f8 == 0))
                {
                    bk8= new BKREIS(200,300,40);
                    bk8.zeichne();
                    spielezahl++;
                    f8 = 1;
                    bs2++;
                    bh3++;
                    prüfe();
                }
                
                else if((z9 == 1) && (f9 == 0))
                {
                    bk9= new BKREIS(300,300,40);
                    bk9.zeichne();
                    spielezahl++;
                    f9 = 1;
                    bs3++;
                    bh3++;
                    bd1++;
                    prüfe();
                }
            }
        }
        else
        {
            if(spielezahl < 10)
            {
                if((z1 == 1) && (f1 == 0))
                {
                    gk1= new GKREIS(100,100,40);
                    gk1.zeichne();
                    spielezahl++;
                    f1 = 1;
                    gs1++;
                    gh1++;
                    gd1++;
                    prüfe();
                }
                else if((z2 == 1) && (f2 == 0))
                {
                    gk2= new GKREIS(200,100,40);
                    gk2.zeichne();
                    spielezahl++;
                    f2 = 1;
                    gs2++;
                    gh1++;
                    prüfe();
                }
                
                else if((z3 == 1) && (f3 == 0))
                {
                    gk3= new GKREIS(300,100,40);
                    gk3.zeichne();
                    spielezahl++;
                    f3 = 1;
                    gs3++;
                    gh1++;
                    gd2++;
                    prüfe();
                }
                
                else if((z4 == 1) && (f4 == 0))
                {
                    gk4= new GKREIS(100,200,40);
                    gk4.zeichne();
                    spielezahl++;
                    f4 = 1;
                    gs1++;
                    gh2++;
                    prüfe();
                }
                
                else if((z5 == 1) && (f5 == 0))
                {
                    gk5= new GKREIS(200,200,40);
                    gk5.zeichne();
                    spielezahl++;
                    f5 = 1;
                    gs2++;
                    gh2++;
                    gs1++;
                    gd2++;
                    prüfe();
                }
                
                else if((z6 == 1) && (f6 == 0))
                {
                    gk6= new GKREIS(300,200,40);
                    gk6.zeichne();
                    spielezahl++;
                    f6 = 1;
                    gs3++;
                    gh2++;
                    prüfe();
                }
                
                else if((z7 == 1) && (f7 == 0))
                {
                    gk7= new GKREIS(100,300,40);
                    gk7.zeichne();
                    spielezahl++;
                    f7 = 1;
                    gs1++;
                    gh3++;
                    gd2++;
                    prüfe();
                }
                
                else if((z8 == 1) && (f8 == 0))
                {
                    gk8= new GKREIS(200,300,40);
                    gk8.zeichne();
                    spielezahl++;
                    f8 = 1;
                    gs2++;
                    gh3++;
                    prüfe();
                }
                
                else if((z9 == 1) && (f9 == 0))
                {
                    gk9= new GKREIS(300,300,40);
                    gk9.zeichne();
                    spielezahl++;
                    f9 = 1;
                    gs3++;
                    gh3++;
                    gd1++;
                    prüfe();
                }
            }
        }
    }
    
    public void prüfe()
    {
        if(bs1 == 3 || bs2 == 3 || bs3 == 3 || bh1 == 3 || bh2 == 3 || bh3 == 3 || bd1 == 3 || bd2 == 3)
        {
            System.out.println("Blau hat gewonnen!");
            spielezahl = 10;
        }
        else if(gs1 == 3 || gs2 == 3 || gs3 == 3 || gh1 == 3 || gh2 == 3 || gh3 == 3 || gd1 == 3 || gd2 == 3)
        {
            System.out.println("Gelb hat gewonnen!");
            spielezahl = 10;
        }
    }
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_NUMPAD1){
            z7 = 1;
        }

        if(e.getKeyCode()==KeyEvent.VK_NUMPAD2){
            z8 = 1;
        }

        if(e.getKeyCode()==KeyEvent.VK_NUMPAD3){
            z9 = 1;
        }

        if(e.getKeyCode()==KeyEvent.VK_NUMPAD4){
            z4 = 1;
        }

        if(e.getKeyCode()==KeyEvent.VK_NUMPAD5){
            z5 = 1;
        }

        if(e.getKeyCode()==KeyEvent.VK_NUMPAD6){
            z6 = 1;
        }
        
        if(e.getKeyCode()==KeyEvent.VK_NUMPAD7){
            z1 = 1;
        }
        
        if(e.getKeyCode()==KeyEvent.VK_NUMPAD8){
            z2 = 1;
        }
        
        if(e.getKeyCode()==KeyEvent.VK_NUMPAD9){
            z3 = 1;
        }
    }
    
    public void keyReleased(KeyEvent e){}
    
    public void keyTyped(KeyEvent e){}
}