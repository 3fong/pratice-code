package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * E:���Ϻ������ת��
	Collection-->Array   
		Collection.toArray() 
		��ת��Ϊ�������͵�����
		String[] y = x.toArray(new String[0]); 
	Array-->List
		Arrays.asList()
 *3����������
	3.1ʮ����ת���������ƣ�
	Integer.toString(String,radix)
	toBinaryString();
	toHexString();
	toOctalString();
	3.2��������ת��ʮ���ƣ�
	Integer.parseInt(String,radix);radix:Ҫת�Ľ�������String������ַ�����
	����int x = Integer.parseInt("3c",16);///~60
 */
public class TransformDemo3 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("abc");
		col.add("12");
		col.add("$%");
		System.out.println(col);
		//����ת������
		Object[] obj = col.toArray();
		//����ȡ�������е�Ԫ��
		for(int x=0;x<obj.length;x++){
			String st = (String)obj[x];
			System.out.println(st);
		}
		
		//������ת�ɼ���
		List li =  Arrays.asList(obj);
		System.out.println("li��"+li);
		trans();
	}
	public static void trans(){
		//��ʮ����ת������������
		String s = Integer.toString(274,2);
		System.out.println("s:"+s);
		//����������ת��ʮ����
		int num = Integer.parseInt("0100010010",2);
		System.out.println("num:"+num);
		
		String two = Integer.toBinaryString(274);
		String out = Integer.toOctalString(274);
		String hex = Integer.toHexString(274);
		System.out.println("two:"+two);
		System.out.println("out:"+out);
		System.out.println("hex:"+hex);
	}
}
