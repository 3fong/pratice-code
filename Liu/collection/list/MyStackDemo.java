package list;
/*
 *
 */
public class MyStackDemo {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		
		ms.add("zhao");
		ms.add("qao");
		ms.add("zao");
		ms.add("haoo");
		
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
	}

}
