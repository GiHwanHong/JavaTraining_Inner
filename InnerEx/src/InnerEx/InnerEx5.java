package InnerEx;
class Outer1{
	int value = 10;
	
	class Inner{
		int value = 20;
		void method1(){
			int value = 30;
			System.out.println("           value :" + value);
			System.out.println("      this.value :" + this.value);
			System.out.println("Outer.this.value :" + Outer1.this.value);
		}
	}	// Inner클래스의 끝
}//Outer클래스의 끝
public class InnerEx5 {
	public static void main(String[] args) {
		Outer1 ou = new Outer1();
		Outer1.Inner in = ou.new Inner();
		in.method1();
	}
}	//InnerEx5 클래스의 끝.
