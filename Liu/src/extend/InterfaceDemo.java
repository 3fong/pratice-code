package extend;
/*
 * ����ӿڣ���չ����è�������߹���
 * ���������嵽����
 * è��
 * 		��Ա��������������ɫ
 * 		���췽�����вΣ��޲�
 * 		��Ա�������Է����㣩
 * ����
 * 		��Ա��������������ɫ
 * 		���췽�����вΣ��޲�
 * 		��Ա�������Է����⣩
 * �����ࣺAnimal
 * 		��Ա��������������ɫ
 * 		���췽�����вΣ��޲�
 * 		��Ա�������Է�(����)
 * ����è��
 * 		���ߡ��̳���è
 *interface�ӿڣ�
 * 		���ߣ���չ����
 * ʵ�֣�
 * 		�ӿ�
 * 		������Animal
 * 		è�̳�Animal
 * 		���̳�Animal
 * 		����è�̳�èʵ�ֽӿ�
 */
interface Jump{
	public abstract void jump();
}
abstract class Animal3{
	private String name;
	private String color;
	Animal3(){}
	Animal3(String name,String color){
		this.name=name;
		this.color=color;
	}
	public abstract void eat();
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String name,String color){
		super(name,color);
	}
	public void eat(){
		System.out.println("����");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String name,String color){
		super(name,color);
	}
	public void eat(){
		System.out.println("����");
	}
}
class SuperCat extends Cat3 implements Jump{
	public void jump(){
		System.out.println("����è����");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Animal3 a = new Cat3("tom","blue");
		System.out.println("name:"+a.getName()+",color:"+a.getColor());
		a.eat();
		SuperCat sc = new SuperCat();
		sc.setName("tianmao");
		sc.setColor("black");
		System.out.println("name:"+sc.getName()+",color:"+sc.getColor());
		sc.jump();
	}

}
