package decorate;
/*
 *
 */
public class PhoneDemo {

	public static void main(String[] args) {
		Phone p = new IPhone();
//		p.call();
//		
//		DecorateClass dc = new RingDecorate(p);
//		dc.call();
//		
//		DecorateClass dc1 = new MusicDecorate(p);
//		dc1.call();
		
		DecorateClass dc2 = new RingDecorate(new MusicDecorate(p));
		dc2.call();
	}

}
