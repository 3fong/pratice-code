package extend;
/*
 * �����ڲ��������⣺
 * 	��Ҫ�󣬲�����룺
 * 	interface Inter{void show();}
 * 	class Outer{//�������}
 * 	class OuterDemo{
 * 		public static void main(String[] args){
 * 			Outer.method().show();
 * 		}
 * 	}
 * Ҫ���ڿ���̨���"helloworld";
 */
/*
interface Inter{void show();}
class Outer{
	public static Super2 method(){
		return new Super2();
	}	
}
class Super2 implements Inter{
	public void show(){
		System.out.println("helloworld");
	}
}
*/
interface Inter{void show();}
class Outer{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("helloworld");
			}
		};
	}
}
public class NiMingDemo {

	public static void main(String[] args) {
	 	 Outer.method().show();
	 	 
	 	/*
	 	 *  ˼·��
	 	 *  1 �������������ã��������Ϊ��̬������
	 	 *  2 �����ɷ������ã����÷����ķ���ֵ����Ϊ�����Ķ���
	 	 */
	 	 
	}

}
