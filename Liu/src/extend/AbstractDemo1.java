package extend;
/*
 * è��������
 * 		�������è��
 * 		���ԣ����������䣬�Է�
 * �������Ӿ��嵽����
 * 	è��
 * 		��Ա����������������
 * 		���췽������
 * 		��Ա�������Է������㣩
 * 	����
 * 		��Ա����������������
 * 		���췽������
 * 		��Ա�������Է� ���Թ�ͷ��
 * 	�����ࣺAnimal
 * 		��Ա����������������
 * 		���췽������
 * 		��Ա�������Է�
 * 	ʵ�֣��ӳ��󵽾���
 * 		Animal
 * 		Cat
 * 		Dog
 */
abstract class Animal2{
	String name;
	int age;
	Animal2(){}
	Animal2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public abstract void eat();
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
class Cat2 extends Animal2{
	public void eat(){
		System.out.println("����");
	}	
}
class Dog2 extends Animal2{
	Dog2(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�Թ�ͷ");
	}	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Animal2 a = new Cat2();
		a.setName("tom");
		a.setAge(1);
		System.out.println("������"+a.getName()+",���䣺"+a.getAge());
		a.eat();
		
		Animal2 a2 = new Dog2("bob",2);
		System.out.println("������"+a2.getName()+",���䣺"+a2.getAge());
		a2.eat();
	}

}
