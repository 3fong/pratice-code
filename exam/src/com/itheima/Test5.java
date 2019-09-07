package com.itheima;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
5、把以下IP存入一个txt文件，编写程序把这些IP按数值大小，从小到达排序并打印出来。
61.54.231.245
61.54.231.9
61.54.231.246
61.54.231.48
61.53.231.249
思路：
1、读取文本文件，用FileReader，并加入缓冲区提高效率；
2、因为涉及排序，可以使用Set集合，自定义比较器；
3、实现Comparator接口，覆盖compare方法。
*/
//自定义比较器
class MyComparator implements Comparator<String> {
    
	@Override
    public int compare(String o1, String o2) {
		String[] strAr1 = o1.split("\\.");
		String[] strAr2 = o2.split("\\.");

		//用选择排序方式比较四个间区的Ip大小
		for (int i = 0; i < strAr1.length; i++) {
        	//相等跳出,比下一个间区;
            if (strAr1[i].equals(strAr2[i])) {
            	continue;
            }
            //不相等,则可以确定顺序
            Integer i1 = new Integer(strAr1[i]);
            Integer i2 = new Integer(strAr2[i]);
            return i1.compareTo(i2);
		}
		//IP完全相同,则不加入;可以改变0,就可以加入;
		return 0;
    }
}
public class Test5 {
    public static void main(String[] args) throws Exception {
    	BufferedReader bufReader = 
    			new BufferedReader(new FileReader(new File("IP.txt")));
        //利用Set排序, 构造特定Comparator
    	Set<String> set = new TreeSet<String>(new MyComparator());

    	//读取IP.txt文件;
    	String ipStr = null;
    	while ((ipStr = bufReader.readLine()) != null) {
        	set.add(ipStr.trim());
    	}
    	bufReader.close();

    	//直接打印;
    	for (String str : set) {
    		System.out.println(str);
    	}
    }
}