package others;
/*
 *
 */
public class Dameon extends Thread{
	
	public Dameon() {
		super();
		
	}

	public Dameon(String name) {
		super(name);
		
	}

	public void run(){
		for(int x=0;x<50;x++){			
			System.out.println(getName()+": "+x);
		}
	}
}
