package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 *		Pattern��Matcher���ʹ��	
 *		ģʽ��ƥ�����Ļ���ʹ��˳��
 */
public class PatternDemo {

	public static void main(String[] args) {
		System.out.println(show2());
		
		show3();
	}
	//ͨ��Pattern��Matcher���ж�ֵ�Ƿ����
	public static boolean show(){
		//��������ʽ�����ģʽ���� X* >=0��
		Pattern p = Pattern.compile("a*b");
		
		//����ƥ������ƥ���ַ���
		Matcher m = p.matcher("aaaab");
		
		return m.matches();
	}
	//ͨ���ַ����Ƚ�
	public static boolean show2(){
		String s = "aaaab";
		String regex = "a*b";
		return s.matches(regex);
	}
	/*
	 * Pattern��Matcher��Ĺ���Ӧ��
	 * ���󣺻�ȡ�ַ������������ַ����ַ���
	 */
	public static void show3(){
		String s = "da jia ting wo shuo,jin tian "
				+ "yao xia yu,bu shang wan zi xi,gao xing bu?";
		
		//�����ַ��߽�\b���������Ի�ȡ�����ַ������������и��ַ���
		String regex = "\\b\\w{3}\\b";
		
		//����ģʽ
		Pattern p = Pattern.compile(regex);
		
		//����ƥ����
		Matcher m = p.matcher(s);
		
		//����ƥ�������ܡ�find()���ң�group()��ȡ
//		boolean flag = m.find();
//		System.out.println(flag);
//		
//		String ss=m.group();
//		return ss;
		
		while(m.find()){
			System.out.println(m.group());
		}		
	}
}	
