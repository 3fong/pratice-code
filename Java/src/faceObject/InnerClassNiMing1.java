package faceObject;
/*
 *�����ڲ��������⣺
	����Ҫ�󣬲������
		interface Inter { void show(); }
		class Outer { //������� }
		class OuterDemo {
			public static void main(String[] args) {
				  Outer.method().show();
			  }
		}
		Ҫ���ڿ���̨�����HelloWorld��
 */
interface Inter{
	void show();
}
class Outer2{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("helloworld");
			}
		};
	}
}
public class InnerClassNiMing1 {

	public static void main(String[] args) {
		/*
		 * ����������ֱ�ӵ��÷������˷���Ϊ��̬
		 * 	��ʽ���ã�ǰһ����������ֵ��һ������
		 * show()�ǽӿڵķ������ӿ��޷���������
		 * ����ʵ�ʷ���ֵ����ʵ���������������������ڲ����д
		 */
		Outer2.method().show();
	}
}
