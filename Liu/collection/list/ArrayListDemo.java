package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 *分析：
 *		由于长度不固定，使用集合
 *		获取最大值可将集合转成数组，排序后获取尾角标获取
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		while(true){
			System.out.println("请输入数据：");
			
			int num = s.nextInt();
			if(num!=0){
				al.add(num);
			}else{
				break;
			}			
		}
		Object[] obj = al.toArray();
		Arrays.sort(obj);
		System.out.println(obj[obj.length-1]);
		
		//<T> T[] toArray(T[] a) 可将集合转为任意类型的数组
//		Integer[] i = al.toArray(new Integer[al.size()]);
		
	}

}
