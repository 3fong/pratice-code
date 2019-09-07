package thread;
/*
 *单例设计模式：
 *	限制创建自身对象，所以私有自己的构造方法，并提供获取对象的方法
 *	根据创建对象的时机分为：饿汉式和懒汉式
 */
//饿汉式
class Single1{
	private Single1(){}
	private static Single1 s = new Single1();
	public static Single1 getInstance(){
		return s;
	}
}
//懒汉式
class Single2{
	private Single2(){}
	private static Single2 s = null;
	public static Single2 newInstance(){
		//双重判断可以减少判断次数，提高效率
		if(s==null){
			synchronized(s){
				if(s==null)
					s=new Single2();
			}
		}
		return s;
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		Single1 s = Single1.getInstance();
	}

}
