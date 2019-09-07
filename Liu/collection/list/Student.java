package list;
/*
 *我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。	
	学生：Student
		成员变量：name,age
		构造方法：无参,带参
		成员方法：getXxx()/setXxx()
 */
class Student{
	private String name;
	private int age;
	public Student() {
		super();		
	}
	public Student(String name, int age) {
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
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj){
		Student s = (Student)obj;
		return this.name.equals(s.name)&&this.age==s.age;
	}
}
