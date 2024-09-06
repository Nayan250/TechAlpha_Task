import java.awt.*;
import java.applet.Applet;
import java.util.*;
//<applet code="Main.class" width="350" height="200"></applet>
public class Main extends Applet implements Runnable{
	Thread t,t1;
	public void start(){
		t=new Thread(this);
		t.start();
	}
	public void run(){
		t1=Thread.currentThread();
		while(t1==t){
			repaint();
			try{
				t1.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
	public void paint(Graphics g){
		Calendar cal=new GregorianCalendar();
		String h=String.valueOf(cal.get(Calendar.HOUR));
		String m=String.valueOf(cal.get(Calendar.MINUTE));
		String s=String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(h + ":" + m + ":" + s,20,30);
	}
}