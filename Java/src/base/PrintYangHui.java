package base;
/*
 *��ӡ�������
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * ���ɣ�
	 * ÿ����βΪ1��
	 * �ӵ����п�ʼ���м�ֵΪ����ֵ����ǰֵ�ͣ�
	 * ���������Σ�������ͬ 
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
		//��Ϊ��β�Ѿ���ֵ������yֵ��Χ�̶�
		for(int x=0;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
					arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		//�������
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
