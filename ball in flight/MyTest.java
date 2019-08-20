/**
*ball in flight
**/
import java.awt.*;
import java.awt.event.*;

public class MyTest{
	public static void main(String[] args){
		Frame w = new Frame();
		w.setTitle("ball in flight");
		w.setSize(300,400);
		w.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		MyPanel mp = new MyPanel();
		w.add(mp);
		Thread th = new Thread(mp);
		th.start();
		w.show();
	}
}
class MyPanel extends Panel implements Runnable{
	int x = 30;
	int y = 30;
	int flag = 0;//0 lower right;1 left lower;2 left upper;3 right upper;
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x,y,20,20);
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(30);
			}catch(Exception e){
				
			}
			if(x>263){
				if(flag==0){
					flag = 1;
				}else{
					flag = 2;
				}
			}
			if(y>341){
				if(flag==1){
					flag = 2;
				}else{
					flag = 3;
				}
			}
			if(x<0){
				if(flag == 2){
					flag = 3;
				}else{
					flag = 0;
				}
			}
			if(y<0){
				if(flag == 3){
					flag = 0;
				}else{
					flag = 1;
				}
			}
			
			//lower right
			if(flag==0){
				x++;
				y++;
			}
			//left lower
			if(flag==1){
				x--;
				y++;
			}
			//left upper
			if(flag==2){
				y--;
				x--;
			}
			//right upper
			if(flag==3){
				x++;
				y--;
			}
			repaint();
		}
	}
}