package array;
/*
 *数组排序
 */
public class SortToArray {

	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		System.out.println("排序前：");
		printArray(arr);
		
//		bubbleSort(arr);
		choiceSort(arr);
		System.out.println("排序后：");
		printArray(arr);
	}
	/*
	 * 冒泡排序，相邻元素比较
	 * 明确：
	 * 		返回值类型:void
	 * 		参数列表：int[] arr
	 */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<arr.length-1-x;y++){
				if(arr[y]>arr[y+1]){
					int temp = arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}
	/*
	 * 选择排序：头坐标和其他位置比
	 */
	public static void choiceSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[y]<arr[x]){
					int temp = arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
	//遍历输出数组
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
