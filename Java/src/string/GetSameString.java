package string;

/*
 *3 ��ȡ�����ַ����������ͬ�ִ�����һ�����������̵��Ǹ������г������εݼ����ִ���ӡ��
 *������
 *	��ȡ�����ͬ�ַ�������Ҫ���αȽ��ַ��Ƿ���ͬ������С�ȽϷ�Χ���õ�˫��forѭ��
 *4 ��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
 *������
 *	�������ַ������Ƚϳ��ȣ���ȡС�������Լ����жϴ�����
 *	��ѭ�������жϷ�Χ��indexOf()��������ֵΪ-1ʱѭ��������
 *	��ȡ�ַ���substring()������¼����
 *	������һ���ַ������бȽ� contain()
 *	
 */
public class GetSameString {

	public static void main(String[] args) {
		String s1 = "afbakfhelloafnaa";
		String s2 = "eqqwehelloae";
		String s = "af";
		String s3 = sameString(s1, s2);
		System.out.println(s3);

		int num = sameString1(s1, s);
		System.out.println(num);
		int num2 = sameString2(s1, s);
		System.out.println(num2);
	}

	private static String sameString(String s1, String s2) {
		String max = (s1.length() > s2.length()) ? s1 : s2;
		String min = (max == s1) ? s2 : s1;
		for (int x = 0; x < min.length(); x++) {
			for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
				String s = min.substring(y, z);
				if (max.contains(s)) {
					return s;
				}
			}
		}
		return null;
	}
	// ��ȡ��ͬ�ַ������ֵĴ��� ����һ��indexOf(key)����ָ���ַ�������
	private static int sameString1(String s1, String key) {
		int index = 0;
		int count=0;
		while ((index = s1.indexOf(key)) != -1) {
			//��ȡ���ַ�������С�жϷ�Χ
			s1= s1.substring(index+key.length());
			
			count++;
		}
		return count;
	}
	// ��ȡ��ͬ�ַ������ֵĴ��� ��������indexOf(key,index)��ָ��������ʼ����ָ���ַ�������
	private static int sameString2(String s1,String key){
		int count=0;
		int index=0;
		while((index=s1.indexOf(key,index))!=-1){
			index = index+key.length();
			count++;
		}
		return count;
	}
}
