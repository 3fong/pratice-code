package communication4;
/*
 *
 */
public class SetStudent implements Runnable {
	private Student s;
	private int x=0;
	public SetStudent(Student s) {
		super();
		this.s = s;
	}
	public void run(){
		while(true){
			if(x%2==0)
				s.set("����ϼ",27);
			else
				s.set("����",30);
			x++;
		}
	}
}
