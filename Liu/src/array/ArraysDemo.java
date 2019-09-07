package array;

import java.util.Arrays;

/*
 *Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * 1:public static String toString(int[] a) ������ת���ַ���
 * 2:public static void sort(int[] a) �������������
 * 3:public static int binarySearch(int[] a,int key) ���ֲ���
 */
public class ArraysDemo {
	public static void main(String[] args){
		int[] arr = { 24, 69, 80, 57, 13 };
		
		String s = Arrays.toString(arr);
		System.out.println(s);
		
		//������޷�ֱ�Ӵ�ӡ���飬ֻ�ܽ�����ת���ַ����ٴ�ӡ
		Arrays.sort(arr);
		String s1 = Arrays.toString(arr);
		System.out.println(s1);
		
		//[13, 24, 57, 69, 80]��ʱ�����Ѿ�Ϊ��������
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 69));
		
		//������Ԫ�ػ᷵��Ԫ��-(�������Ǳ�-1)
		System.out.println("binarySearch:"+Arrays.binarySearch(arr, 695));
	}
}
