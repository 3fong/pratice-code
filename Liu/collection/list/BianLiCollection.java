package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *����Collection���������ַ���
 */
public class BianLiCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("zhao");
		c.add("qian");
		c.add("sun");
		bianLi(c);
	}
	//������ת�����飬forѭ��
	public static void bianLi(Collection c){
		Object[] obj = c.toArray();
		for(int x=0;x<obj.length;x++){
			String s = (String)obj[x];
			System.out.println(s);
		}
	}
}
