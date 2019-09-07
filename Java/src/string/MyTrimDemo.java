package string;
/*
 *1 模拟一个trim方法，去除字符串两端的空格。
 *分析：
 *	去除空格实质是获取新的字符串，用到substring
 *	判断空格用到charAt()
 *2 将一个字符串进行反转，将字符串中指定部分进行反转。
 */
public class MyTrimDemo {

	public static void main(String[] args) {
		String s = "   ahak af    ";
		sop("-"+s+"-");
		String str = myTrim(s);
		sop("-"+str+"-");
		
		String str1 = myReverse(s,3,7);
		sop("-"+str1+"-");
	}
	//反转字符串
	private static String myReverse(String s,int start,int end) {
		//方法一：只能全部转，无法只反转部分
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
//		return sb.toString();
		
		//方法二：
		char[] chs = s.toCharArray();
		for(int x=start,y=end-1;x<=y;x++,y--){
			char temp = chs[x];
			chs[x]=chs[y];
			chs[y]=temp;
		}
		return new String(chs);//String.valueOf(chs);
	}
	//模拟一个trim方法，去除字符串两端的空格。
	private static String myTrim(String s) {
		int start = 0;
		int end = s.length()-1;
		while(start<=end){
			while(s.charAt(start)==' '){
				start++;
			}
			while(s.charAt(end)==' '){
				end--;
			}
			//含头不含尾
			return s.substring(start,end+1);
		}
		return null;
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
