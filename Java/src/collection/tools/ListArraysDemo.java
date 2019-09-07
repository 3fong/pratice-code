package collection.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 *Arrays:���ڲ�������Ĺ����ࡣ
 *	equals()���Ƚ����������������Ƿ���ͬ��
	deepEquals():�Ƚ��������鼰���ڲ������Ƿ���ͬ��
��������list���ϡ�List asList:
���ϱ�����
������ʹ��Collection�ӿ��е�toArray�������ɶԼ����е�Ԫ�ز�
	���ķ��������޶��������������ɾ��
 */
public class ListArraysDemo {

	public static void main(String[] args) {
		String[] arr = {"abc","cc","kkkk"};
//		toList(arr);
		toArray();
	}
	//����ת���� asList():
	private static void toList(String[] arr) {
		List<String> list = Arrays.asList(arr);
		sop(list);
		
		//��������е�Ԫ�ض��Ƕ�����ôת�ɼ���ʱ��"�����е�Ԫ��"��ֱ��ת�ɼ����е�Ԫ�ء�
		Integer[] in = {1,2,5};
		List<Integer> li1 = Arrays.asList(in);//[1, 2, 5]
		//��������е�Ԫ�ض��ǻ�������ͣ���ô�Ὣ"������"��Ϊ�����е�Ԫ�ش洢��
		int[] i = {1,2,5};
		List<int[]> li2 = Arrays.asList(i);//[[I@15db9742]
	}
	//����ת���� toArray()
	private static void toArray(){
		Collection<Integer> col = new ArrayList<Integer>();
		col.add(241);
		col.add(23);
		col.add(6);
		//ֱ��ת��������Object����
//		Object[] obs = col.toArray();
//		for(Object o : obs){
//			String s = (String)o;
//			sop(s);
//		}
		//ת��������������
		Integer[] arr = col.toArray(new Integer[col.size()]);
//		for(Integer s : arr){
//			sop(s);
//		}
		sop(Arrays.toString(arr));
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}	
}
