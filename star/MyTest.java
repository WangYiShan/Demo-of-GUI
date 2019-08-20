/**
*漫天星星
**/
import java.awt.*;
import java.awt.event.*;

public class MyTest{
	public static void main(String[] args){
		Frame w = new Frame();
		w.setSize(1014,768);
		w.setBackground(Color.BLACK);
		w.setTitle("漫天星星");
		MyPanel mp = new MyPanel();
		w.add(mp);
		w.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		w.show();
	}
}

class MyPanel extends Panel{
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		for(int i=0;i<300;i++){
			g.drawString("*",(int)(Math.random()*1024),(int)(Math.random()*1024));
		}
	}
}