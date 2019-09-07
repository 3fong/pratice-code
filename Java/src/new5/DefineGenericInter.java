package new5;
/*
 *泛型定义在接口上。
 *	实现时类型已明确
 *	实现时类型不明确确:在调用方法时具备更强的灵活性
 */
interface Inter<T>{
	void show(T t);
}
class Ming implements Inter<String>{
	public void show(String s){
		System.out.println("show:"+s);
	}
}
class BuMing<T> implements Inter<T>{
	public void show(T t){
		System.out.println("show:"+t);
	}
}
public class DefineGenericInter {

	public static void main(String[] args) {
		Inter<String> i = new Ming();
		i.show("2");
		
		Inter<Integer> i1 = new BuMing<Integer>();
		i1.show(12);
	}
}
