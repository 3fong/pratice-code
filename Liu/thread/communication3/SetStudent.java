package communication3;
/*

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
			synchronized(s){
				if(s.flag){
					try {
						s.wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				if(x%2==0){
					s.name="����ϼ";
					s.age=27;
				}else{
					s.name="����";
					s.age=25;
				}
				x++;
				s.flag=true;
				s.notify();								
			}
		}
	}
}
