package new5;
/*
 *ö�ٳ���������
	int compareTo(E o)���Ƚϴ�ö����ָ�������˳��
	String name()������ö��������
	int ordinal():��������ֵ
	String toString()
	<T> T valueOf(Class<T> type,String name)���ش�ָ�����Ƶ�ָ��ö�����͵�ö�ٳ�����
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
		
		//��ȡ����ֵ
		EnumDemo[] eds = EnumDemo.values();
		for(EnumDemo e : eds){
			System.out.println(e);
		}
	}

}
