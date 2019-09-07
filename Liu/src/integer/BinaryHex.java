package integer;
/*
 *3.1ʮ����ת���������ƣ�
	Integer.toString(String,radix)
	toBinaryString();
	toHexString();
	toOctalString();
3.2��������ת��ʮ���ƣ�
Integer.parseInt(String,radix);radix:Ҫת�Ľ�������String������ַ�����
 */
public class BinaryHex {

	public static void main(String[] args) {
		sop(Integer.toBinaryString(100));
		sop(Integer.toHexString(100));
		sop(Integer.toOctalString(100));
		
		//ʮ����ת��������
		sop(Integer.toString(100,2));
		sop(Integer.toString(100,8));
		sop(Integer.toString(100,16));
		
		//��������תʮ���ƣ�ע�������������ַ���
		sop(Integer.parseInt("1100100",2));
		sop(Integer.parseInt("64",16));
		sop(Integer.parseInt("144",8));
	}
	public static void sop(Object o){
		System.out.println(o);
	}
}
