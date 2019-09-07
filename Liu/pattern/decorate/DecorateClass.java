package decorate;
/*
 *
 */
public abstract class DecorateClass implements Phone{
	private Phone p;
	public DecorateClass(Phone p){
		this.p=p;
	}
	@Override
	public void call(){
		this.p.call();
	}
}
