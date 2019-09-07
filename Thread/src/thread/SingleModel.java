package thread;

public class SingleModel {

	public static void main(String[] args) {
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		s1.setAge(30);
		System.out.println(s2.getAge());
	}

}
class Student{
	private int age;
	private Student(){}
	private static Student s = new Student();
	public static Student getStudent(){
		return s;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class Single{
	private Single(){}
	private static Single s =null;
	public static Single getInstance(){
		if(s==null){
			synchronized(Single.class){
				if(s==null)
					s= new Single();
			}
		}
		return s;
	}
}
