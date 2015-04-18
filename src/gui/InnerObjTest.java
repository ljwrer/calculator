package gui;

public class InnerObjTest {

	public static void main(String[] args) {
		myOuter outerObj=new myOuter();
		outerObj.innerObj.go();
		System.out.println(outerObj.getX());
	}
}
class myOuter{
	private int x;
	myInner innerObj=new myInner();
	class myInner{
		public void go(){
			x=42;
		}
	}
	public int getX(){
		return x;
	}
}