package faceObject;
/*
 *
 */
class Fu{
	int num;
	Fu(){
		System.out.println("Fu...");
	}
	Fu(String str){
		System.out.println("Fu..."+str);
	}
}
class Zi extends Fu{
	Zi(){
		System.out.println("Zi...run");
	}
	Zi(String str){
		System.out.println("Zi..."+str);
	}
}
public class ExtendsConstructor {

	public static void main(String[] args) {
		Zi z = new Zi();
		Zi z1 = new Zi("abc");
		System.out.println(z1.num);
	}

}
