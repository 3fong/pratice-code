package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

/*
 *string���������̰߳�ȫ����
 */
public class CollectionThread {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Vector<String> v = new Vector<String>();
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		//��������ר�ŵĹ����෽�����Ա�֤����ͬ��
		//	
		List<String> list = new ArrayList<String>();
		List<String> lc = Collections.synchronizedList(list);
	}

}
