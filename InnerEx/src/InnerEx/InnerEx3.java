package InnerEx;

class Outer{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod(){
		class LocalInner{
			int iv = 400;
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		//�ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ���
		//�ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�.
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		//����ƽ ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer.StaticInner st = new Outer.StaticInner();
		System.out.println("st.iv: " + st.iv);
	}
}
