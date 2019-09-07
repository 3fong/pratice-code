package collection;

import java.util.LinkedList;

//定义先进先出FIFO

class Queue{
	private LinkedList link;
	Queue(){
		link=new LinkedList();
	}
	public void mySet(Object obj){
		link.offerFirst(obj);
	}
	public Object getAdd(){
		return link.peekLast();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
public class MyQueue {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.mySet("java01");
		q.mySet("java02");
		q.mySet("java03");
		
		System.out.println(q.getAdd());
		System.out.println(q.isNull());
	}

}
