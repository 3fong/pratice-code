package integer;
/*
 *int���ͺ�String���͵��໥ת��
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
		//��ʽһ��
		String s1 = String.valueOf(num);
		sop(s1);
		//��ʽ����
		String s2 = num+"";
		sop(s2);
		//��ʽ����
		Integer i3 = new Integer(num);
		String s3 = i3.toString();
		sop(s3);
		//��ʽ�ģ�
		String s4 = Integer.toString(num);
		sop(s4);
		
		
		//String-->int
		String str = "23";
		//����һ��
		int i1 = Integer.parseInt(str);
		sop(i1);
		//��ʽ����
		Integer it = new Integer(str);
		int i2 = it.intValue();
		sop(i2);
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
