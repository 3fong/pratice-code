package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *ArrayList����Ƕ��HashMap���ϲ�������
	 ����
	 ����ArrayList���ϵ�Ԫ����HashMap����3����
	 ÿһ��HashMap���ϵļ���ֵ�����ַ�����
	 Ԫ�����Ѿ���ɣ��������
	 �����
	 ���---С��
	 ����---����
	
	 ����---����
	 ���---С��Ů
	
	 �����---��ӯӯ
	 ��ƽ֮---����ɺ
 */
public class ArrayListQianTao {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> ah = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���","С��");
		hm1.put("����","����");
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("����","����");
		hm2.put("���","С��Ů");
		
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("�����","��ӯӯ");
		hm3.put("��ƽ֮","����ɺ");
		
		ah.add(hm1);
		ah.add(hm2);
		ah.add(hm3);
		
		for(HashMap<String,String> hash : ah){
			Set<String> keySet = hash.keySet();
			for(String s : keySet){
				String value = hash.get(s);
				System.out.println(s+"---"+value);
			}
		}
	}

}
