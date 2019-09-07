package new5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *1��foreach���߼�forѭ��������֧�ֵ������ļ��϶�֧��foreach��
	1.1��ʽ��
	for(�������� ������ : �������ļ��ϣ�Collection��������){}
	1.2�ص㣺
	�ŵ㣺foreach������д���ɶ����顢���Ͻ��б�����
	ȱ�㣺ֻ���������Ԫ�أ������޸ġ���ǿfor��Ŀ�겻��Ϊnull��
	PS:
	�����������˱����������Խ���remove������Ԫ�صĶ�����
	�������ListIterator,�������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ�����
	��ͳfor�͸߼�for����
	�߼�for��һ�������ԣ������б�������Ŀ�ꡣ
	���飺�ڱ�������ʱ���ô�ͳfor����Ϊ����Զ���Ǳꡣ
 */
public class NewForDemo {

	public static void main(String[] args) {
//		getArray();
//		getList();
		getMap();
	}

	private static void getMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"afaf");
		map.put(2,"afaf");
		map.put(3,"afaf");
		Set<Integer> set = map.keySet();
		for(Integer i : set){
			String s = map.get(i);
			sop(i+":"+s);
		}
		Set<Map.Entry<Integer,String>> entry = map.entrySet();
		for(Map.Entry<Integer,String> me : entry){
			Integer key = me.getKey();
			String value = me.getValue();
			sop(key+":"+value);
		}
	}

	private static void getList() {
		List<String> list = new ArrayList<String>();
		list.add("afa");
		list.add("afa");
		list.add("afa");
		for(String s: list){
			sop(s);
		}
	}

	private static void getArray() {
		int[] is ={1,2,4,5};
		for(int i : is){
			sop(i);
		}
		Integer[] in={1,2,4,5};
		for(Integer i : in){
			sop(i);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}		
}
