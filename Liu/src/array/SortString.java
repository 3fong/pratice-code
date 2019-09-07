package array;
/*
 * 把字符串中的字符进行排序。
 * 		举例："dacgebf"
 * 		结果："abcdefg"
 * String -- char[]
		toCharArray()	
 * char[]转成 String的两种方法：
		valueOf(char[])、String(char[])构造方法。
 */
public class SortString {

	public static void main(String[] args) {
		String s = "dacgebf";
		System.out.println("排序前"+s);
		String result = bubbleSort(s);
		System.out.println("排序后"+result);
	}
	public static String bubbleSort(String s){
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length-1;x++){
			for(int y=0;y<chs.length-1-x;y++){
				if(chs[y]>chs[y+1]){
					char temp = chs[y];
					chs[y]=chs[y+1];
					chs[y+1]=temp;
				}
			}
		}
//		return String.valueOf(chs);
		return new String(chs);
		
		//可以转成字符串，但是结果是字符数组的地址值[C@15db9742
		//return chs+"";
	}
}
