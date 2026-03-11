import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;
public class Ex_event_handling extends Applet implements MouseListener
{
    StringBuffer strBuffer;
    public void init()
    {
        addMouseListener(this);
        strBuffer = new StringBuffer();
        addItem("initializing the applet\n");
    }
    public void start()
    {
        addItem("\n starting the applet\n");
    }
    public void stop()
    {
        addItem("\n stopping the applet\n");
    }
    public void destroy()
    {
        addItem("\n unloading the applet\n");
    }
    void addItem(String word)
    {
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawRect(0, 0,
                getWidth() -1,
                getHeight() - 1);
        g.drawString(strBuffer.toString(), 20, 10);
    }
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseClicked(MouseEvent event)
    {
        addItem("\n mouse clicked!\n");
    }
}
