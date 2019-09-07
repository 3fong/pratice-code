package integer;
/*
 *int类型和String类型的相互转换
 * 
 * int -- String
 * 		String.valueOf(number)
 * 
 * String -- int
 * 		Integer.parseInt(s)
 */
public class TransformInt {

	public static void main(String[] args) {
		//int -- String
		int num = 100;
		//方式一：
		String s1 = String.valueOf(num);
		sop(s1);
		//方式二：
		String s2 = num+"";
		sop(s2);
		//方式三：
		Integer i3 = new Integer(num);
		String s3 = i3.toString();
		sop(s3);
		//方式四：
		String s4 = Integer.toString(num);
		sop(s4);
		
		
		//String-->int
		String str = "23";
		//方法一：
		int i1 = Integer.parseInt(str);
		sop(i1);
		//方式二：
		Integer it = new Integer(str);
		int i2 = it.intValue();
		sop(i2);
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
