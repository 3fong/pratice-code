package collection;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {

		Properties p = System.getProperties();
		
		String value =System.setProperty("myKey","myVazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzlue");
		
		System.out.println(value);
		String va = System.getProperty("os.name");
		System.out.println(va);
		
		String v = System.getProperty("haha");
		
		System.out.println(v);
//		for(Object obj : p.keySet()){
//			System.out.println(obj+":"+p.get(obj));
//		}
	}

}
