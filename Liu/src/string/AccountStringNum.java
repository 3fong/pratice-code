package string;
/*
 * 统计大串中小串出现的次数
 * 举例：
 * 	在字符串"woaijavawozhenaijavawozhendeaijavawozhe
 * 	ndehenaijavaxinbuxinwoaijavagun"中统计java出现的次数
 * 分析：
 * 		A:定义一个统计变量，初始化值是0
 * 		B:先在大串中查找一次小串第一次出现的位置
 * 			a:索引是-1，说明不存在了，就返回统计变量
 * 			b:索引不是-1，说明存在，统计变量++
 * 		C:把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		D:回到B
 */
public class AccountStringNum {

	public static void main(String[] args) {
		String s1 = "woaijavawozhenaijavawozhendeai"
				+ "javawozhendehenaijavaxinbuxinwoaijavagun";
		String s2 = "java";
		
		int count = searchString1(s1,s2);
		System.out.println(count);
	}
	//方法一：
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
	//方法二：是第一种方法的加强版
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
	//方法三：
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
