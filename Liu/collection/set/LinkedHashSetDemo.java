package set;

import java.util.LinkedHashSet;

/*
 *LinkedHashSet:�ײ����ݽṹ�ɹ�ϣ���������ɡ�
 * ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ�����ء�(�洢��ȡ����һ��)
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		lh.add("libingbing");
		lh.add("caiyilin");
		lh.add("jiajingwen");
		lh.add("anyixuan");
		lh.add("caiyilin");
		lh.add("jiajingwen");
		
		for(String s : lh){
			System.out.println(s);
		}
	}

}
