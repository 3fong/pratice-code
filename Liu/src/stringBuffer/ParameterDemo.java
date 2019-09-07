package stringBuffer;
/*
 * ��ʽ������
 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
 * 
 * String��Ϊ��������
 * StringBuffer��Ϊ�������� 
 * ע�⣺
 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ���ġ�
 */
public class ParameterDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1+s2);
		stringParam(s1,s2);
		System.out.println(s1+s2);
		
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
//		System.out.println(sb1.toString()+sb2.toString());
		//StringBuffer����ֱ�����
		System.out.println(sb1);
		System.out.println(sb1+"---"+sb2);
		bufferParam(sb1,sb2);
		System.out.println(sb1+"---"+sb2);
	}
	public static void stringParam(String s1,String s2){
		s1=s2;
		s2=s1+s2;
	}
	public static void bufferParam(StringBuffer sb1,StringBuffer sb2){
		sb1=sb2;
		sb2.append(sb1);
	}
}
