  
import java.awt.*; 
import java.applet.*; 
//<applet code=GFG.class height=500 width=500></applet>  
public class GFG extends Applet implements Runnable { 
    private String display; 
    private int x, y, flag; 
    Thread t; 
  
    // initializing 
    // called when the applet is 
    // started. 
    public void init() 
    { 
        display = "Reethik"; 
        x = 100; 
        y = 100; 
        flag = 1; 
  
        // creating thread 
        t = new Thread(this, "MyThread"); 
  
        // start thread 
        t.start(); 
    } 
  
    // update the x co-ordinate 
    public void update() 
    { 
  
        x = x + 10 * flag; 
        if (x > 300) 
            flag = -1; 
        if (x < 100) 
            flag = 1; 
    } 
  
    // run 
    public void run() 
    { 
  
        while (true) { 
  
            // Repainting the screen 
            // calls the paint function 
            repaint(); 
  
            update(); 
            try { 
  
                // creating a pause of 1 second 
                // so that the movement is recognizable 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException ie) { 
                System.out.println(ie); 
            } 
        } 
    } 
  
    // drawString 
    public void paint(Graphics g) 
    { 
        g.drawString(display, x, y); 
    } 
}
