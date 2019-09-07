package com.liu.mytest;
/*
 *����5��ѧ��������5��ѧ�����Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��	
	ѧ��Student
		��Ա������name,age
		���췽�����޲�,���
		��Ա������getXxx()/setXxx()
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
