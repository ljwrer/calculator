package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleGui3D{
	JFrame frame;
	JLabel lable;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGui3D sg3=new SimpleGui3D();
		sg3.go();
	}
	public void go(){
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button=new JButton("Change colors");
		JButton button1=new JButton("Change lable");
		lable=new JLabel("lable");
		button.addActionListener(new ButtonActionListener());
		button1.addActionListener(new LableActionListener());
		Mydrawpaint1 drawPane1=new Mydrawpaint1();
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.CENTER,drawPane1);
		frame.getContentPane().add(BorderLayout.WEST,lable);
		frame.getContentPane().add(BorderLayout.NORTH,button1);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
	}
	class LableActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			lable.setText("lable changed"+" "+(int)(Math.random()*10));
		}	
	}
	class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			frame.repaint();
		}
		
	}
 
}
class Mydrawpaint1 extends JPanel{
	public void paintComponent(Graphics g){
		Graphics2D g2d1=(Graphics2D)g;
		int red=((int)(Math.random()*255));
		int green=((int)(Math.random()*255));
		int blue=((int)(Math.random()*255));
		Color startColor=new Color(red, green, blue);
		red=((int)(Math.random()*255));
		green=((int)(Math.random()*255));
		blue=((int)(Math.random()*255));
		Color endColor=new Color(red, green, blue);
		GradientPaint gradient=new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d1.setPaint(gradient);
		g2d1.fillOval(70, 70, 100, 100);
	}
}
