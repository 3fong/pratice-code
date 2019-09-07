package digui;

/*
 *��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
 *������
 *	���ɣ� 1	1	2	3	5	8
 *		�ӵ����¿�ʼ����Ϊǰ�����µĺ�
 *ʵ�֣�
 *	����
 *	�����ı仯ʵ��
 *	�ݹ�
 *
 * �������ڵ������µ����Ӷ�����a,b
 * ��һ�����ڵ����ݣ�a=1,b=1
 * �ڶ������ڵ����ݣ�a=1,b=2
 * ���������ڵ����ݣ�a=2,b=3
 * ���ĸ����ڵ����ݣ�a=3,b=5
 * �����ˣ���һ�ε�a����ǰ��b����һ������ǰ��a+b		
 */
public class RabbitDemo {

	public static void main(String[] args) {
		int num = show();
		System.out.println(num);		
		
		int num2 = show1();
		System.out.println(num2);
		
		int num3 = show2(20);
		System.out.println(num3);
	}
	// ����
	public static int show() {
		int[] arr = new int[20];
		for (int x = 0; x < 20; x++) {
			if (x < 2) {
				arr[x] = 1;
			} else {
				arr[x] = arr[x - 1] + arr[x - 2];
			}
		}
		return arr[arr.length - 1];
	}
	// ����
	public static int show1() {
		int a = 1;
		int b = 1;	
		for(int x=0;x<18;x++){
			int temp = a;
			a=b;
			b=temp+b;	
		}
		return b;
	}
	/*
	 * �ݹ�
	 * 	����ֵ��int
	 * 	�����б�int n
	 * 	����������if(n<3) return n=1;
	 * 	���ɣ�if(n>=3) return (n-1)+(n-2)
	 */
	public static int show2(int n){
		if(n<3){
			return n=1;
		}else{
			return show2(n-1)+show2(n-2);
		}
	}
}
