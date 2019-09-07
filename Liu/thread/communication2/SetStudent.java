package communication2;
/*

 */
public class SetStudent implements Runnable {
	private Student s;
	private int x=0;
//	private Object o = new Object();
	public SetStudent(Student s) {
		super();
		this.s = s;
	}
	public void run(){
		while(true){
			synchronized(s){
				if(x%2==0){
					s.name="주행究";
					s.age=27;
				}else{
					s.name="증자";
					s.age=25;
				}
				x++;
			}
		}
	}
}
