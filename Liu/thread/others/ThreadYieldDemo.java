package others;
/*
 *
 */
public class ThreadYieldDemo {

	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("���۰�ͯľ");
		ty1.setName("��ŷ");
		ty1.start();
		ty2.start();
	}

}
