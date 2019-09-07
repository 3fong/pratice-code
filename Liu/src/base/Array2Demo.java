package base;

public class Array2Demo {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6,7},{8,9,10}};

		int num = loopArray(arr);
		System.out.println(num);
		
		int[][] arr1 = new int[4][];
		arr1[0]= new int[]{22,66,44};
		arr1[1]= new int[]{77,33,88};
		arr1[2]= new int[]{25,45,65};
		arr1[3] = new int[3];
		arr1[3][0]= 11;
		arr1[3][1]= 66;
		arr1[3][2]= 99;
		
		getSale(arr1);
	}
	//遍历二维数组,并求和
	public static int loopArray(int[][] arr){
		int sum=0;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum+=arr[x][y];
			}
		}
		return sum;
	}
	/*
	 * 需求：求公司年销售额
	 * 返回值类型：void 
	 * 参数列表：int[][] arr
	 */
	public static void getSale(int[][] arr1){
		int sum=0;
		for(int x=0;x<arr1.length;x++){
			for(int y=0;y<arr1[x].length;y++){
				sum+=arr1[x][y];
			}
		}
		System.out.println("一年的销售额为："+sum+"万元");
	}
}
