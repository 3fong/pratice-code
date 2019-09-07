package base;
/*
 *数组的查找:有一个有序的数组，想要将一个元素依序插入到该数组中，
 */
public class ArraySearch {

	public static void main(String[] args) {
//		int[] arr = {3,4,6,7,9,1,5};
//		int num = search(arr,1);
//		System.out.println(num);
		
		int[] arr1 = {3,4,6,7,9,11,15};
		int num1 = halfSearch1(arr1,15);
//		int num2 = halfSearch2(arr1,5);
		System.out.println(num1);
	}
	private static int halfSearch2(int[] arr1, int i) {
		int max=arr1.length-1,min=0,mid;
		mid=(max+min)/2;
		while(arr1[mid]!=i){
			if(arr1[mid]>i){
				max=mid-1;
			}else if(arr1[mid]<i){
				min=mid+1;
			}
			if(min>max){
				return -min-1;
			}
			mid=(max+min)/2;
			
		}
		return mid;
	}
	//折半查找，高效，必须有序
	private static int halfSearch1(int[] arr1, int i) {
		int max=arr1.length-1,min=0,mid;
		
		while(max>=min){
			mid = (max+min)>>1;
			if(arr1[mid]>i){
				max=mid-1;
			}else if(arr1[mid]<i){
				min=mid+1;
			}else{
				return mid;
			}
		}
		return -min-1;
	}
	//查找 元素顺序随意
	public static int search(int[] arr,int num){
		for(int x=0;x<arr.length;x++){
			if(arr[x]==num){
				return x;
			}			
		}
		return -1;
	}
}
