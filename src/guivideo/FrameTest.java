package guivideo;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("this is a frame");
		frame.setSize(400, 1000);
		frame.setBackground(Color.blue);
		frame.setBounds(0,0,400,240);
		frame.setSize(400, 1000);
		frame.setLocation(500, 500);
		frame.setVisible(true);
	}

}
