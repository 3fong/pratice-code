package reflect;
/*
 *���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 *��ȡclass�ļ�����ķ�ʽ��
 * A:Object���getClass()����
 * B:�������͵ľ�̬����class
 * C:Class���еľ�̬����
 * 		public static Class forName(String className)
 */
public class GetClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {		
		Person p = new Person();
		Class c = p.getClass();
		
		//���ļ���ͬһ���ļ�
		//��ʽһ��
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		System.out.println(p==p1);//false
		System.out.println(c==c1);//true
		
		//��ʽ����
		Class c2 = Person.class;
		System.out.println(c==c2);//true
		
		//��ʽ����
		Class c3 = Class.forName("reflect.Person");
		System.out.println(c==c3);//true
	}

}
