package string;
/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��
 * ����helloWORld
 * ������
 * 	�ַ���ת����
 * 	��ȡ����ĸ��ת��д
 * 	������ĸתСд
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "helloWORld";
		
		//����һ��
		char[] chs = s.toCharArray();
		String first = (chs[0]+"").toUpperCase();
		String s1 = "";
		for(int x=1;x<chs.length;x++){
			s1+=chs[x];
		}
		String others = s1.toLowerCase();
		System.out.println(first+others);
		
		//��������
		String one = s.substring(0,1);
		String one1 = one.toUpperCase();
		String two = s.substring(1,s.length());
		String two1 = two.toLowerCase();
		System.out.println(one1+two1);
		
		//��������
		System.out.println(s.substring(0,1).toUpperCase().
				concat(s.substring(1,s.length()).toLowerCase()));
	}

}
