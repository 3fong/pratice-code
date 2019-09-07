package set;

import java.util.LinkedHashSet;

/*
 *LinkedHashSet:底层数据结构由哈希表和链表组成。
 * 哈希表保证元素的唯一性。
 * 链表保证元素有素。(存储和取出是一致)
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		lh.add("libingbing");
		lh.add("caiyilin");
		lh.add("jiajingwen");
		lh.add("anyixuan");
		lh.add("caiyilin");
		lh.add("jiajingwen");
		
		for(String s : lh){
			System.out.println(s);
		}
	}

}
