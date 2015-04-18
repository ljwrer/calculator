package guivideo;

import java.awt.Color;
import java.awt.Frame;

public class MutiFrameTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f1=new MyFrame(0, 0, 200, 200, Color.black);
		MyFrame f2=new MyFrame(200, 0, 200, 200, Color.green);
		MyFrame f3=new MyFrame(0, 200, 200, 200, Color.yellow);
		MyFrame f4=new MyFrame(200, 200, 200, 200, Color.pink);
		
	}

}
class MyFrame extends Frame{
	static int id=0;
	public MyFrame(int x,int y,int a,int b,Color color)
	{
		super("frame "+id++);
		setBounds(x, y, a, b);
		this.setBackground(color);
		setVisible(true);
		setLayout(null);
	}
}
