package extend;

class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}
class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	public void speek(){
		System.out.println("english");
	}
}
public class DuoTaiDemo {

	public static void main(String[] args) {
		Fu f = new Zi();
		f.show();
		
		Zi z = (Zi)f;
		z.speek();
	}

}
