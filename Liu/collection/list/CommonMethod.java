package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?取交集，如果此 collection 由于调用而发生更改，则返回 true
 */
public class CommonMethod {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
//		c.add("abc1");
//		c.add("abc2");
//		c.add("abc3");
		c.add("abc4");
		
		Collection c1 = new ArrayList();
		c1.add("abc4");
		c1.add("abc5");
		c1.add("abc6");
		c1.add("abc7");
		
//		c.addAll(c1);
//		System.out.println(c);
		
		//只要有元素被移除就返回true			
//		System.out.println(c.removeAll(c1));
//		System.out.println(c);
		
		//全部包含才返回true。
//		System.out.println(c.containsAll(c1));
		
		//retainAll()返回值表示c集合有没有发生变化。
		System.out.println(c.retainAll(c1));
		System.out.println(c);
		System.out.println(c1);
	}

}
