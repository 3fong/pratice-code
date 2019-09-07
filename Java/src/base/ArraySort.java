package base;

import java.util.Arrays;

/*
 *����������
 */
public class ArraySort {

	public static void main(String[] args) {
		int[] arr = {4,1,8,9,6,2,3};
//		selectSort(arr);
//		bubbleSort(arr);
		Arrays.sort(arr);
		printArray(arr);
	}
	//��������������Ƚϣ���ֵ��β���� 
	private static void bubbleSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){
					int temp= arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
		printArray(arr);
	}
	//ѡ������ͷ�Ǳ�������Ǳ�Ƚϣ����ֵ��ͷ�Ǳ�
	private static void selectSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]>arr[x]){
					int temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
		printArray(arr);
	}
	//������ӡ����
	private static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1){
				System.out.print(arr[x]+",");
			}else{
				System.out.println(arr[x]+"]");
			}
		}		
	}
}
