package test33;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *11.�}Ŀ:��дһ���࣬��main�����ж���һ��Map���󣨲��÷��ͣ���
 * �������ɸ�����Ȼ���������ӡ����Ԫ�ص�key��value��

 */
public class T10MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(007,"bangde");
		map.put(006,"james");
		map.put(005,"����");
		
		Set<Integer> set = map.keySet();
		for(Integer s : set){
			String str = map.get(s);
			System.out.println(s+":"+str);
		}
	}

}
