package base;

import java.util.Scanner;

/*
 *ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������
	�ѵ㣺��ô�������𿪣���ȡģ�ķ���
 */
public class JiaMi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		jiaMi(num);
	}

	private static void jiaMi(int num) {
		int[] arr= new int[8];	
		//ͨ���Ǳ꣬��ȡ������������飬��Ϊ�Ӹ�λ��ʼ�棬�������ݾͱ�ɵ���
		int index=0;
		while(num>0){
			arr[index] = num%10;
			index++;
			num/=10;
		}
		//��5��ģ10
		for(int x=0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
		
		//��ӡ����
		for(int x=0;x<index;x++){
			System.out.print(arr[x]);
		}
	}
}
