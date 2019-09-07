package array;
/*
 *������ҵ����ַ�ʽ
 *	������ͨ����
 *	���򣺶��ֲ���
 *ע�Ȿ����������飬����������ʹ�ö��ֲ��ң���Ϊ��ı���ԭ����
 *��ȷ��
 *	����ֵ��int
 *	�����б�int[] arr,int key
 */
public class BinarySearchDemo {

	public static void main(String[] args) {
		int[] arr = {11,44,55,22,33,66,77};
		int[] arr1 = {11,22,33,44,55,66,77};
		int index = search(arr,22);
		System.out.println("index:"+index);
		
		int index1 = search(arr1,777);
		System.out.println("index1:"+index1);
	}
	public static int search(int[] arr,int key){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==key){
				return x;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr,int key){
		int max = arr.length-1;
		int min = 0;
		int mid;
		while(min<=max){
			mid=(max+min)>>>1;
			if(arr[mid]>key){
				max=mid-1;
			}
			else if(arr[mid]<key){
				min=mid+1;
			}
			else
				return mid;
		}
		return -1;
	}
}
