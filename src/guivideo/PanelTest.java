package guivideo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {
	public static void main(String []args){
		CentralFrame c=new CentralFrame(200, 200, 800, 800, Color.yellow, Color.green);
	}
}

class CentralFrame extends Frame{
	public CentralFrame(int x,int y,int a,int b,Color c1,Color c2) {
		super("myFrame");
		setLayout(null);
		Panel p=new Panel();
		p.setLayout(null);
		add(p);
		setBounds(x, y, a, b);
		setBackground(c1);
		p.setBounds(a/4, b/4, a/2, b/2);
		p.setBounds(this.getWidth()/4, this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);
		p.setBackground(c2);
		setVisible(true);
		p.setVisible(true);
	}
	
}