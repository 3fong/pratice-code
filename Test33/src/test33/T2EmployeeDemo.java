package test33;
/*
 *2、 假如我们在开发一个系统时需要对员工进行建模，员工包含 3 个属性：
 * 姓名、工号以及工资。经理也是员工，除了含有员工的属性外，另为还有一个奖金属性。请使用继承的思想设计出员工类和经理类。要求类中提供必要的方法进行属性访问。
	分析：
		面对对象思想需明确三部分：有哪些类；哪些成员；类之间的关系
		类：抽取员工类为父类：Employee;子类：work;manager
		成员变量：工号、姓名、工资  可以抽取抽象方法：work();
		类之间关系：子父类
 */
abstract class Employee{
	protected String id;
	protected String name;
	protected double pay;
	public Employee() {
		super();
		
	}
	public Employee(String id, String name, double pay) {
		super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	public abstract void work();
}
class Worker extends Employee{
//	private String id;
//	private String name;
//	private double pay;	
	public Worker(String id, String name, double pay) {
		super(id,name,pay);
	}
	@Override
	public void work() {
		System.out.println("普通员工"+id+":"+name+":"+pay);
	}	
}
class Manager extends Employee{
	private int bonus;
	public Manager(String id, String name, double pay,int bonus) {
		super(id,name,pay);
		this.bonus=bonus;
	}
	@Override
	public void work() {
		System.out.println("经理"+id+":"+name+":"+pay+":"+bonus);
	}
	
}
public class T2EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Worker("007","张三",3000.00);
		Manager m = new Manager("001","tom",8000.10,1000);
		e.work();
		m.work();
	}

}
