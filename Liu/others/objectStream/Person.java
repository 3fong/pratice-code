package objectStream;

import java.io.Serializable;

/*
 *NotSerializableException:未序列化异常
 *被操作的对象需要实现Serializable接口才能使用序列化功能。
	Serializable接口是标记接口，它用于给被序列化的类加入ID号，以判断
	
	类和对象是否是同一个版本。
	静态不能被序列化，因为静态在方法区中，不在堆中。
	serialVersionUID：给类定义固定标识，方便序列化。新类可以操作曾经
	
	被序列化的对象。
	transient：是让非静态成员无法序列化的关键字。保证它的值在堆内存中
	
	存在，而不显示在文本文件中。
 */
public class Person implements Serializable {
	/**
	 * 给对象打上标签
	 */
	private static final long serialVersionUID = 1120242798634133694L;
	private String name;
	
	//transient：是让非静态成员无法序列化的关键字
	private transient int age;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
