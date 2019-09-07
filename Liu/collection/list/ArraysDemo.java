package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *public static <T> List<T> asList(T... a):把数组转成List集合
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
 */
public class ArraysDemo {

	public static void main(String[] args) {
//		int[] arr = {1,4,5,8,12,54};
		
		//直接接收arr只能返回地址值，无法打印原始数据
		List<Integer> list = Arrays.asList(1,4,5,8,12,54);
		
		for(Integer i : list){
			System.out.println(i);
		}
		
//		String[] arr = {"hero","women","gof"};
//		
//		List<String> list = Arrays.asList(arr);
//
//		//因为原型是数组，所以长度不能变，无法添加、删除，可以修改。
////		list.add("java");		
////		list.remove(2);
//		
//		list.set(1,"love");
//		for(String s : list){
//			System.out.println(s);
//		}
	}

}
