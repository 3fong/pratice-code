package communication;
/*
 *
 */
public class SetStudent implements Runnable {
	private Student s;	
	
	public SetStudent(Student s) {
		super();
		this.s = s;
	}

	public void run(){
//		Student s = new Student();
		s.name="����ϼ";
		s.age=27;
	}
}
