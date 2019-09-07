package collection.set;
/*
 *Person�����
 *	��Ա����˽�У��Ƿ�װ��ݣ������ⲿ���ʲ���Ҫ��Ϣ��
 *	�ṩ��Ӧ�����á���ȡ������������ã�
 *	hashCode() equals()����HashSet���ϱ�֤Ԫ��Ψһ�ԣ�
 *	ʵ��Comparable�ӿڣ���дcompareTo��������person����߱��Ƚ��ԣ�����TreeSet
 *	����
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
	@Override
	public int hashCode() {
		
		return name.hashCode()*age*31;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			throw new ClassCastException("���Ͳ�ƥ�䣡");
		Person p = (Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
	public int compareTo(Person p){
		int num = this.age-p.age;
		if(num==0){
			return this.name.compareTo(p.name);
		}
		return num;
	}
	@Override
	public String toString() {
		
		return name+":"+age;
	}
	
}
