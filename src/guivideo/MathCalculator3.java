package guivideo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathCalculator3 {
	TextField num1;
	TextField num2;
	TextField num3;
	TextField op;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator3 rmc=new MathCalculator3();
		rmc.go();
	}
	public void go(){
		Frame f=new Frame("Calculator");
		f.setLayout(new FlowLayout());
		num1=new TextField(5);
		num2=new TextField(5);
		num3=new TextField(10);
		op=new TextField();
		Button button1=new Button("=");
		f.add(num1);
		f.add(op);
		f.add(num2);
		f.add(button1);
		f.add(num3);
		button1.addActionListener(new MyMonitor());
		f.pack();
		f.setVisible(true);
	}
private	class MyMonitor implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int n1=Integer.parseInt(num1.getText());
			int n2=Integer.parseInt(num2.getText());
			int n3=0;
			String s=op.getText();
			String r="result";
			switch(s)
			{
				case "+":
				n3=n1+n2;
				break;
				case "-":
					n3=n1-n2;
					break;
				case "*":
					n3=n1*n2;
					break;
				case "x":
					n3=n1*n2;
					break;
				case "X":
					n3=n1*n2;
					break;
				case "/":
					n3=n1/n2;
					break;
				case "%":
					n3=n1%n2;
					break;
				default:
					r="error";
			}
			if(!r.equals("error"))
			{	
				r=""+n3;
			}
			num3.setText(r);
		}
		
	}
	
}

