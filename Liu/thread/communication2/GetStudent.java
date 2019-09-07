package communication2;
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
			synchronized(s){
				System.out.println(s.name+":"+s.age);
			}
		}
	}
}
