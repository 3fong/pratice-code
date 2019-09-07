package string;
/*
 * 需求：把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};	
 * 输出结果：
 *		"[1, 2, 3]"
 * 分析：
 * 		将int数组变成字符串输出，应将数组转成字符串
 */
public class OutputString {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		//方法一：
		System.out.print("[");
		for(int x=0;x<arr.length;x++){			
			if(x<arr.length-1){
				System.out.print(arr[x]+",");
			}
			else
				System.out.println(arr[x]+"]");
		}
		//方法二：
		String s = "";
		s+="[";
		for(int x=0;x<arr.length;x++){			
			if(x<arr.length-1){
				s+=arr[x]+",";
			}
			else
				s+=arr[x]+"]";
		}
		System.out.println(s);
	}

}
