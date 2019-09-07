package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *���󣺴�ȡѧ��͵�ַ��Ϣ��Ҫ��֤���Ψһ��
 *ѧ�����ԣ�id������id��������ͬ����Ϊͬһ��ѧ��
	������
		ѧ��͵�ַ���ڶ�Ӧ��ϵ����Map���ϣ�û��Ҫ��˳����HashMap
		��֤���ΨһҪ��дhashCode() equals()����
 */
public class GetHashMapDemo {

	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(new Student("01","�����"),"����");
		hm.put(new Student("02","С���"),"���˹�");
		hm.put(new Student("01","�����"),"����");
		hm.put(new Student("01","����ȱ"),"�����");
		
		//����ȡ��������keySet()��entrySet()
		Set<Student> set = hm.keySet();
		for(Iterator<Student> it = set.iterator();it.hasNext();){
			Student s = it.next();
			String value = hm.get(s);
			System.out.println(s.getId()+":"+s.getName()+":"+value);
		}
		
		Set<Map.Entry<Student,String>> entry = hm.entrySet();
		for(Iterator<Map.Entry<Student,String>> it = entry.iterator();it.hasNext();){
			Map.Entry<Student,String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getId()+":"+key.getName()+":"+value);
		}
	}
}
