package guivideo;

import java.awt.*;

public class LayoutTest {
	public static void main(String[] args) {
		Frame f=new Frame();
		f.setLayout(new GridLayout(2,1));
		f.setBounds(100, 100, 800, 800);
		f.setBackground(Color.blue);
		f.setVisible(true);
		Button []b=new Button[10];
		for(int i=0;i<10;i++)
		{
			b[i]=new Button("Button");
		}
		Panel p1=new Panel(new BorderLayout());
		f.add(p1);
		Panel p11=new Panel(new GridLayout(2,1));
		p11.add(b[1]);
		p11.add(b[2]);
		p1.add(p11,BorderLayout.CENTER);
		p1.add(b[0],BorderLayout.WEST);
		p1.add(b[3],BorderLayout.EAST);
		Panel p2=new Panel(new BorderLayout());
		f.add(p2);
		Panel p21=new Panel(new GridLayout(2,2));
		p21.add(b[5]);
		p21.add(b[6]);
		p21.add(b[7]);
		p21.add(b[8]);
		p2.add(p21,BorderLayout.CENTER);
		p2.add(b[4],BorderLayout.WEST);
		p2.add(b[9],BorderLayout.EAST);
	}
}
