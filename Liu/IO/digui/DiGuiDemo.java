package digui;
/*
 *�ݹ飺���������е��÷������������
 * 
 * ������Ƕ�׵��ã��ⲻ�ǵݹ顣
 * Math.max(Math.max(a,b),c);
 * 
 * public void show(int n) {
 * 		if(n <= 0) {
 * 			System.exit(0);
 * 		}
 * 		System.out.println(n);
 * 		show(--n);
 * }
 * ע�����
 * 		A:�ݹ�һ��Ҫ�г��ڣ�����������ݹ�
 * 		B:�ݹ�Ĵ�������̫�࣬������ڴ����
 * 		C:���췽�����ܵݹ�ʹ��
 * 
 * ����ʵ��5�Ľ׳�
 * 		5��=1*2*3*4*5
 * 		5��=5*4��
 * ʵ�������ַ�����	
 * 		ѭ��ʵ��
 * 		�ݹ�
 * 			дһ������
 * 			��������
 * 			����
 */
public class DiGuiDemo {

	public static void main(String[] args) {		
//		show();
		
		int num = show2(5);
		System.out.println(num);
	}
	//ѭ��
	public static void show(){
		int a=1;
		for(int x=1;x<=5;x++){
			a*=x;
		}
		System.out.println(a);		
	}
	/*
	 * �ݹ�
	 * 	����ֵ���ͣ�int
	 * 	�����б�int num
	 * 	����������if(num==1) return num=1;
	 * 	���ɣ� 	if(num!=1) return num*������(num-1);
	 */
	public static int show2(int num){
		if(num==1)
			return num=1;
		else
			return num*show2(num-1);
	}
}
