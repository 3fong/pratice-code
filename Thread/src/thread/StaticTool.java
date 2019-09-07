package thread;

public class StaticTool {

	private StaticTool(){}
	public static int getMax(int[] arr){
		int max=0;
		for(int x =0;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	public static int getMin(int[] arr){
		int min=0;
		for(int x=0;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1])
					swap(arr,y,y+1);
			}
		}
	}
	public static void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}
	private static void swap(int[] arr,int a,int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void printArray(int[] arr){
		System.out.print("[");
		for(int x=0;x<arr.length;x++){
			if(x<arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
}
