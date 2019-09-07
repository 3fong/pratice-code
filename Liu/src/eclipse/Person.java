/**
 * 
 */
package eclipse;

/**
 * @author David
 *
 */
public abstract class Person {
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
	public abstract void show();
}
