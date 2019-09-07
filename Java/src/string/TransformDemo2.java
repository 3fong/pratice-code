package string;
/*
2.1将基本数据类型转成字符串。
a.基本数据类型+"";
b.基本数据类型.toString(基本数据类型值)；
例：Integer.toString(34); //将34整数转换成"34"。
2.2将字符串转成基本数据类型
a.静态转换方法：
	xxx a = Xxx.parseXxx(String);
	例：int a = Integer.parseInt("a");
b.非静态：
	Integer i = new Integer("123");
	int num = i.intValue();
(2)Integer的构造方法
	A:Integer i = new Integer(100);
	B:Integer i = new Integer("100");
		注意：这里的字符串必须是由数字字符组成
(3)String和int的相互转换
	A:String -- int
		Integer.parseInt("100");
	B:int -- String 三种方法
		String.valueOf(100);"";Integer.toString(2);
 */
public class TransformDemo2 {

	public static void main(String[] args) {
		//将基本数据类型转成字符串
		String s = Double.toString(12.34);
		String s1 = 12.34+"";				
		System.out.println(s1);
		
		//将字符串转成基本数据类型 方法一：
		String str = "10";
		int a = Integer.parseInt(str);
		System.out.println(a);
		//方法二：
		Integer i = new Integer(str);
		int a2 = i.intValue();
		System.out.println(a2);
		//方法三：
		String str2 = "10";
		Integer i2 = new Integer(str2);
		System.out.println("i2:"+i2);
		
		//String和int的互换 方法一：
		String str3 = "1234";
		int in = Integer.parseInt(str3);
		//方法二：
		Integer it = new Integer(str3);
		int in2 = it.intValue();
		
		String str4 = String.valueOf(in2);
		String str5 = in2+"";
		System.out.println("str5:"+str5);
		String str6 = Integer.toString(in2);
	}
}
