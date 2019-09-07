package others;
/*
 *
 */
public class ThreadYieldDemo {

	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("Ìú±Û°¢Í¯Ä¾");
		ty1.setName("²¼Å·");
		ty1.start();
		ty2.start();
	}

}
