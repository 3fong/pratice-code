package test;

public class ArrayTest {

	public static void main(String[] args) {
		int[] chs = {1,5,8,6,5,3};
		myReverse(chs);
		printArray(chs);
		
	}
	public static void myReverse(int[] chs){
		int max=0,min=chs.length-1;
		for(int x=0;x<chs.length;x++){
				if(chs[max]<chs[x]){
					int temp = chs[max];
					chs[max]=chs[x];
					chs[x]=temp;
				}
				if(chs[min]>chs[x]){
					int temp=chs[min];
					chs[min]=chs[x];
					chs[x]=temp;
				}
			
		}
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length ;x++){
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]+"]");
		}
	}
}
