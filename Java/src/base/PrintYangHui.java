package base;
/*
 *打印杨辉三角
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * 规律：
	 * 每行收尾为1；
	 * 从第三行开始，中间值为上行值加其前值和；
	 * 等腰三角形，行列相同 
 */
public class PrintYangHui {

	public static void main(String[] args) {
		printSingle(5);
	}

	private static void printSingle(int i) {
		int[][] arr = new int[i][i];
		for(int x=0;x<arr.length;x++){
			arr[x][0]=1;
			arr[x][x]=1;
		}
		//因为首尾已经赋值，所以y值范围固定
		for(int x=0;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
					arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		//遍历输出
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
