package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/*
 *string、集合中线程安全问题
 */
public class CollectionThread {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		//集合中有专门的工具类方法可以保证数据同步
		//	
		List<String> list = new ArrayList<String>();
		List<String> lc = Collections.synchronizedList(list);
	}

}
