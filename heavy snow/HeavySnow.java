/**
*heavy snow
**/
import java.awt.*;
import java.awt.event.*;

public class HeavySnow{
	public static void main(String[] args){
		Frame w = new Frame();
		w.setSize(1024,600);
		w.setLocation(200,50);
		w.setTitle("heavy snow");
		w.setBackground(Color.BLACK);
		MyPanel mp = new MyPanel();
		w.add(mp);
		w.show();
		w.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		Thread th = new Thread(mp);
		th.start();
	}
}

class MyPanel extends Panel implements Runnable{
	int[] x = new int[300];
	int[] y = new int[300];
	public MyPanel(){
		for(int i=0;i<300;i++){
			x[i] = (int)(Math.random()*1000);
			y[i] = (int)(Math.random()*600);
		}
	}
	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		for(int i=0;i<300;i++){
			g.drawString("*",x[i],y[i]);
		}
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(5);
				for(int i=0;i<300;i++){
					y[i]++;
					if(y[i]>600){
						y[i] = 0;
					}
				}
			}catch(Exception e){
				
			}
			repaint();
		}
	}
}