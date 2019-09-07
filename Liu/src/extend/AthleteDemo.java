package extend;
/*
 * ƹ�����˶�Ա�������˶�Ա��ƹ��������������������ƹ������ص���ԱҪѧϰӢ��
 * ������
 * �ĸ������һ�����⹦�ܣ�ͬʱ���Գ�ȡ�ˡ�ƹ���򡢽������������ࡣһ���ӿ�
 * �ӿڣ�
 * 		ѧϰӢ��
 * �����ࣺ
 * 		��Ա���������������䡢ְҵ
 * 		���췽�����вΡ��޲�
 * 		��Ա����������();
 */
interface Study{
	public abstract void speakEnglish();
}
abstract class Person{
	private String name;
	private int age;
	Person(){}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public abstract void job();
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
abstract class Athlete extends Person{
	Athlete(){}
	Athlete(String name,int age){
		super(name,age);
	}
	public abstract void study();
}
abstract class Coach extends Person{
	Coach(){}
	Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
}
class PingAthlete extends Athlete implements Study{
	PingAthlete(){}
	PingAthlete(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("ƹ�����˶�Ա");
	}
	public void study(){
		System.out.println("ƹ����");
	}
	public void speakEnglish(){
		System.out.println("˵Ӣ��");
	}
}
class BasketAthlete extends Athlete{
	BasketAthlete(){}
	BasketAthlete(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("�����˶�Ա");
	}
	public void study(){
		System.out.println("������");
	}
}
class PingCoach extends Coach implements Study{
	PingCoach(){}
	PingCoach(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("ƹ�������");
	}
	public void teach(){
		System.out.println("ƹ����");
	}	
	public void speakEnglish(){
		System.out.println("˵Ӣ��");
	}
}
class BasketCoach extends Coach{
	BasketCoach(){}
	BasketCoach(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("�������");
	}
	public void teach(){
		System.out.println("����");
	}	
}
public class AthleteDemo {

	public static void main(String[] args) {
		PingAthlete pa = new PingAthlete();
		pa.setName("�����");
		pa.setAge(40);
		System.out.println("������"+pa.getName()+",���䣺"+pa.getAge());
		pa.job();
		pa.study();
		pa.speakEnglish();
		
		BasketCoach bc = new BasketCoach("��õ��",50);
		System.out.println("������"+bc.getName()+",���䣺"+bc.getAge());
		bc.teach();
		bc.job();
	}

}
