package string;
/*Character�ࣺ
	boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
	boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
	boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
	char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
	char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
 *���󣺻�ȡ�����ַ����ֵĴ���
 */
public class GetNumDemo {

	public static void main(String[] args) {
		String s = "ajAJ=FA4-=4546";
		getNum(s);
	}

	private static void getNum(String s) {
		int numD =0;
		int numL =0;
		int numU =0;
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			if(Character.isDigit(chs[x]))
				numD++;
			else if(Character.isLowerCase(chs[x]))
				numL++;
			else if(Character.isUpperCase(chs[x]))
				numU++;
		}
		System.out.println("���ָ����ǣ�"+numD);
		System.out.println("Сд�ַ������ǣ�"+numL);
		System.out.println("��д�ַ������ǣ�"+numU);
	}

}
