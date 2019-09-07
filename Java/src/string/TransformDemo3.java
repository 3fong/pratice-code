package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * E:集合和数组的转换
	Collection-->Array   
		Collection.toArray() 
		可转换为任意类型的数组
		String[] y = x.toArray(new String[0]); 
	Array-->List
		Arrays.asList()
 *3、常见方法
	3.1十进制转成其他进制：
	Integer.toString(String,radix)
	toBinaryString();
	toHexString();
	toOctalString();
	3.2其他进制转成十进制：
	Integer.parseInt(String,radix);radix:要转的进制数，String：标的字符串。
	例：int x = Integer.parseInt("3c",16);///~60
 */
public class TransformDemo3 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("abc");
		col.add("12");
		col.add("$%");
		System.out.println(col);
		//集合转成数组
		Object[] obj = col.toArray();
		//遍历取出数组中的元素
		for(int x=0;x<obj.length;x++){
			String st = (String)obj[x];
			System.out.println(st);
		}
		
		//将数组转成集合
		List li =  Arrays.asList(obj);
		System.out.println("li："+li);
		trans();
	}
	public static void trans(){
		//将十进制转换成其他进制
		String s = Integer.toString(274,2);
		System.out.println("s:"+s);
		//将其他进制转成十进制
		int num = Integer.parseInt("0100010010",2);
		System.out.println("num:"+num);
		
		String two = Integer.toBinaryString(274);
		String out = Integer.toOctalString(274);
		String hex = Integer.toHexString(274);
		System.out.println("two:"+two);
		System.out.println("out:"+out);
		System.out.println("hex:"+hex);
	}
}
