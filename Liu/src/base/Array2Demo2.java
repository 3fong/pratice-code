package base;

import java.util.Scanner;

public class Array2Demo2 {

	public static void main(String[] args) {
		//�����ֶ�����
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		getSingle(num);
	}
	/*
	 * ��ӡ�������
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * ���ɣ�
	 * ÿ����βΪ1��
	 * �ӵ����п�ʼ���м�ֵΪ����ֵ����ǰֵ�ͣ�
	 * ���������Σ�������ͬ 
	 */
	public static void getSingle(int a){
		//�����ά����
		int[][] arr = new int[a][a];
		
		//������βֵ
		for(int x=0;x<arr.length;x++){
			arr[x][0]=1;
			arr[x][x]=1;
		}
		//�����м�ֵ���ӵ����п�ʼ����������������β��
		for(int x=0;x<arr.length;x++){
			for(int y=1;y<=x-1;y++){
				arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
			}
		}
		//�����������Ϊ�ǵ��������Ը��žų˷���ṹ���ơ�
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
