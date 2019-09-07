package newFeatures;
/*
 *
 */
public class DirectionDemo {

	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);
		System.out.println("--------------------");
		
		Direction1 d1 = Direction1.FRONT;
		System.out.println(d1);
		System.out.println(d1.getName());
		System.out.println("--------------------");
		
		Direction2 d2 = Direction2.BEHIND;
		System.out.println(d2);
		System.out.println(d2.getName());
		d2.show();
	}
}
