package test;
/*
 *字符串也是引用类型。
 */
public class Example {
	String str = new String("good");
	int a =10;
	char[] ch = {'a','b','c'};
	public static void main(String[] args) {
		Example ex = new Example();
		ex.change(ex.str,ex.a,ex.ch);
		System.out.print(ex.str+" and");
		System.out.print(ex.a);
		System.out.print(ex.ch);
	}
	private void change(String str2,int a, char[] ch2) {
		str="test ok";
		a=12;
		ch[0]='g';
	}
}
