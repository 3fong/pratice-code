package character;
/*
 *Character�ࣺ
	boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
	boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
	boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
	char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
	char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
	����ͳ���ַ����д�Сд�����ֵĸ���
 */
public class AccountNum {

	public static void main(String[] args) {
		String s = "ljfalHAFL4456";
		getNum2(s);
	}
	public static void getNum(String s){
		int upper = 0;
		int lower = 0;
		int num = 0;
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			if(chs[x]>='a'&&chs[x]<='z'){
				lower++;
			}
			else if(chs[x]>='A'&&chs[x]<='Z'){
				upper++;
			}
			else if(chs[x]>='0'&&chs[x]<='9'){
				num++;
			}
		}
		System.out.println("��д��"+upper+"Сд��"+lower+"���֣�"+num);
	}
	public static void getNum2(String s){
		int upper = 0;
		int lower = 0;
		int num = 0;
		for(int x=0;x<s.length();x++){
			char ch = s.charAt(x);
			if(Character.isLowerCase(ch)){
				lower++;
			}
			else if(Character.isUpperCase(ch)){
				upper++;
			}
			else if(Character.isDigit(ch)){
				num++;
			}
		}
		System.out.println("��д��"+upper+"Сд��"+lower+"���֣�"+num);
	}
}
