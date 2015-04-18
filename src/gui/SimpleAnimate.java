package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimate {
	int x=70;
	int y=50;
	int xc=3;
	int yc=3;
	public static void main(String[] args) {
		SimpleAnimate flash=new SimpleAnimate();
		flash.go();
	}
	public void go(){
			JFrame frame=new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MyPanel myPanel=new MyPanel();
			frame.getContentPane().add(myPanel);
			frame.setSize(300, 300);
			frame.setVisible(true);
			System.out.println(myPanel.getWidth()+" "+frame.getWidth());
			System.out.println(myPanel.getHeight()+" "+frame.getHeight());
			for(int i=0;i<1300;i++)
			{
				if(x<0||x>myPanel.getWidth())
				{
					System.out.println(myPanel.getWidth()+" "+frame.getWidth());
					System.out.println(myPanel.getHeight()+" "+frame.getHeight());
					xc=-xc;
				}
				if(y<0||y>myPanel.getHeight())
				{
					System.out.println(myPanel.getWidth()+" "+frame.getWidth());
					System.out.println(myPanel.getHeight()+" "+frame.getHeight());
					yc=-yc;
				}
				x+=xc;
				y+=yc;
				frame.repaint();
				try{
					Thread.sleep(50);
				}
				catch(Exception ex){
					
				}
			}
		}
		class MyPanel extends JPanel{
			public void paintComponent(Graphics g) {
//				g.setColor(Color.white);
//				g.fillRect(0, 0, this.getWidth(), this.getHeight());
				g.setColor(Color.green);
				g.fillOval(x, y, 40, 40);
			}
		}

}
