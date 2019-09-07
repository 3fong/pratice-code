package test33;

import java.util.ArrayList;
import java.util.List;

/*
 *编写程序，生成5个1至10之间的随机整数，存入一个List集合，
	编写方法对List集合进行排序（自定义排序算法，禁用Collections.sort方法和TreeSet）
 */
public class T27RandomListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int x=0;x<5;x++){
			int num = (int)(Math.random()*10+1);
			list.add(num);
		}
		Integer[] is = list.toArray(new Integer[list.size()]);
		printList(is);
		Integer[] ii = mySort(is);
		printList(ii);	
	}

	private static Integer[] mySort(Integer[] is) {
		for(int x=0;x<is.length-1;x++){
			for(int y=0;y<is.length-1-x;y++){
				if(is[y]>is[y+1]){
					int temp = is[y];
					is[y]=is[y+1];
					is[y+1]=temp;
				}
			}
		}
		return is;
	}
	private static void printList(Integer[] is) {
		System.out.print("[");
		for(int x=0;x<is.length;x++){
			if(x<is.length-1)
				System.out.print(is[x]+",");
			else
				System.out.println(is[x]+"]");
		}
	}
	//集合转数组的第二种方式
	private static void transArray(List<Integer> list){
		int[] arr = new int[list.size()];
		for(int x=0;x<arr.length;x++){
			arr[x]=list.get(x);
		}
	}
}
