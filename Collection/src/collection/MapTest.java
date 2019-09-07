package collection;

import java.util.Map;
import java.util.TreeMap;

/*
 * 获取字符串中字母出现的次数
 * 思路：
 * 1 将字符串转换成字符数组，因为要对每一个字母进行操作
 * 2 定义一个map集合，因为打印有顺序，使用treemap
 * 3 遍历字符数组
 * 		将每一个字符作为键去查map集合
 * 		如果返回null，将该字母和1存入map集合
 * 		如果返回不是null，说明该字母在map集合已经存在并有对应次数
 * 		那么就获取该次数并进行自增，然后将该字母和自增后的次数存入到map集合中，覆盖调用原理键所定应的值。
 * 4 将map集合中的数据变成指定的字符串形成返回。
 */

public class MapTest {

	public static void main(String[] args) {
		String s = "afajAFJALJF0LJLKE8";

		System.out.println(getCount(s));
	}
	public static String getCount(String str){
		char[] chs = str.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		int count=0;
		for(int x=0;x<chs.length;x++){
			if(!(chs[x]>='a'&&chs[x]<='z'||chs[x]>='A'&&chs[x]<='Z'))
				continue;

			Integer value = tm.get(chs[x]);
			if(value!=null)
				count=value;
			count++;
			tm.put(chs[x],count);
			count = 0;
		}
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<Character,Integer> me : tm.entrySet()){
			sb.append(me.getKey()+"("+me.getValue()+")");
		}
		return sb.toString();
	}
}
