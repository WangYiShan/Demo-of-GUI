/**
*主程序启动类
**/
import java.awt.*;
import java.awt.event.*;
public class MyTest{
	public static void main(String[] args){
		Frame w = new Frame();
		w.setLocation(500,200);
		w.setTitle("乌龟图");
		w.setSize(300,400);
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