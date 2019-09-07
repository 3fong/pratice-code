package communication4;
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
		while(true){
			s.get();
		}
	}
}
