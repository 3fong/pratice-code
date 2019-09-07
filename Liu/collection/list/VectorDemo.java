package list;

import java.util.Enumeration;
import java.util.Vector;

/*
 *Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 */
public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement("hello");
		v.addElement("java");
		v.addElement("girl");
		
		/*for(int x=0;x<v.size();x++){
			String s = (String)v.elementAt(x);
			System.out.println(s);
		}*/
		
		for(Enumeration en = v.elements();en.hasMoreElements();){
			String s = (String)en.nextElement();
			System.out.println(s);
		}
		
	}

}
