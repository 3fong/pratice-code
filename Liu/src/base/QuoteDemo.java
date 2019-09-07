package base;
/*
 * 形式参数的问题：
 * 	基本类型：形式参数的改变不影响实际参数；
 *  引用类型：形式参数的改变直接影响实际参数；
 */
//形式参数是基本类型
class Demo{
	public int sum(int a,int b){
		return a+b;
	}
}

//形式参数是引用类型
class Student{
	public void show(){
		System.out.println("i love u");
	}
}
class StudentQuote{
	//如果你看到了一个方法的形式参数是一个类类型（引用类型），这里其实需要的该类的对象。
	//调用时，把Student s = new Student();的地址s传到这里。
	public void quote(Student s){
		s.show();
	}
}
public class QuoteDemo {

	public static void main(String[] args) {
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println(result);
		
		StudentQuote sq = new StudentQuote();
//		Student s = new Student();
		sq.quote(new Student());
	}

}
