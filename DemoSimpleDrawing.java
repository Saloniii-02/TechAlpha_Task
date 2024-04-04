import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

class FDemo extends Frame
{
FDemo()
{
	Font f=new Font("Broadway",Font.BOLD,25);
	setFont(f);
	
}
public void paint(Graphics g)
{//flaf


	
	Color c1=new Color(255,138,21);
	g.setColor(c1);
    g.fillRect(100,100,220,65);
	
	Color c2=new Color(255,255,255);
	g.setColor(c2);
	g.drawOval(100,150,220,65);
     g.fillRect(100,150,220,65);
    //g.drawArc(110,150,50,50,0,360);
	
	Color c3=new Color(0,98,0);
	g.setColor(c3);
    g.fillRect(100,200,220,65);
	
	
	// Draw Ashoka Chakra
        int x = 200; // x-coordinate of the center of the chakra
        int y = 175; // y-coordinate of the center of the chakra
        int radius = 25; // radius of the chakra

        // Draw the 24 spokes
        g.setColor(Color.BLUE); // Color of the spokes
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15); // 360 degrees / 24 spokes = 15 degrees per spoke
            int x1 = (int) (x + radius * Math.cos(angle));
            int y1 = (int) (y + radius * Math.sin(angle));
            int x2 = (int) (x + (radius - 10) * Math.cos(angle));
            int y2 = (int) (y + (radius - 10) * Math.sin(angle));
            g.drawLine(x1, y1, x2, y2);
        }

        // Draw the outer circle of the chakra
        g.setColor(Color.BLUE);
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);

        // Draw the inner circle of the chakra
        g.setColor(Color.BLUE);
        g.fillOval(x - 5, y - 5, 10, 10);
	
	
	//stand
	Color c4=new Color(120,67,21);
	g.setColor(c4);
	g.fillRect(55,700,90,40);
	g.fillRect(35,722,130,40);
	g.fillRect(15,744,170,40);	
	g.fillRect(95,95,5,635);
	//cloud 1
	Color c5=new Color(131,208,209);
	g.setColor(c5);
	//g.fillArc(600,50,50,50,90,270);
	g.fillOval(600,50,90,50);
	g.fillOval(660,60,90,50);
	g.fillOval(620,85,90,50);
	//cloud 2
	g.fillOval(950,50,90,50);
	g.fillOval(1010,60,90,50);
	g.fillOval(970,85,90,50);
	//building
	g.setColor(Color.pink);
	g.fillRect(600,400,200,390);
	g.setColor(Color.red);
	g.drawString("TECH ALPHA INTERNSHIP",525,390);
	g.fillRect(550,400,300,20);
	
	
}


}
class Demo5
{
public static void main(String ar[])
{
FDemo f=new FDemo();

f.setVisible(true);
f.setSize(1500,1000);
f.setLocation(20,20);

f.setBackground(Color.yellow);
}
}


