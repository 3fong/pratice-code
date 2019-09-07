package string;
/*
 * 需求：把一个字符串的首字母转成大写，其余为小写。
 * 例：helloWORld
 * 分析：
 * 	字符串转数组
 * 	获取首字母并转大写
 * 	其他字母转小写
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String s = "helloWORld";
		
		//方法一：
		char[] chs = s.toCharArray();
		String first = (chs[0]+"").toUpperCase();
		String s1 = "";
		for(int x=1;x<chs.length;x++){
			s1+=chs[x];
		}
		String others = s1.toLowerCase();
		System.out.println(first+others);
		
		//方法二：
		String one = s.substring(0,1);
		String one1 = one.toUpperCase();
		String two = s.substring(1,s.length());
		String two1 = two.toLowerCase();
		System.out.println(one1+two1);
		
		//方法三：
		System.out.println(s.substring(0,1).toUpperCase().
				concat(s.substring(1,s.length()).toLowerCase()));
	}

}
