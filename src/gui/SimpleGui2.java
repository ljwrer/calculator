package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class SimpleGui2 {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		Panel panel=new Panel();
		Button button=new Button();
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
