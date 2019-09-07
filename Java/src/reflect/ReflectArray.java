package reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *数组的反射：具有相同维数和元素类型的数组属于同一个类型，即具有相同的Class实例对象。
	Array.getLength(Object obj)：获取数组的长度；
	Array.get(Object obj,int x)：获取数组中的元素；
	基本类型的一维数组可以被当作Object类型使用，不能当作Object[]类型使用；
	非基本类型的一维数组，既可以当做Object类型使用，又可以当做Object[]类型使用。
 */
public class ReflectArray {

	public static void main(String[] args) {
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[4];
		int[][] a3 = new int[0][3];
		String[] a4 = new String[]{"a","b","c"};
//		sop(a1.getClass()==a2.getClass());//true
//		//他们的父类都是Object
//		sop(a1.getClass().getSuperclass()==a3.getClass().getSuperclass());//true
//		sop(a1.getClass().getSuperclass()==a4.getClass().getSuperclass());//true
//		sop(a1.getClass().getSuperclass());//返回父类的字节码class java.lang.Object
		
		Object o1 = a1;
		Object[] o2 = a4;
		Object o3 = a4;
		sop(Arrays.asList(a1));//[[I@15db9742]
		sop(Arrays.asList(a4));//[a, b, c]
		printObject(a1);
	}
	//Array工具类用于完成对数组的反射
	public static void printObject(Object obj){
		Class clazz = obj.getClass();
		if(clazz.isArray()){
			int len = Array.getLength(obj);
			for(int x=0;x<len;x++){
				System.out.println(Array.get(obj,x));
			}
		}else{
			System.out.println(obj);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
