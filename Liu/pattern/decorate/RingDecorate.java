package decorate;
/*
 *
 */
public class RingDecorate extends DecorateClass {
	public RingDecorate(Phone p){
		super(p);
	}
	public void call(){
		System.out.println("≤ ¡Â");
		super.call();	
	}
}
