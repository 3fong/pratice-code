package test33;
/*
 *2�� ���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������ 3 �����ԣ�
 * �����������Լ����ʡ�����Ҳ��Ա�������˺���Ա���������⣬��Ϊ����һ���������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
	������
		��Զ���˼������ȷ�����֣�����Щ�ࣻ��Щ��Ա����֮��Ĺ�ϵ
		�ࣺ��ȡԱ����Ϊ���ࣺEmployee;���ࣺwork;manager
		��Ա���������š�����������  ���Գ�ȡ���󷽷���work();
		��֮���ϵ���Ӹ���
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
		System.out.println("��ͨԱ��"+id+":"+name+":"+pay);
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
		System.out.println("����"+id+":"+name+":"+pay+":"+bonus);
	}
	
}
public class T2EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Worker("007","����",3000.00);
		Manager m = new Manager("001","tom",8000.10,1000);
		e.work();
		m.work();
	}

}
