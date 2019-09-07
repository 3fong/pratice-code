package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *ConcurrentModificationException:并发访问异常
 *产生原因：在迭代器遍历时，修改集合，造成迭代器无法识别集合
 *解决方法：
 *		1 用迭代器修改元素，新元素在迭代元素后面
 *		2 集合遍历元素，新元素在集合末尾
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		show1(list);
	}
	public static void show(List list){
		for(ListIterator it = list.listIterator();it.hasNext();){
			String s = (String)it.next();
			if("hello".equals(s)){
				it.add("girl");
			}			
		}
		System.out.println(list);
	}
	public static void show1(List list){
		for(int x=0;x<list.size();x++){
			String s = (String)list.get(x);
			if(s.equals("world")){
				list.add("boy");
			}
		}
		System.out.println(list);
	}
}
