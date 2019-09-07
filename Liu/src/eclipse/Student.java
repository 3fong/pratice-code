/**
 * 自動生成構造方法和getset方法
 */
package eclipse;

/**
 * @author David
 *
 */

public class Student extends Person implements Extra,Cloneable{
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
		super(name,age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show(){
		System.out.println("hi");
	}
	public void show1(){
		System.out.println("girl");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
