import java.applet.Applet;
import java.awt.Graphics;
public class helloworld extends Applet
{
    @Override 
    public void paint(Graphics g)
    {
        g.drawString("hello world", 20, 20);
    }
}
