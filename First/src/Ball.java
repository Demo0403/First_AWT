/*
 * author:Mask
 * version:1.0
 */

import java.awt.*;
import javax.swing.*;

//导入两个必要包

public class Ball extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//设置图片
	
	double x = 100;
	double y = 100;
	//设置x，y轴
	
	boolean test = true;
	
	double degree = 3.14/3;
	//设置球体状态
	
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		//绘画球体与球桌
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		if(y >= 450 || y <= 50) {
			degree = -degree;
		}
		
		if(x>=810 || x <= 10) {
			degree = 3.14-degree;
		}
		
//		if(test) {
//			x+=20;
//		}
//		else {
//			x-=20;
//		}
//		//设置球体运动速度
//		
//		if(x >= 810) {
//			test = false;
//		}
//		else if(x <= 10) {
//			test = true;
//		}
//		//设置球体状态
		
	}
	public void launchFrame() {
		setSize(856,500);
		//设置窗口大小
		setLocation(50,50);
		//设置窗口位置
		setVisible(true);
		//设置可见性
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		Ball game = new Ball();
		game.launchFrame();
	}
}
