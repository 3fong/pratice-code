package collection.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *�ص㣺һ��ӳ�䲻�ܰ��ظ��ļ�ÿ�������ֻ��ӳ�䵽һ��ֵ��	
Map���ϣ�
 |--Hashtable:�ڲ��ṹ�ǹ�ϣ�?�߳�ͬ����JDK1.0,Ч�ʵ͡������Դ���null���nullֵ��
	|--Properties:�����洢��ֵ���͵������ļ�����Ϣ�����Ժ�IO�������ϡ�
 |--HashMap���ڲ��ṹ�ǹ�ϣ�?�̲߳�ͬ����JDK1.2,Ч�ʸߡ����Դ���null���nullֵ�����Hashtable����Hashtable������
 |--TreeMap:�ڲ��ṹ�Ǻ�������̲߳�ͬ�����������ڸ�map�����еļ��������
	2.4 ��ȡ
	int size()����ȡ��ֵ�Ը���
	Collection<> Values():��ȡ����������ֵ�ļ��ϡ�
	PS��
	1��Map��Set������ΪSet�ײ�ʹ����Map���ϡ�
	2��Map���ϵ�ȡ��ԭ�?��Map����ת��Set���ϣ���ͨ������ȡ����
 */
public class MapMethodDemo {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new TreeMap<Integer,String>();
		Map<Integer,String> map2 = new TreeMap<Integer,String>();
		
		putMethod(map1,map2);
		removeMethod(map1,map2);
		judgeMethod(map1,map2);
		
	}
	//��� put()��putAll()
	private static void putMethod(Map<Integer, String> map1, Map<Integer, String> map2) {
		map1.put(007,"james");
		map1.put(108,"bangde");		
		map1.put(227,"lady");
		
		map2.putAll(map1);
//		printMap(map2);
		printMap2(map2);
	}
	//ɾ�� remove() clear()
	private static void removeMethod(Map<Integer, String> map1, Map<Integer, String> map2){
		map1.remove(007);
		printMap(map1);
		map2.clear();
		printMap(map2);
	}
	//�ж� containsValue();containsKey();isEmpty();
	private static void judgeMethod(Map<Integer, String> map1, Map<Integer, String> map2){
		System.out.println(map1.containsKey(007));
		System.out.println(map2.containsValue("lady"));
		System.out.println(map2.isEmpty());
	}
	//��ȡ ����ȡ����ʽ keySet()��ȡ���� entrySet()��ȡ����ֵ�Լ�
	private static void printMap(Map<Integer, String> map) {
		// Set<Integer> set = map.keySet();
		// for(Integer s : set){
		// String value = map.get(s); //ͨ����ȡֵ�����û�иü��null��
		// System.out.println(s+":"+value);
		// }
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for(Map.Entry<Integer,String> me :set){
			Integer i = me.getKey();
			String s = me.getValue();
			System.out.println(i+":"+s);
		}
	}
	// ��ȡ size()����ȡ��ֵ�Ը���Collection<> Values():��ȡ����������ֵ�ļ��ϡ�
	private static void printMap2(Map<Integer, String> map) {
		for(int x=0;x<map.size();x++){
			Collection<String> col = map.values();
			System.out.print(col+" ");
		}
	}
}	
