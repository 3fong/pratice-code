package list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
 *
 *contains()底层依靠Object类中的equals()判断数据是否相同，所以要复写equals()
 */
public class TrimArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林志玲", 40);
		Student s3 = new Student("凤姐", 35);
		Student s4 = new Student("芙蓉姐姐", 18);
		Student s5 = new Student("翠花", 16);
		Student s6 = new Student("林青霞", 27);
		Student s7 = new Student("林青霞", 18);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);
		
		//contains()底层依靠equals()判断数据是否相同，所以要复写equals()
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
