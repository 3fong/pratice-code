package reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *����ķ��䣺������ͬά����Ԫ�����͵���������ͬһ�����ͣ���������ͬ��Classʵ������
	Array.getLength(Object obj)����ȡ����ĳ��ȣ�
	Array.get(Object obj,int x)����ȡ�����е�Ԫ�أ�
	�������͵�һά������Ա�����Object����ʹ�ã����ܵ���Object[]����ʹ�ã�
	�ǻ������͵�һά���飬�ȿ��Ե���Object����ʹ�ã��ֿ��Ե���Object[]����ʹ�á�
 */
public class ReflectArray {

	public static void main(String[] args) {
		int[] a1 = new int[]{1,2,3};
		int[] a2 = new int[4];
		int[][] a3 = new int[0][3];
		String[] a4 = new String[]{"a","b","c"};
//		sop(a1.getClass()==a2.getClass());//true
//		//���ǵĸ��඼��Object
//		sop(a1.getClass().getSuperclass()==a3.getClass().getSuperclass());//true
//		sop(a1.getClass().getSuperclass()==a4.getClass().getSuperclass());//true
//		sop(a1.getClass().getSuperclass());//���ظ�����ֽ���class java.lang.Object
		
		Object o1 = a1;
		Object[] o2 = a4;
		Object o3 = a4;
		sop(Arrays.asList(a1));//[[I@15db9742]
		sop(Arrays.asList(a4));//[a, b, c]
		printObject(a1);
	}
	//Array������������ɶ�����ķ���
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
