package newFeatures;
/*
 *枚举常见方法：
	int compareTo(E o)：比较此枚举与指定对象的顺序
	String name()：返回枚举项名称
	int ordinal():返回索引值
	String toString()
	<T> T valueOf(Class<T> type,String name)返回带指定名称的指定枚举类型的枚举常量。
	values() 
 */
public class EnumMethodemo {

	public static void main(String[] args) {
		DirectionEnum de1 = DirectionEnum.FRONT;
		DirectionEnum de2 = DirectionEnum.BEHIND;
		DirectionEnum de3 = DirectionEnum.LFTE;
		DirectionEnum de4 = DirectionEnum.RIGHT;
		//compareTo
		System.out.println(de1.compareTo(de1));
		System.out.println(de1.compareTo(de4));
		System.out.println(de4.compareTo(de1));
		System.out.println("---------------");
		//String name
		System.out.println(de1.name());
		System.out.println(de2.name());
		System.out.println(de3.name());
		System.out.println(de4.name());
		System.out.println("---------------");
		//int ordinal()
		System.out.println(de1.ordinal());
		System.out.println(de2.ordinal());
		System.out.println(de3.ordinal());
		System.out.println(de4.ordinal());	
		System.out.println("---------------");
		//String toString()
		System.out.println(de1.toString());
		System.out.println(de2.toString());
		System.out.println(de3.toString());
		System.out.println(de4.toString());
		//<T> T valueOf(Class<T> type,String name)
		DirectionEnum de = Enum.valueOf(DirectionEnum.class,"FRONT");
		System.out.println(de);
		System.out.println("---------------");
		DirectionEnum[] des = DirectionEnum.values();
		for(DirectionEnum d : des){
			System.out.println(d);
		}
	}
}
