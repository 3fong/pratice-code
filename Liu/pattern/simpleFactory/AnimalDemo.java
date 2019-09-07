package simpleFactory;
/*
 *�򵥹���ģʽ
	�ֽо�̬��������ģʽ��������һ������Ĺ����ฺ�𴴽�һЩ���ʵ����
	�ŵ㣺�ͻ��˲���Ҫ�������󣬴Ӷ���ȷ�˸������ְ��
	ȱ�㣺�����¶������󴴽���ʽ�ĸı䣬����Ҫ�޸Ĺ����࣬�����ں��ڵ�ά����
 */
public class AnimalDemo {

	public static void main(String[] args) {
//		Animal a = new Dog();
//		a.eat();
//		a=new Cat();
//		a.eat();
		
		Animal a = AnimalFactory.createAnimal("Dog");
		a.eat();
		a=AnimalFactory.createAnimal("Cat");
		a.eat();
		
		//java.lang.NullPointerException������ʱ������ж�
		a=AnimalFactory.createAnimal("pig");
		if(a!=null){
			a.eat();
		}else{
			System.out.println("�޴˶���");
		}
	}

}
