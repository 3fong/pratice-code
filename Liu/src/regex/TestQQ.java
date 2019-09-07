package regex;

import java.util.Scanner;

/*
 *У��qq����.
 * 		1:Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 */
public class TestQQ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean flag = test2(str);
		System.out.println(flag);
	}
	public static boolean test(String s){
		boolean flag = true;
	
		if(s.length()>=5&&s.length()<=15){
			if(!s.startsWith("0")){
				char[] chs = s.toCharArray();
				for(int x=0;x<chs.length;x++){
					if(!Character.isDigit(chs[x])){
						flag=false;
						break;
					}
				}
			}
			else{
				flag=false;
			}
		}
		else{
			flag=false;
		}
		return flag;
	}
	public static boolean test2(String s){
//		String regex = "[1-9][0-9]{4,14}";
//		
//		boolean flag = s.matches(regex);
//		return flag;
		
//		return s.matches("[1-9][0-9]{4,14}");
		return s.matches("[1-9]\\d{4,14}");
	}
}
