package new5;
/*
 *泛型（generic）：创建对象或者调用方法的时候才去明确的数据的类型。参数化类型。
	格式：通过<>来定义要操作的引用数据类型。<>就是用来接收类型的。
 定义在接口上
3.3 定义在类中。当类中要操作的引用数据类型不确定的时候（注意：基本数据不确定无法自定义）。
	泛型类存在局限性。
3.3.2 泛型定义在方法上：可操作不同数据类型。它可以避免泛型类的局限性。
3.3.3 静态方法不可以访问类上定义的泛型。因为它优先于对象加载。
如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上。
 */
class Demo<T>{
	//泛型类存在局限性。对象定义好类型后，方法的类型也被固定
	public void show(T t){
		System.out.println("show:"+t);
	}
	//泛型定义在方法上：可操作不同数据类型。它可以避免泛型类的局限性。
	public <W> void method(W w){
		System.out.println("method:"+w);
	}
	//静态方法不可以访问类上定义的泛型。因为它优先于对象加载。只能定义在方法上
	public static <Q> void jing(Q q){
		System.out.println("jing:"+q);
	}
}
public class DefineGeneric {

	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>();
		d.show(12);
//		d.show("");//无法使用传入其他类型数据
		
		d.method(12);
		d.method("");
		d.method(true);
		
		d.jing(12);
		Demo.jing("faf");
	}

}
