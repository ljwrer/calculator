package guivideo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventTest implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionEventTest a=new ActionEventTest();
		a.go();
		
	}
	public void go(){
		Frame frame=new Frame();
		Button button=new Button("b");
		frame.add(button,BorderLayout.WEST);
		ButtonAction button1=new ButtonAction("b1");
//		System.out.println(button.getActionCommand());
		frame.add(button1,BorderLayout.EAST);
		ButtonAction button2=new ButtonAction("b2");
		button2.addActionListener(this);
		frame.add(button2,BorderLayout.CENTER);
		button2.setActionCommand("over");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setBounds(100, 100, 400, 240);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand()+"you clicked  "+e);
	}
}
class ButtonAction extends Button implements ActionListener{
	public ButtonAction(String s){
		super(s);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("you clicked  "+e);
		System.out.println(e.getActionCommand().toString());
	}
	
}