package integer;
/*
 *1.5新特性
	自动拆装箱
	byte范围内数据共享
 */
public class NewFeature {

	public static void main(String[] args) {
		Integer i = 10;
		i+=20;
		System.out.println(i);
		
		Integer ii = Integer.valueOf(10);//自动装箱
		
		ii = Integer.valueOf(ii.intValue()+20);//自动拆箱再装箱。
		System.out.println(ii);
		
		Integer iii = null;
		// NullPointerException
		if(iii!=null){
			iii+=100;
			System.out.println(iii);
		}
		
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i2));
		
		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3==i4);//false
		System.out.println(i3.equals(i4));
		
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5==i6);//true
		System.out.println(i5.equals(i6));
		
		//1.5后在byte范围内（-128~127）不重建对象，超过范围会新建
		//所以地址值不相等
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7==i8);//false
		System.out.println(i7.equals(i8));
	}

}
