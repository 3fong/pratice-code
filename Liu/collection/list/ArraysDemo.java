package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *public static <T> List<T> asList(T... a):������ת��List����
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
 */
public class ArraysDemo {

	public static void main(String[] args) {
//		int[] arr = {1,4,5,8,12,54};
		
		//ֱ�ӽ���arrֻ�ܷ��ص�ֵַ���޷���ӡԭʼ����
		List<Integer> list = Arrays.asList(1,4,5,8,12,54);
		
		for(Integer i : list){
			System.out.println(i);
		}
		
//		String[] arr = {"hero","women","gof"};
//		
//		List<String> list = Arrays.asList(arr);
//
//		//��Ϊԭ�������飬���Գ��Ȳ��ܱ䣬�޷���ӡ�ɾ���������޸ġ�
////		list.add("java");		
////		list.remove(2);
//		
//		list.set(1,"love");
//		for(String s : list){
//			System.out.println(s);
//		}
	}

}
