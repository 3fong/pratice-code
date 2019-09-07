package set;
/*
 *TreeSet�����ص㣺���� Ψһ
 *1 ��Ȼ����  
 *	���巽ʽ��ʵ��Comparable ��дcompareTo()����
 *2 �Ƚ�������
 *	���巽ʽ��ʵ��Comparator ��дcompare()����
 *���ֱȽϷ�ʽ����
 *	��Ȼ��������Ԫ�ؾ߱��Ƚ��ԣ�Ĭ��������ֵ�˳���ţ�
 *	�Ƚ��������ü��Ͼ߱��Ƚ��ԡ�
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
			//���ֱȽ�����ķ�ʽ
//			return this.age-o.age;
			
			//��intתΪInteger�����ٱȽϡ�
			return new Integer(this.age).compareTo(new Integer(o.age));
		}
		return num;
	}
	
}
