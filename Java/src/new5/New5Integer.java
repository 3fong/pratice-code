package new5;

/*
 *JDK1.5�汾���2�������ԣ�
	1. Integer x = 4;//�Զ�װ��
	2. ����ֵ��byte��Χ��ʱ�����������ԣ��������ֵ�Ѿ����ڣ��򲻻��ٿ����µĿռ䡣
		װ��Ͳ���
		����
		��ǿfor
		��̬����
		�ɱ����
		ö��
 */
public class New5Integer {

	public static void main(String[] args) {
		//�Զ�װ�� Integer i = new Integer(4);
		Integer i = 4;
		
		//�Զ����䡢װ��  i = new Integer(i.intValue + 4);
		i = i + 4;
		i = new Integer(i.intValue() + 4);
		System.out.println(i);
		
		//����ֵ��byte��Χ��(-128--127)ʱ�����������ԣ��������ֵ�Ѿ����ڣ��򲻻��ٿ����µĿռ䡣
		Integer m = 128;
		Integer n = 128;
		System.out.println(m==n);//false
		
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);//true
		
		Integer c = Integer.valueOf(12);
		Integer d = Integer.valueOf(12);
		System.out.println(c==d);
		
	}

}
