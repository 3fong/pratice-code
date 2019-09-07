package collection.tools;

import java.text.DecimalFormat;
import java.util.Random;

/*
 *Math��:�����ṩ�˾�̬�Ĳ�����ѧ����ķ�����
	���÷�����
	ceil()�����ش��ڲ������С����
	floor()������С�ڲ�����������
	round()�������������������
	pow(a,b)��a��b�η���
	random():����0-1֮��������
	text����DecimalFormat�����ָ������С���λ��ͨ�����format()���������и�ʽ����
	Random:���ڲ�����������
	(2)���췽��:
		A:Random() Ĭ�����ӣ�ÿ�β���������ͬ
		B:Random(long seed) ָ�����ӣ�ÿ��������ͬ����������ͬ
	(3)��Ա����:
		A:int nextInt() ����int��Χ�ڵ������
		B:int nextInt(int n) ����[0,n)��Χ�ڵ������
 */
public class MathDemo {

	public static void main(String[] args) {		
//		sop(Math.ceil(12.34));//����ȡ��13.0
//		sop(Math.floor(12.34));//����ȡ��12.0
//		sop(Math.round(12.5));//��������13
//		sop(Math.pow(2,3));//2��3�η�8.0
//		getRandom();
		getFloat();
	}
	private static void getRandom() {
		//��������һ��
		Random r = new Random();
		int n = r.nextInt();//����int��Χ�ڵ������
		int num = r.nextInt(10);//���0��10֮�������
		sop(num+":"+n);
		
		//��������
		for(int x=0;x<10;x++){
			int num2 = (int)(Math.random()*10+1);
			sop(num2);
		}
	}
	//DecimalFormat�����ָ������С���λ��ͨ�����format()���������и�ʽ����
	private static void getFloat() {
		for(int x=0;x<5;x++){
			Float f = (float)(Math.random()*10+1);
			DecimalFormat df = new DecimalFormat("#.00");
			String s = df.format(f);
			sop(s);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
