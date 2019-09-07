package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *List:���򣨴����ȡ����˳��һ�£���Ԫ�ض�������Ǳ꣩������Ԫ���ظ���
 *����ȥ��List�����е��ظ�Ԫ��
 *	������
 *		ȥ���ظ�Ԫ�أ���Ҫ���ɸѡ�������½�һ��list���ɸѡ���
 *	contains()�ײ�����Object���е�equals()�ж�����Ƿ���ͬ������Ҫ��дequals()
 */
public class ArrayListTrimDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		//ArrayList�ж��Զ���Ԫ���Ƿ���ͬ��Ҫ��дequals����
		list.add(new Student("lin",27));
		list.add(new Student("liu",25));
		list.add(new Student("lin",27));
		list.add(new Student("lin",28));
//		for(Iterator<Student> it = list.iterator();it.hasNext();){
//			Student s  = it.next();
//			System.out.println(s.getName()+":"+s.getAge());
//		}
		List<Student> newLi = trimList2(list);
		for(Student s : newLi){
			System.out.println(s);
		}
	}
	private static List<Student> trimList(List<Student> list){
		List<Student> newLi = new ArrayList<Student>();
		//�����Ѷ��弯�ϣ�ɸѡ��ݴ����¼���
		for(Student s : list){
			if(!newLi.contains(s)){
				newLi.add(s);
			}
		}
		return newLi;
	}
	private static List<Student> trimList2(List<Student> list){
		for(int x=0;x<list.size()-1;x++){
			for(int y=x+1;y<list.size();y++){
				if(list.get(x).equals(list.get(y))){
					list.remove(y);
					y--;
				}
			}
		}
		return list;
	}
}
