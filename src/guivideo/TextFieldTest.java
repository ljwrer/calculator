package guivideo;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFieldTest tft=new TextFieldTest();
		tft.go();
	}
	public void go(){
		Frame f=new Frame();
		Mytext mt=new Mytext();
		mt.setEchoChar('*');
		f.add(mt);
		mt.addActionListener(new Mytext());
		f.pack();
		f.setVisible(true);
	}

}
class Mytext extends TextField implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Mytext mt=(Mytext)e.getSource();
		System.out.println(mt.getText());
		mt.setText("");
	}
}
