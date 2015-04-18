package guivideo;

import java.awt.*;


public class FlowLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
		Button b3=new Button("Button 3");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
		f.setBounds(200, 200, 500, 500);
	}

}
