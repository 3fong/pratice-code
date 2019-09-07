package test33;
/*
 *9、 写一方法，打印等长的二维数组，要求从1开始的自然数由方阵的最外圈向内螺旋方式地顺序排列。
 * 如： n = 4 则打印：
	 1    2    3    4
	 12   13   14   5
	 11   16   15   6
	 10   9    8    7
 */
public class T8Array2Demo {

	public static void main(String[] args) {
		printArray(4);	
	}

	private static void printArray(int i) {
		int[][] arr = new int[i][i];
		
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				if(x=0)
					arr[x][x];
			}
		}
	}
}
