package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *Collections:是针对集合进行操作的工具类，都是静态方法。
 * 
 * 面试题：
 * Collection和Collections的区别?
 * Collection:是单列集合的顶层接口，有子接口List和Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 * 
 * 要知道的方法
 * public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
 * public static <T> int binarySearch(List<?> list,T key):二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static void reverse(List<?> list):反转
 * public static void shuffle(List<?> list):随机置换
 */
public class MethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(45);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println(list);
		//自然排序 没有返回值
		Collections.sort(list);
		System.out.println(list);
		//[10, 20, 30, 40, 45, 50]
		int index = Collections.binarySearch(list,30);
		System.out.println("index:"+index);
		
		//返回值是泛型定义类型
		Integer i = Collections.max(list);
		System.out.println(i.toString());
		
		Collections.reverse(list);
		System.out.println(list);//[50, 45, 40, 30, 20, 10]
		
		Collections.shuffle(list);
		System.out.println(list);
	}

}
