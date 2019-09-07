package faceObject;
/*
 *Object类-equals() equals具备比较所有类型数据的功能，
因为Object 这其实就是多态的应用 //Object obj = new 数据类型 
 */
class Duo{
	private String name;
	public Duo() {
		super();		
	}
	public Duo(String name) {
		super();
		this.name = name;
	}
	public boolean equals(Object obj){//Object obj = new Duo();
		if(!(obj instanceof Duo)){
			throw new ClassCastException("类型不匹配！");
		}
		Duo d = (Duo)obj;
		return this.name.equals(d.name);
	}
	@Override
	public String toString() {
		return "Duo [name=" + name + "]";
	}	
}
public class DuoTaiObject {

	public static void main(String[] args) {
		Duo d = new Duo("zhangsan");
		Duo d1 = new Duo("zhangsan");
		Duo d2 = d;
		//假如不复写equals方法，比较的是两个对象，值不相等。
		boolean flag = d.equals(d1);
		System.out.println(flag);
	}

}
