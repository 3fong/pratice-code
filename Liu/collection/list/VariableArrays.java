package list;
/*
 *�ɱ���������巽����ʱ��֪���ö�����ٸ�����
 * ��ʽ��
 * 		���η� ����ֵ���� ������(�������͡�  ������){}
 */
public class VariableArrays {

	public static void main(String[] args) {
		int a = 1;
		int b=34;
		int c=29;
		int result = sum(a+b+c);
		System.out.println(result);
		
		int result1 = sum(a+b);
		System.out.println(result1);
	}
	public static int sum(int...arr){
		int s = 0;
		for(int x : arr){
			s+=x;
		}
		return s;
	}
}
