package base;

import java.util.Scanner;

/*
 * ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������
	˼·��
	1 �漰���򣬿��Խ�����װ�����飬���������
	2 ����С��8λ����ô���Զ���һ������Ϊ8�����顣
	
 */
public class JiaMiDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		String str = jiaMi(num);
		System.out.println(str);
		s.close();
	}
	public static String jiaMi(int num){
		int[] arr= new int[8];
		
		//������װ������,�������ǵ���
		int index=0;
		while(num>0){
			arr[index]=num%10;
			index++;
			num/=10;
		}
		for(int x=0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0]=arr[index-1];
		arr[index-1]=temp;
		
		//������ת���ַ���
		String s = "";
		for(int x=0;x<index;x++){
			s+=arr[x];
		}
		return s;
	}
}
