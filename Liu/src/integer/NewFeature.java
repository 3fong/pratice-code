package integer;
/*
 *1.5������
	�Զ���װ��
	byte��Χ�����ݹ���
 */
public class NewFeature {

	public static void main(String[] args) {
		Integer i = 10;
		i+=20;
		System.out.println(i);
		
		Integer ii = Integer.valueOf(10);//�Զ�װ��
		
		ii = Integer.valueOf(ii.intValue()+20);//�Զ�������װ�䡣
		System.out.println(ii);
		
		Integer iii = null;
		// NullPointerException
		if(iii!=null){
			iii+=100;
			System.out.println(iii);
		}
		
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i2));
		
		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3==i4);//false
		System.out.println(i3.equals(i4));
		
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println(i5==i6);//true
		System.out.println(i5.equals(i6));
		
		//1.5����byte��Χ�ڣ�-128~127�����ؽ����󣬳�����Χ���½�
		//���Ե�ֵַ�����
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7==i8);//false
		System.out.println(i7.equals(i8));
	}

}
