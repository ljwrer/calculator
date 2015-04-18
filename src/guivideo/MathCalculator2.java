package guivideo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathCalculator2 {
	TextField num1;
	TextField num2;
	TextField num3;
	TextField op;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathCalculator2 rmc=new MathCalculator2();
		rmc.go();
	}
	public void go(){
		Frame f=new Frame();
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
		button1.addActionListener(new MyMonitor2(this));
		f.pack();
		f.setVisible(true);
	}
	
}
class MyMonitor2 implements ActionListener{
	MathCalculator2 imc;
	public MyMonitor2(MathCalculator2 mathCalculator2){
		imc=mathCalculator2;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(imc.num1.getText());
		int n2=Integer.parseInt(imc.num2.getText());
		int n3=0;
		String s=imc.op.getText();
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
		imc.num3.setText(r);
	}
	
}
