package new5;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *? 通配符:可理解为占位符。它用于定义泛型未明确的类型。
	3.4.1泛型的高级应用
	泛型限定 作用：用于功能扩展。
	？ extends E：可接收E类型或E的子类型。 上限。
	？ super E:可接收E类型或E的父类型。 下限。
 */
public class LimitGenericDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(5);
		al1.add(6);

		printList(al);
	}

	// 有两个需要迭代的方法，定义迭代器时不知要使用哪一个，就可以用"?"来占位
	private static <T> void printList(ArrayList<T> al) {
		for (Iterator<T> it = al.iterator(); it.hasNext();) {
			// System.out.println(it.next());//Object obj = it.next();
			T t = it.next();// ? 无法使用类型的特有方法。
			System.out.println(t);
		}
	}

}
