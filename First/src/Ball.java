/*
 * author:Mask
 * version:1.0
 */

import java.awt.*;
import javax.swing.*;

//����������Ҫ��

public class Ball extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//����ͼƬ
	
	double x = 100;
	double y = 100;
	//����x��y��
	
	boolean test = true;
	
	double degree = 3.14/3;
	//��������״̬
	
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		//�滭����������
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
//		//���������˶��ٶ�
//		
//		if(x >= 810) {
//			test = false;
//		}
//		else if(x <= 10) {
//			test = true;
//		}
//		//��������״̬
		
	}
	public void launchFrame() {
		setSize(856,500);
		//���ô��ڴ�С
		setLocation(50,50);
		//���ô���λ��
		setVisible(true);
		//���ÿɼ���
		
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
