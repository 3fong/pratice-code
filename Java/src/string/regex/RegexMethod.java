package string.regex;

/*
 *������ʽ�ĳ���
 *E:Greedy ������
	X?	<=0�� һ�λ�һ��Ҳû��
	X*	>=0��
	X+	һ�λ���
	X{n}	ǡ��n��
	X{n,}	����n��
	X{n,m}	����n�Σ����ǲ�����m�Ρ�
 */
public class RegexMethod {

	public static void main(String[] args) {
//		splitStr("System.out.println(b)","\\.");
//		splitStr("D:\\cd\\ab\\a","\\\\");
//		splitStr("abaafjaaaafdddddd","(.)\\1+");//���������������и�
		String s = "afa12345fa1245";
//		replaceStr(s,"\\d+","#");
		String s1 = "afffffdddfanff";
		replaceStr(s1,"(.)\\1+","$1");
		
		String s2 ="5";
		matchesStr(s2,"\\d");
	}
	private static void replaceStr(String s, String string, String string2) {		
		s=s.replaceAll(string, string2);
		System.out.println(s);
	}
	private static void splitStr(String str,String regex) {
		String[] st = str.split(regex);
		for (String s : st) {
			System.out.print(s+" ");
		}
	}
	private static void matchesStr(String str,String regex){
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}
}
