package base;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		
//		int i = s.nextInt();
//		
		//�ַ���ֵ�ģ�Ҫע���������ֵ
//		String str = searchWeek(i);
//		System.out.println(str);
//		
		int[] arr = {1,5,8,8,7,23};

//		loopArray(arr);
		
		getMax(arr);
		System.out.println(arr);
//		getMax(arr);
		
//		reverse2(arr);
		loopArray(arr);
		
//		int index = getAddress(arr,46);
//		System.out.println(index);
	}
	/*
	 * ���󣺱�������
	 * ����ֵ���ͣ�void
	 * �����б�int[]
	 */
	public static void loopArray(int[] arr){
		//����һ��
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
		//��������
//		System.out.print("[");
//		for(int x=0;x<arr.length;x++){
//			if(x<arr.length-1){
//				System.out.print(arr[x]+",");
//			}
//			else
//				System.out.print(arr[x]+"]");
//		}
	}
	/*
	 * ��ȡ��ֵ
	 * ����ֵ���ͣ�int
	 * �����б�int[]
	 */
	public static void getMax(int[] arr){
		int max=arr[0];
		for(int x=1;x<arr.length;x++){
			if(arr[x]>max){
				max=arr[x];
			}			
		}
//		return max;
	}
	/*
	 * ����Ԫ������
	 * ����ֵ��void
	 * �����б�int[]
	 */
	//����һ��
	public static void reverse(int[] arr){
		for(int x=0;x<arr.length/2;x++){
			int temp=arr[x];
			arr[x]=arr[arr.length-1-x];
			arr[arr.length-1-x]=temp;
		}
	}
	//��������
	public static void reverse2(int[] arr){
		for(int start=0,end=arr.length-1;start<end;start++,end--){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	/*
	 * ���󣺲��Ҷ�Ӧ����
	 * ����ֵ���ͣ�String
	 * �����б�int[]
	 */
	public static String searchWeek(int x){
		String[] s = {"","����һ","���ڶ�","������","������","������","������","������"};
		if(x>=1&&x<=7)
			return s[x];
		else
			return null;
	}
	/*
	 * ���󣺻�ȡԪ�ص�һ�γ���λ��
	 * ����ֵ���ͣ�int
	 * �����б�int[] arr,int key
	 */
	public static int getAddress(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==key){
				return x;
			}
		}
		return -1;
	}
}
