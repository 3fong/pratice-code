package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 *		Pattern和Matcher类的使用	
 *		模式和匹配器的基本使用顺序
 */
public class PatternDemo {

	public static void main(String[] args) {
		System.out.println(show2());
		
		show3();
	}
	//通过Pattern和Matcher类判断值是否相等
	public static boolean show(){
		//把正则表达式编译成模式对象 X* >=0次
		Pattern p = Pattern.compile("a*b");
		
		//调用匹配器，匹配字符串
		Matcher m = p.matcher("aaaab");
		
		return m.matches();
	}
	//通过字符串比较
	public static boolean show2(){
		String s = "aaaab";
		String regex = "a*b";
		return s.matches(regex);
	}
	/*
	 * Pattern和Matcher类的功能应用
	 * 需求：获取字符中所有三个字符的字符串
	 */
	public static void show3(){
		String s = "da jia ting wo shuo,jin tian "
				+ "yao xia yu,bu shang wan zi xi,gao xing bu?";
		
		//加入字符边界\b，这样可以获取整体字符出，而不是切割字符串
		String regex = "\\b\\w{3}\\b";
		
		//建立模式
		Pattern p = Pattern.compile(regex);
		
		//调用匹配器
		Matcher m = p.matcher(s);
		
		//调用匹配器功能。find()查找，group()获取
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
