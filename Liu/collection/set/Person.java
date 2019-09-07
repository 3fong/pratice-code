package set;
/*
 *TreeSet集合特点：排序 唯一
 *1 自然排序  
 *	定义方式：实现Comparable 复写compareTo()方法
 *2 比较器排序
 *	定义方式：实现Comparator 复写compare()方法
 *两种比较方式区别：
 *	自然排序是让元素具备比较性，默认情况按字典顺序排；
 *	比较器排序让集合具备比较性。
 */
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person() {
		super();
		
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {		
		int num = this.name.compareTo(o.name);
		if(num==0){
			//两种比较年龄的方式
//			return this.age-o.age;
			
			//将int转为Integer对象再比较。
			return new Integer(this.age).compareTo(new Integer(o.age));
		}
		return num;
	}
	
}
