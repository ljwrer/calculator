package guivideo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathCalculator {
	TextField num1;
	TextField num2;
	TextField num3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator rmc=new MathCalculator();
		rmc.go();
	}
	public void go(){
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		num1=new TextField();
		num2=new TextField();
		num3=new TextField();
		Label lable1=new Label("+");
		Button button1=new Button("=");
		f.add(num1);
		f.add(lable1);
		f.add(num2);
		f.add(button1);
		f.add(num3);
		button1.addActionListener(new MyMonitor(this));
		f.pack();
		f.setVisible(true);
	}
	
}
class MyMonitor implements ActionListener{
	MathCalculator imc;
	public MyMonitor(MathCalculator mc){
		imc=mc;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(imc.num1.getText());
		int n2=Integer.parseInt(imc.num2.getText());
		int n3=n1+n2;
		imc.num3.setText(""+n3);
	}
	
}
