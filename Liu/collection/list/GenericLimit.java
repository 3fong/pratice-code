package list;

import java.util.ArrayList;
import java.util.Collection;

/*
 *泛型高级(通配符)
 * ?:任意类型，如果没有明确，那么就是Object以及任意的Java类了
 * ? extends E:向下限定，E及其子类
 * ? super E:向上限定，E极其父类
 */
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class GenericLimit {

	public static void main(String[] args) {
		
		//泛型一旦确定，左右两边必须相同
		Collection<Object> coll = new ArrayList<Object>();
//		Collection<Object> coll1 = new ArrayList<Animal>();
//		Collection<Object> coll2 = new ArrayList<Dog>();
//		Collection<Object> coll3 = new ArrayList<Cat>();
		
		// ?表示任意的类型都是可以的
		Collection<?> coll4 = new ArrayList<Object>();
		Collection<?> coll5 = new ArrayList<Animal>();
		Collection<?> coll6 = new ArrayList<Dog>();
		Collection<?> coll7 = new ArrayList<Cat>();
		
		//? extends E:向下限定，E及其子类
//		Collection<? extends Animal> coll8 = new ArrayList<Object>();
		Collection<? extends Animal> coll9 = new ArrayList<Animal>();
		Collection<? extends Animal> coll11 = new ArrayList<Dog>();
		Collection<? extends Animal> coll12 = new ArrayList<Cat>();
		
		//? super E:向上限定，E极其父类
		Collection<? super Animal> coll13 = new ArrayList<Object>();
		Collection<? super Animal> coll14 = new ArrayList<Animal>();
//		Collection<? super Animal> coll15 = new ArrayList<Dog>();
//		Collection<? super Animal> coll16 = new ArrayList<Cat>();
	}
}
