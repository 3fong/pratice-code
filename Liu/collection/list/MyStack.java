package list;

import java.util.LinkedList;

/**
 * Ä£ÄâÕ»·ÃÎÊ
 *@author David
 *@version 1.0
 */
public class MyStack {
	private LinkedList ll;
	MyStack(){
		ll=new LinkedList();
	}
	public void add(Object obj){
		ll.addFirst(obj);
	}
	public Object get(){
		return ll.removeFirst();
	}
	public boolean isEmpty(){
		return ll.isEmpty();
	}
}
