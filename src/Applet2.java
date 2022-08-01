import java.awt.*;

public class Applet2 extends Applet1{

    public void paint(Graphics g){
         g.setColor(Color.red);
         g.drawString("Emmanuel Mugejjera",50,25);
        g.drawString("One one",60,40);
        g.drawString("Two two",60,50);
        g.drawString("Three three",70,60);
            g.drawRect(170,100,100,100);
            g.fillRect(170,100,100,100);
        g.drawOval(500,300,200,200);
        g.drawArc(400,200,100,100,100,270);

    }
}
