package io.charStream;
/*
 *
 */
public class Student implements Comparable<Student>{
	private String name;
	private int yu;
	private int math;
	private int eng;
	private int sum;
	public Student(String name, int yu, int math, int eng) {
		super();
		this.name = name;
		this.yu = yu;
		this.math = math;
		this.eng = eng;
		sum=yu+math+eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYu() {
		return yu;
	}
	public void setYu(int yu) {
		this.yu = yu;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int compareTo(Student s){
		int num = s.sum -this.sum;
		if(sum==0)
			return this.name.compareTo(s.name);
		return num;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", yu=" + yu + ", math=" + math + ", eng=" + eng +"]";
	}
	
}
