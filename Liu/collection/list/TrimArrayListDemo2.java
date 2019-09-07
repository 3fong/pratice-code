package list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
 *
 *contains()�ײ�����Object���е�equals()�ж������Ƿ���ͬ������Ҫ��дequals()
 */
public class TrimArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 18);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		
		//contains()�ײ�����equals()�ж������Ƿ���ͬ������Ҫ��дequals()
		ArrayList newAl = new ArrayList();
		for(Iterator it = array.iterator();it.hasNext();){
			Student s = (Student)it.next();
			if(!newAl.contains(s)){
				newAl.add(s);
			}
		}
		for(Iterator it = newAl.iterator();it.hasNext();){
			Student s = (Student)it.next();
			System.out.println(s);
			}
		}		
}
