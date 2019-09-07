package collection.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *Collections: �Ǽ��Ͽ�ܵĹ����࣬��ķ������Ǿ�̬�ġ��޶����ṩ���캯����Ҫ��װ����
 *sort(List<?> list):���Ԫ�ص���Ȼ˳�� ��ָ���б?�����������
 *max():��ȡ���������Ԫ�ء�
 *binarySearch():���������������������򼯺ϡ�������������������ء������-1����
 */
public class CollectionsMethod1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("adss");
		list.add("sdfd");
		list.add("sfd");
		list.add("dfd");
		list.add("cc");
		list.add("w");
		list.add("sfd");
		String st = myMax(list);// ���ۼ����Ƿ��������?��Ȼ˳�򷵻����ֵ
		sop(list);
		// mySort(list);// ���ϱ�Ϊ���򼯺�[adss, cc, dfd, sdfd, sfd, sfd, w]
		mySort2(list, new MyComparator());// [w, cc, dfd, sfd, sfd, adss, sdfd]
		sop(list);
		// int num = searchCols1(list, "w");
		// int num = mySearch(list, "dfd");
		// int num = searchCols2(list, "dfdd", new MyComparator());
		int num = mySearch2(list, "sdfdd", new MyComparator());
		sop(num);
	}

	// void sort(List<T> list) ��Ȼ˳������
	private static void mySort(List<String> list) {
		Collections.sort(list);
	}

	// void sort(List list,Comparator c)���Ƚ���˳������
	private static void mySort2(List<String> list, Comparator<String> c) {
		Collections.sort(list, new MyComparator());
	}

	// T max(Collection coll) ������Ȼ˳������Ԫ�أ���β�Ǳ�Ԫ��
	private static String myMax(List<String> list) {
		String str = Collections.max(list);
		return str;
	}

	// int binarySearch(List list,T key) ���ֲ��ң����������򼯺�
	private static int searchCols1(List<String> list, String key) {
		int num = Collections.binarySearch(list, key);
		return num;
	}

	// int binarySearch(List list,T key,Comparator c) �����Ȳ���
	private static int searchCols2(List<String> list, String key, Comparator<String> c) {
		int num = Collections.binarySearch(list, key, new MyComparator());
		return num;
	}

	// ��Ȼ����binarySearch()ԭ��
	private static int mySearch(List<String> list, String key) {
		int max = list.size() - 1, min = 0;
		while (min <= max) {
			int mid = (max + min) >> 1;
			String s = list.get(mid);
			int num = s.compareTo(key);
			if (num > 0) {
				max = mid - 1;
			} else if (num < 0) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -min - 1;
	}

	// �Զ�������binarySearch()����
	private static int mySearch2(List<String> list, String key, Comparator c) {
		int max = list.size() - 1, min = 0;
		while (min <= max) {
			int mid = (min + max) >> 1;
			String s = list.get(mid);
			int num = c.compare(s, key);
			if (num > 0)
				max = mid - 1;
			else if (num < 0)
				min = mid + 1;
			else
				return mid;
		}
		return -min - 1;
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}

// �Զ���Ƚ���������������
class MyComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		int num = s1.length() - s2.length();
		if (num == 0) {
			return s1.compareTo(s2);
		}
		return num;
	}
}