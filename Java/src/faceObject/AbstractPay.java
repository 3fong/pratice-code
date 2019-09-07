package faceObject;
/*
 *建立公司人事系统。员工包含3个属性：姓名、工号、工资；经理还具有奖金属性。
     请使用继承的思想设计出员工类和经理类，要求类中提供必要的方法进行属性访问
  分析：
  	继承思想，抽取员工和经理共性内容定义成抽象类：Employee
  		成员变量：姓名、工号、工资
  		成员方法：获取工资、姓名
  	员工类和经理类继承Employee
 */
abstract class Employee{
	protected String name;
	protected String num;
	protected double pay;
	public Employee() {
		super();		
	}
	public Employee(String name, String num, double pay) {
		super();
		this.name = name;
		this.num = num;
		this.pay = pay;
	}
	public abstract void work();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class BaseEmployee extends Employee{
	public BaseEmployee(String name,String num,double pay) {
		super(name,num,pay);
	}
	public void work(){
		System.out.println("员工工作");
	}
	public String toString() {
		return num+":"+name+":"+pay;
	}
}
class Maneger extends Employee{
	private double bonus;
	Maneger(String name,String num,double pay,double bonus){
		super(name,num,pay);
		this.bonus=bonus;
	}
	public void work(){
		System.out.println("经理工作");
	}
	@Override
	public String toString() {
		return num+":"+name+":"+pay+":"+bonus;
	}
	
}
public class AbstractPay {
	public static void main(String[] args) {
		Employee e  = new Maneger("zhangsan","001",3000,1000);
		e.work();
		System.out.println(e);
		Employee e1 = new BaseEmployee("wangwu","002",2000);
		e1.work();
		System.out.println(e1);
	}
}
