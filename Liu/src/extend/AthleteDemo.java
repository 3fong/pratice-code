package extend;
/*
 * 乒乓球运动员、篮球运动员、乒乓球教练、篮球教练，与乒乓球相关的人员要学习英语
 * 分析：
 * 四个对象和一个额外功能，同时可以抽取人、乒乓球、教练三个抽象类。一个接口
 * 接口：
 * 		学习英语
 * 抽象类：
 * 		成员变量：姓名、年龄、职业
 * 		构造方法：有参、无参
 * 		成员方法：工作();
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
		System.out.println("乒乓球运动员");
	}
	public void study(){
		System.out.println("乒乓球");
	}
	public void speakEnglish(){
		System.out.println("说英语");
	}
}
class BasketAthlete extends Athlete{
	BasketAthlete(){}
	BasketAthlete(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("篮球运动员");
	}
	public void study(){
		System.out.println("篮球球");
	}
}
class PingCoach extends Coach implements Study{
	PingCoach(){}
	PingCoach(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("乒乓球教练");
	}
	public void teach(){
		System.out.println("乒乓球");
	}	
	public void speakEnglish(){
		System.out.println("说英语");
	}
}
class BasketCoach extends Coach{
	BasketCoach(){}
	BasketCoach(String name,int age){
		super(name,age);
	}
	public void job(){
		System.out.println("篮球教练");
	}
	public void teach(){
		System.out.println("篮球");
	}	
}
public class AthleteDemo {

	public static void main(String[] args) {
		PingAthlete pa = new PingAthlete();
		pa.setName("孔令辉");
		pa.setAge(40);
		System.out.println("姓名："+pa.getName()+",年龄："+pa.getAge());
		pa.job();
		pa.study();
		pa.speakEnglish();
		
		BasketCoach bc = new BasketCoach("黑玫瑰",50);
		System.out.println("姓名："+bc.getName()+",年龄："+bc.getAge());
		bc.teach();
		bc.job();
	}

}
