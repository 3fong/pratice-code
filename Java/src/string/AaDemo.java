package string;
/*
 *���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��
 * ����helloWORld
 * ������
 * 	�ַ���ת����
 * 	��ȡ����ĸ��ת��д
 * 	������ĸתСд
 */
public class AaDemo {

	public static void main(String[] args) {
		String s = "helloWORld";
		myString3(s);
	}

	private static void myString1(String s) {
		String one = s.substring(0,1).toUpperCase();
		String two = s.substring(1,s.length()).toLowerCase();
		System.out.println(one.concat(two));
	}
	private static void myString2(String s) {
		char[] chs = s.toCharArray();
		String st = (chs[0]+"").toUpperCase();	

		for(int x=1;x<chs.length;x++){
			st+=(chs[x]+"").toLowerCase();
		}
		System.out.println(st);
	}
	private static void myString3(String s) {
		System.out.println(s.substring(0,1).toUpperCase().
				concat(s.substring(1,s.length()).toLowerCase()));
	}

}
