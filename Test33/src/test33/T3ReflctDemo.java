package test33;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *3�� ArrayList<Integer> list = new ArrayList<Integer>(); 
            ���������ΪInteger��ArrayList�д��һ��String���͵Ķ���
	������
		���������޶��������ͣ�����������ܴ洢�����������͡�
		����ı������ʣ�����ͻ�Ʒ��ͼ�飬��Ҳ������ArrayList��add()�������Խ���
		������������
 */
public class T3ReflctDemo {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		Class clazz = list.getClass();
		/*
		 * ��Ϊadd()�����Ĳ����б�������Object����
		 * ���ڷ���,һ������ע����Ƿ���Ķ����������ε����η���ʲô?
		 * �����public���ε�,ֱ�ӿ���getMethod()������ʽ�Ϳ��ԣ�
		 * �����Ĭ�ϵ�,����Ҫͨ��getDeclaredMethod()�ſ��ԣ�
		 * Ҫ��private�Ļ�,�Բ���,����Ҫͨ������������,����Ҫͨ��
		 * getDeclaredMethod(),������me.setAccessible(true)����������Ȩ��.
		 */
		Method me = clazz.getMethod("add",Object.class);
		me.invoke(list,"����");
		System.out.println(list);
	}

}
