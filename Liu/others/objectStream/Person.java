package objectStream;

import java.io.Serializable;

/*
 *NotSerializableException:δ���л��쳣
 *�������Ķ�����Ҫʵ��Serializable�ӿڲ���ʹ�����л����ܡ�
	Serializable�ӿ��Ǳ�ǽӿڣ������ڸ������л��������ID�ţ����ж�
	
	��Ͷ����Ƿ���ͬһ���汾��
	��̬���ܱ����л�����Ϊ��̬�ڷ������У����ڶ��С�
	serialVersionUID�����ඨ��̶���ʶ���������л���������Բ�������
	
	�����л��Ķ���
	transient�����÷Ǿ�̬��Ա�޷����л��Ĺؼ��֡���֤����ֵ�ڶ��ڴ���
	
	���ڣ�������ʾ���ı��ļ��С�
 */
public class Person implements Serializable {
	/**
	 * ��������ϱ�ǩ
	 */
	private static final long serialVersionUID = 1120242798634133694L;
	private String name;
	
	//transient�����÷Ǿ�̬��Ա�޷����л��Ĺؼ���
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
