package set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 *TreeSet集合特点：排序 唯一
 *1 自然排序  
 *	定义方式：实现Comaparable 复写compareTo()方法
 *2 比较器排序
 *	定义方式：实现Comparator 复写compare()方法
 *两种比较方式区别：
 *	自然排序是让元素具备比较性，默认情况按字典顺序排；
 *	比较器排序让集合具备比较性。
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		show2();
	}
	public static void show(){
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘德华",51));
		ts.add(new Person("张国荣",30));
		ts.add(new Person("周星驰",54));
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘德华",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
	public static void show1(){
		//比较器排序，用通过TreeSet的构造方法接收
		TreeSet<Person> ts = new TreeSet<Person>(new MyComparator());
		
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘钱",56));
		ts.add(new Person("刘例",51));
		ts.add(new Person("张国荣荣",30));
		ts.add(new Person("周",54));
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘德花花华",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
	//当一次性使用比较器排序时，可通过匿名内部类的方法，简便还节省内存
	public static void show2(){
		//比较器排序，用通过TreeSet的构造方法接收
		TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>(){
			public int compare(Person p1 ,Person p2){
				int num = p1.getName().compareTo(p2.getName());
				if(num==0){
					int num1 = p1.getName().length()-p2.getName().length();
					if(num1==0){
						return p1.getAge()-p2.getAge();
					}
				}
				return num;
			}
		});
		
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘钱",56));
		ts.add(new Person("刘例",51));
		ts.add(new Person("张国荣荣",30));
		ts.add(new Person("周",54));
		ts.add(new Person("张学友",50));
		ts.add(new Person("刘德花花华",51));
		
		for(Person p : ts){
			System.out.println(p.getName()+p.getAge());
		}
	}
}
