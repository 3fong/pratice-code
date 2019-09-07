package string;
/*
 *�ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * ������
 * 		��ʽһ��
 * 			���ַ���ת�����飬ͨ����β�Ǳ��ж�
 * 		��ʽ����
 * 			ͨ���ַ��������жϣ���ת�ַ�������ԭ�ַ����ͶԳ�
 */
public class DuiChenString {

	public static void main(String[] args) {
		String s = "aacbcaa";
		boolean flag = method1(s);
		
		boolean flag1 = method2(s);
		System.out.println(flag1);
	}

	private static boolean method1(String s) {
		boolean flag = true;
		char[] chs = s.toCharArray();
		
		for(int x=0;x<chs.length/2;x++){
			if(chs[x]!=chs[chs.length-1-x]){
				return flag = false;
			}
		}
		return flag;
	}
	private static boolean method2(String s) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
//		String st = sb.reverse().toString();
//		return st.equals(s);
		return new StringBuilder(s).reverse().toString().equals(s);
	}
}
