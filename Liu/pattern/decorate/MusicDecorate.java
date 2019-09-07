package decorate;
/*
 *
 */
public class MusicDecorate extends DecorateClass {
	public MusicDecorate(Phone p){
		super(p);
	}
	public void call(){
		super.call();
		System.out.println("“Ù¿÷");
	}
}
