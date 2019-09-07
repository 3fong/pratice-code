package new5;

/*
 *JDK1.5版本后的2个新特性：
	1. Integer x = 4;//自动装箱
	2. 当数值在byte范围内时，对于新特性，如果该数值已经存在，则不会再开辟新的空间。
		装箱和拆箱
		泛型
		增强for
		静态导入
		可变参数
		枚举
 */
public class New5Integer {

	public static void main(String[] args) {
		//自动装箱 Integer i = new Integer(4);
		Integer i = 4;
		
		//自动拆箱、装箱  i = new Integer(i.intValue + 4);
		i = i + 4;
		i = new Integer(i.intValue() + 4);
		System.out.println(i);
		
		//当数值在byte范围内(-128--127)时，对于新特性，如果该数值已经存在，则不会再开辟新的空间。
		Integer m = 128;
		Integer n = 128;
		System.out.println(m==n);//false
		
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);//true
		
		Integer c = Integer.valueOf(12);
		Integer d = Integer.valueOf(12);
		System.out.println(c==d);
		
	}

}
