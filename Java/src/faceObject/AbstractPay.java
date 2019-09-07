package faceObject;
/*
 *������˾����ϵͳ��Ա������3�����ԣ����������š����ʣ��������н������ԡ�
     ��ʹ�ü̳е�˼����Ƴ�Ա����;����࣬Ҫ�������ṩ��Ҫ�ķ����������Է���
  ������
  	�̳�˼�룬��ȡԱ���;��������ݶ���ɳ����ࣺEmployee
  		��Ա���������������š�����
  		��Ա��������ȡ���ʡ�����
  	Ա����;�����̳�Employee
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
		System.out.println("Ա������");
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
		System.out.println("������");
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
