/**
* 画乌龟
**/
import java.awt.*;

class MyPanel extends Panel{
	public void paint(Graphics g){
		//设置画笔颜色为绿色
		g.setColor(new Color(146,192,68));
		//绘制头部，直接使用填充椭圆
		g.fillOval(120,50,50,60);
		//绘制眼睛，眼睛为白色，眼球为黑色
		g.setColor(Color.WHITE);
		g.fillOval(130,60,10,10);
		g.fillOval(150,60,10,10);
		g.setColor(Color.BLACK);
		g.fillOval(130,60,8,8);
		g.fillOval(150,60,8,8);
		
		//绘制脚
		g.setColor(new Color(146,192,68));
		g.fillOval(70,100,50,60);
		g.fillOval(180,100,50,60);
		g.fillOval(70,200,50,60);
		g.fillOval(180,200,50,60);
		
		//绘制尾巴
		g.setColor(new Color(146,192,68));
		g.fillOval(70,100,50,60);
		g.fillOval(180,100,50,60);
		g.fillOval(150,220,25,70);
		g.setColor(Color.WHITE);
		g.fillOval(160,230,25,70);
		
		//绘制身体，颜色设置为灰绿色
		g.setColor(new Color(125,167,28));		
		g.fillOval(85,95,130,160);
		g.setColor(new Color(59,106,25));		
		g.fillOval(90,100,120,150);
		//绘制身体纹路
		
		
	}
}