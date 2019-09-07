package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class WipeArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		System.out.println(al);
		al=myWipe(al);
		System.out.println(al);
	}
	public static ArrayList<String> myWipe(ArrayList<String> al){
		ArrayList<String> newA = new ArrayList<String>();
		
		for(Iterator<String> it = al.iterator();it.hasNext();){
			String str = it.next();
			if(!newA.contains(str))
				newA.add(str);
		}
		return newA;
	}
}
