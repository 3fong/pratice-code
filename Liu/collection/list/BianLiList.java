package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
 *List的遍历有四种方法，自己特有三种
 */
public class BianLiList {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		Student s1 = new Student("张三丰",80);
		Student s2 = new Student("张翠山",30);		
		Student s4 = new Student();
		s4.setName("贾静雯");
		s4.setAge(40);
		
		list.add(s1);
		list.add(s2);
		list.add(new Student("张无忌",10));
		list.add(s4);
//		show(list);
		
		show1(list);
//		show(list);
	}
	//最常用的方法Iterator()
	public static void show(List list){
		for(Iterator it = list.iterator();it.hasNext();){
			Student s = (Student)it.next();
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
	//listItetator()，解决并发访问异常 ，比较字符串外的自定义对象要复写equals方法
	//否则equals是Object中的，只会比较地址值。
	public static void show1(List list){
		for(ListIterator it = list.listIterator();it.hasNext();){
			Student s = (Student)it.next();
			if(s.equals(new Student("张无忌",10))){
				it.add(new Student("赵敏",8));
			}			
		}
		show(list);
	}
	//for和get(),可以添加元素，解决并发访问异常的第二种方法。
	public static void show2(List list){
		for(int x=0;x<list.size();x++){
			Student s = (Student)list.get(x);
			if(s.equals(new Student("张无忌",10))){
				list.add(new Student("赵敏",8));
			}
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
	public static void show3(List list){
		Object[] obj = list.toArray();
		for(int x=0;x<obj.length;x++){
			Student s = (Student)obj[x];
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
