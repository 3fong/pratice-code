package extend;

/*
 * è���̳а���
 * è�ص������
 * 	��Ա���������������䣬��ɫ
 * 	���캯�����޲� ����
 * 	��Ա�������� ҧβ��
 * ���ص������
 * 	��Ա���������������䣬��ɫ
 * 	���캯�����޲� ����
 * 	��Ա�������� ����
 * �����ص������
 * 	��Ա���������������䣬��ɫ
 * 	���캯�����޲� ����
 * 	��Ա��������
 */
class Animal{
	private String name;
	private String color;
	Animal(){}
	Animal(String name,String color){
		this.name=name;
		this.color=color;
	}
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
	public void eat(){
		System.out.println("�Է�");
	}
}
class Cat extends Animal{
	Cat(){}
	Cat(String name,String color){
		super(name,color);
	}
	public void biteTail(){
		System.out.println("ҧβ��");
	}
}
class Dog extends Animal{
	Dog(){}
	Dog(String name,String color){
		super(name,color);
	}
	public void watchDoor(){
		System.out.println("����");
	}
}
public class ExtendsDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("bob");
		d.setColor("black");
		System.out.println("���֣�"+d.getName()+",��ɫ��"+d.getColor());
		
		Dog d2 = new Dog("hanks","white");
		System.out.println("���֣�"+d2.getName()+",��ɫ��"+d2.getColor());
		d.eat();
		d.watchDoor();
	}
}
