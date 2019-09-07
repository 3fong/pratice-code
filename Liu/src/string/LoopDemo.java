package string;

public class LoopDemo {

	public static void main(String[] args) {
		accuntNum();
	}
	public static void loop(){
		String s = "HelloWorld";
		for(int x=0;x<s.length();x++){
			System.out.println(s.charAt(x));
		}
	}
	/*
	 	需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 	 	举例：
			"Hello123World"
		分析：
			1 分类，需提取字符串元素，所以需将字符串转成字符数组。
			2 计数
			3 返回值
		明确：
			参数列表：void
			返回值类型：void
	 */
	public static void accuntNum(){
		String s = "Hello123World";
		
		int upper = 0;
		int lower = 0;
		int num = 0;
		
		char[] chs = s.toCharArray();
		for(int x=0;x<s.length();x++){
			//char ch = s.charAr(x);
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
		System.out.println("大写字母有："+upper+"个，小写字母有："+lower+"个，数字有："+num+"个");
	}
}
