package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * *����
 *����HashMap���ϵ�Ԫ����ArrayList����3����
 *ÿһ��ArrayList���ϵ�ֵ���ַ�����
 *Ԫ�����Ѿ���ɣ��������
 *�����
 *		 ��������
 *		 	����
 *		 	���
 *		 Ц������
 *		 	�����
 *		 	��ƽ֮
 *		 �������
 *		 	����
 *		 	��� 
 */
public class HashMapQianTao2 {
	public static void main(String[] args) {
		HashMap<String,ArrayList<String>> ha = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("����");
		al1.add("���");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("�����");
		al2.add("��ƽ֮");
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("����");
		al3.add("��� ");
		
		ha.put("��������",al1);
		ha.put("Ц������",al2);
		ha.put("�������",al3);
		
		Set<String> keySet = ha.keySet();
		for(String key : keySet){
			ArrayList<String> array = ha.get(key);
			System.out.println(key);
			for(String s : array){
				System.out.println("\t"+s);
			}
		}
	}

}
