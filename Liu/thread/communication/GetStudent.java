package communication;
/*
 *
 */
public class GetStudent implements Runnable {
	private Student s;	
	public GetStudent(Student s) {
		super();
		this.s = s;
	}
	public void run(){
//		Student s = new Student();
		System.out.println(s.name+":"+s.age);
	}
}
