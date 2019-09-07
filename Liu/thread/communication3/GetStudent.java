package communication3;
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
				if(!s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println(s.name+":"+s.age);
				s.flag=false;
				s.notify();				
			}
		}
	}
}
