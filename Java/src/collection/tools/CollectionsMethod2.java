package collection.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *replaceAll(List<T> list,T oldVal,T newVal)��ʹ��һ��ֵ�滻�б��г��ֵ�����ָ��ֵ��
	swap(List<?> list,i,j)����ָ���б��ָ��λ�ô�����Ԫ�ء�
	shuffle(List<?> list)���������Ԫ��λ�á�
	reverse(List<?> list)����תָ���б���Ԫ�ص�˳��
	fill(List<? super T> list,T obj)��ʹ��ָ��Ԫ���滻ָ���б��е�����Ԫ�ء�
	subList(start,end);��ȡ�����в����б�
 */
public class CollectionsMethod2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 

		list.add("adss");
		list.add("sccd");
		list.add("sfd");
		list.add("cc");
		list.add("cc");
		sop(list);
//		myReplace(list,"cc","qq");
//		mySwap(list,2,3);
		myFill2(list,1,4,"aa");
		sop(list);
//		Collections.shuffle(list);
//		sop(list);
//		Collections.reverse(list);
//		sop(list);
//		
//		Collections.sort(list,new MyComparator1());//��ָ���Ƚ�������
//		sop(list);
//		//ǿ�з�תָ���Ƚ������������¹���ıȽ���
//		Comparator c = Collections.reverseOrder(new MyComparator1());
//		Collections.sort(list, c);
//		sop(list);
	}

	private static void myReplace(List<String> list,String oldV,String newV) {
		Collections.replaceAll(list, oldV, newV);
	}

	private static void mySwap(List<String> list, int i, int j) {
		Collections.swap(list,i,j);
	}

	private static void myFill(List<String> list, String string) {
		Collections.fill(list,string);
	}
	//�滻�����в�������
	private static void myFill2(List<String> list,int start,int end,String string) {
		List<String> li = list.subList(start,end);
		//�������е�����ȫ���滻��ָ������
		Collections.fill(li,string);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}	
}
//�����Ƚ�������
class MyComparator1 implements Comparator<String>{
	public int compare(String s1,String s2){
		int num = s1.length()-s2.length();
		int num2 = (num==0)?s1.compareTo(s2):num;
		return num2;
	}
}