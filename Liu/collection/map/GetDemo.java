package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *��ȡ���ܣ�
 * V get(Object key):���ݼ���ȡֵ
 * Set<K> keySet():��ȡ���������м��ļ���
 * Collection<V> values():��ȡ����������ֵ�ļ���
 * Set<Map.Entry<K,V>> entrySet()�����ص��Ǽ�ֵ�Զ���ļ���
 * Map���������ֱ�����ʽ��һ��ȡ��ֵ��ʽ��ǰ���ַ������ǽ���ȡ�������Set�����У����Լ���Ψһ��
 * 	��һ���Ǵ���Collection�����С�
 */
public class GetDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("liling","chuyi");
		map.put("guocaiye","chusan");
		map.put("longzhu","ershi");
		map.put("guocaiye","chusan");
		


	}
	//������ʽһ��ͨ����������ȡֵ
	public static void getMap(Map<String,String> map){
		Set<String> set = map.keySet();
		for(String s : set){
			String value = map.get(s);
			System.out.println(s+":"+value);
		}
	}
	//������ʽ����ͨ����ֵ�Զ��������ȡ����ֵ
	public static void getMap1(Map<String,String> map){
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for(Map.Entry<String,String> me : entrySet){
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		}
	}
	//ͨ��values()������ȡmap����������ֵ��
	public static void getMapValues(Map<String,String> map){
		Collection<String> col = map.values();
		
		for(String s: col){
			System.out.println(s);
		}
	}
}
