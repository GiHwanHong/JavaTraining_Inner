package InnerEx;

class InnerEx1 {
	public class InstanceInner {
		int iv = 100;
		// static int cv = 100; // Error.. Because , Static variable.

		final static int CONST = 100; // final static - const, permission
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void mythod(){
		class LocalInner{
			int iv = 300;
			//static int cv = 300; // Error.. Because , Static variable.
			final static int CONST = 300; // final static - const, permission
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
