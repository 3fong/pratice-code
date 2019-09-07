package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *���͸߼�(ͨ���)
 * ?:�������ͣ����û����ȷ����ô����Object�Լ������Java����
 * ? extends E:�����޶���E��������
 * ? super E:�����޶���E���丸��
 */
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class GenericLimit {

	public static void main(String[] args) {
		
		//����һ��ȷ�����������߱�����ͬ
		Collection<Object> coll = new ArrayList<Object>();
//		Collection<Object> coll1 = new ArrayList<Animal>();
//		Collection<Object> coll2 = new ArrayList<Dog>();
//		Collection<Object> coll3 = new ArrayList<Cat>();
		
		// ?��ʾ��������Ͷ��ǿ��Ե�
		Collection<?> coll4 = new ArrayList<Object>();
		Collection<?> coll5 = new ArrayList<Animal>();
		Collection<?> coll6 = new ArrayList<Dog>();
		Collection<?> coll7 = new ArrayList<Cat>();
		
		//? extends E:�����޶���E��������
//		Collection<? extends Animal> coll8 = new ArrayList<Object>();
		Collection<? extends Animal> coll9 = new ArrayList<Animal>();
		Collection<? extends Animal> coll11 = new ArrayList<Dog>();
		Collection<? extends Animal> coll12 = new ArrayList<Cat>();
		
		//? super E:�����޶���E���丸��
		Collection<? super Animal> coll13 = new ArrayList<Object>();
		Collection<? super Animal> coll14 = new ArrayList<Animal>();
//		Collection<? super Animal> coll15 = new ArrayList<Dog>();
//		Collection<? super Animal> coll16 = new ArrayList<Cat>();
	}
}
