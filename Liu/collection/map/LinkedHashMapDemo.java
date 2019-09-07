package map;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 *LinkedHashMap:�ײ����ݽṹ������͹�ϣ������
 *	����֤˳�򣬹�ϣ��֤Ψһ
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lh = new LinkedHashMap<String,String>();
		
		lh.put("zh","chinese");
		lh.put("usa","english");
		lh.put("japan","japanese");
		lh.put("usk","english");
		
		Set<String> keySet = lh.keySet();
		for(String s: keySet){
			String value = lh.get(s);
			System.out.println(s+":"+value);
		}
	}

}
