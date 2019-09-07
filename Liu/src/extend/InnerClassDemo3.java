package extend;
//匿名内部类
interface Person5{
	void study();
}
class PersonDemo2 {
	public void method(Person5 p){
		p.study();
	}
}
class Student5 implements Person5{
	public void study(){
		System.out.println("学习");
	}
}
public class InnerClassDemo3 {

	public static void main(String[] args) {
		//调用方法一：
		PersonDemo2 pd = new PersonDemo2();
		Person5 p = new Student5();
		pd.method(p);
		
		//方法二：
		PersonDemo2 pd2 = new PersonDemo2();
		pd.method(new Person5(){
			public void study(){
				System.out.println("匿名学习");
			}
		});
	}

}
