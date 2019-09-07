package io.file;
/*
 *��һ�����ӣ��ӳ�����3������ÿ���¶���һ�����ӣ�С���ӳ���������º�ÿ��������һ�����ӣ�
 *�������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
 *������
 *	ʱ��		1	2	3	4	5	6
 *	����		1	1	2	3	5	8
 *���ɣ��ӵ����������������ǰ�����µĺ�
 *ʵ�֣�
 *	����
 *	�����ı仯ʵ��
 *	�ݹ�
 */
public class RabbitDemo {

	public static void main(String[] args) {
		show1();
		show2();
		int num = show3(20);
		System.out.println(num);
	}
	//����
	private static void show1() {
		int[] arr = new int[20];
		for(int x=0;x<arr.length;x++){
			//��0��ʼ������3�¾���2
			if(x<2)
				arr[x]=1;
			else
				arr[x]=arr[x-1]+arr[x-2];
		}
		System.out.println(arr[arr.length-1]);
	}
	//�����ı仯ʵ��
	private static void show2() {
		int a=1;
		int b=1;
		for(int x=0;x<18;x++){
			int temp=a;
			a=b;
			b=a+temp;
		}
		System.out.println(b);
	}
	/*
	 * �ݹ�
	 * �������� mon<3	mon=1;
	 */
	private static int show3(int mon) {
		if(mon<3)
			return mon=1;
		else{
			return show3(mon-1)+show3(mon-2);
		}
	}
}
