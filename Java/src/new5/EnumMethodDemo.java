package new5;
/*
 *枚举常见方法：
	int compareTo(E o)：比较此枚举与指定对象的顺序
	String name()：返回枚举项名称
	int ordinal():返回索引值
	String toString()
	<T> T valueOf(Class<T> type,String name)返回带指定名称的指定枚举类型的枚举常量。
	values() 
 */
public class EnumMethodDemo {

	public static void main(String[] args) {
		int num = EnumDemo.BEHIND.compareTo(EnumDemo.LFTE);
		
		String name = EnumDemo.BEHIND.name();
		
		int index = EnumDemo.FRONT.ordinal();
		
		String str = EnumDemo.LFTE.toString();
		
		//<T> T valueOf(Class<T> type,String name)
		EnumDemo ed = Enum.valueOf(EnumDemo.class,"RIGHT");
		
		//获取所有值
		EnumDemo[] eds = EnumDemo.values();
		for(EnumDemo e : eds){
			System.out.println(e);
		}
	}

}
