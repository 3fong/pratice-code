package string;
/*
2.1��������������ת���ַ�����
a.������������+"";
b.������������.toString(������������ֵ)��
����Integer.toString(34); //��34����ת����"34"��
2.2���ַ���ת�ɻ�����������
a.��̬ת��������
	xxx a = Xxx.parseXxx(String);
	����int a = Integer.parseInt("a");
b.�Ǿ�̬��
	Integer i = new Integer("123");
	int num = i.intValue();
(2)Integer�Ĺ��췽��
	A:Integer i = new Integer(100);
	B:Integer i = new Integer("100");
		ע�⣺������ַ����������������ַ����
(3)String��int���໥ת��
	A:String -- int
		Integer.parseInt("100");
	B:int -- String ���ַ���
		String.valueOf(100);"";Integer.toString(2);
 */
public class TransformDemo2 {

	public static void main(String[] args) {
		//��������������ת���ַ���
		String s = Double.toString(12.34);
		String s1 = 12.34+"";				
		System.out.println(s1);
		
		//���ַ���ת�ɻ����������� ����һ��
		String str = "10";
		int a = Integer.parseInt(str);
		System.out.println(a);
		//��������
		Integer i = new Integer(str);
		int a2 = i.intValue();
		System.out.println(a2);
		//��������
		String str2 = "10";
		Integer i2 = new Integer(str2);
		System.out.println("i2:"+i2);
		
		//String��int�Ļ��� ����һ��
		String str3 = "1234";
		int in = Integer.parseInt(str3);
		//��������
		Integer it = new Integer(str3);
		int in2 = it.intValue();
		
		String str4 = String.valueOf(in2);
		String str5 = in2+"";
		System.out.println("str5:"+str5);
		String str6 = Integer.toString(in2);
	}
}
