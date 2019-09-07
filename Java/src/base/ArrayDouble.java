package base;
/*
 *һά�����ȡ��ֵ����ά�������
 */
public class ArrayDouble {

	public static void main(String[] args) {
//		int[][] arr = {{3,4,4,4},{4,7,8,5},{1,5,4,9}};
//		getSum(arr);
//		
//		int[] arr1 = {4,1,8,9,6,2,3};
////		getMax(arr1);
//		getMax1(arr1);
		
	}
	//��ȡ��ֵ
	private static void getMax1(int[] arr1) {
		int max=0;
		for(int x=0;x<arr1.length;x++){
			if(arr1[x]>arr1[max]){
				max=x;
			}
		}
		System.out.println(arr1[max]);
	}
	//���׽Ǳ��ȡ��ֵ
	private static void getMax(int[] arr1) {
		for(int x=0;x<arr1.length;x++){
			if(arr1[x]>arr1[0]){
				int temp = arr1[0];
				arr1[0]=arr1[x];
				arr1[x]=temp;
			}
		}
		printArray(arr1);
	}
	public static void getSum(int[][] arr){
		int sum=0;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum+=arr[x][y];
			}
		}
		System.out.println(sum);
	}
	//�����ӡ����
	public static void printArray(int[] arr){
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
