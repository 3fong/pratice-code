package string;
/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 	���ַ���"woaijavawozhenaijavawozhendeaijavawozhe
 * 	ndehenaijavaxinbuxinwoaijavagun"��ͳ��java���ֵĴ���
 * ������
 * 		A:����һ��ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:���ڴ��в���һ��С����һ�γ��ֵ�λ��
 * 			a:������-1��˵���������ˣ��ͷ���ͳ�Ʊ���
 * 			b:��������-1��˵�����ڣ�ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡ��һ�εĴ󴮣�����һ���µ��ַ��������Ѹ��ַ�����ֵ���¸�ֵ����
 * 		D:�ص�B
 */
public class AccountStringNum {

	public static void main(String[] args) {
		String s1 = "woaijavawozhenaijavawozhendeai"
				+ "javawozhendehenaijavaxinbuxinwoaijavagun";
		String s2 = "java";
		
		int count = searchString1(s1,s2);
		System.out.println(count);
	}
	//����һ��
	public static int searchString(String s1,String s2){
		String max = (s1.length()>s2.length())?s1:s2;
		String min = (max==s1)?s2:s1;
		
		int index = max.indexOf(min);
		
		int count = 0;
		while(index!=-1){
			count++;
			int index2 = index+min.length();
			max=max.substring(index2);
			index = max.indexOf(min); 
		}
		return count;
	}
	//���������ǵ�һ�ַ����ļ�ǿ��
	public static int searchString1(String s1,String s2){
		String max = (s1.length()>s2.length())?s1:s2;
		String min = (max==s1)?s2:s1;	
		int index;
		int count=0;
		while((index=max.indexOf(min))!=-1){
			count++;
			max=max.substring(index+min.length());
		}
		return count;
	}
	//��������
	public static int searchString2(String s1,String s2){
		String max = (s1.length()>s2.length())?s1:s2;
		String min = (max==s1)?s2:s1;	
		int index=0;
		int count=0;
		while((index=max.indexOf(min,index))!=-1){
			count++;
			index=index+min.length();
		}
		return count;
	}
}
