package string;

/*
 *3 获取两个字符串中最大相同字串。第一个动作，将短的那个串进行长度依次递减的字串打印。
 *分析：
 *	获取最大相同字符串，需要依次比较字符是否相同，逐渐缩小比较范围，用到双重for循环
 *4 获取一个字符串在另一个字符串中出现的次数。
 *分析：
 *	有两个字符串，比较长度，获取小串，可以减少判断次数。
 *	用循环定义判断范围，indexOf()返回索引值为-1时循环结束。
 *	获取字符串substring()，并记录索引
 *	与另外一个字符串进行比较 contain()
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
	// 获取相同字符串出现的次数 方法一：indexOf(key)返回指定字符串索引
	private static int sameString1(String s1, String key) {
		int index = 0;
		int count=0;
		while ((index = s1.indexOf(key)) != -1) {
			//截取新字符串，缩小判断范围
			s1= s1.substring(index+key.length());
			
			count++;
		}
		return count;
	}
	// 获取相同字符串出现的次数 方法二：indexOf(key,index)从指定索引开始返回指定字符串索引
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
