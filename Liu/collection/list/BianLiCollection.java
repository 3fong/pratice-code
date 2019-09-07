package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *遍历Collection集合有两种方法
 */
public class BianLiCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("zhao");
		c.add("qian");
		c.add("sun");
		bianLi(c);
	}
	//将集合转成数组，for循环
	public static void bianLi(Collection c){
		Object[] obj = c.toArray();
		for(int x=0;x<obj.length;x++){
			String s = (String)obj[x];
			System.out.println(s);
		}
	}
}
