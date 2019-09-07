package String;

//获取字符串在另一个字符串中出现次数
public class MyCount {

	public static void main(String[] args) {
		String s =" fsfs fsffafs";
		System.out.println(s);
		int c = getCount2(s,"fs");
		System.out.println(c);
	}
	public static int getCount(String str,String key){
		int count =0;
		int index = 0;
		while((index=str.indexOf(key,index))!=-1){
			System.out.println("index:"+index);
			
			index+=key.length();
			
			count++;
		}
		return count;
	}
	public static int getCount2(String str,String key){
		int count = 0;
		int index = 0;
		while((index=str.indexOf(key))!=-1){
			System.out.println("str=  "+str);
			
			str=str.substring(index+key.length());
			count++;
		}
		return count;
	}
}
