package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ListIterator();±‹√‚≤¢∑¢∑√Œ 
public class ListDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		
		li.add("java01");
		li.add("java02");
		li.add("java10");
		
		for(ListIterator<String> it = li.listIterator();it.hasNext();){
			Object obj = it.next();
			if(obj.equals("java02")){
				it.add("java007");
				it.add("java03");							
			}
			System.out.println("hasPrevious:"+it.hasPrevious());
		}		
		System.out.println("li="+li);
	}

}
