package faceObject;
/*
1 ��̬�ı��֣����������ָ�����Լ���������󣻸��������Ҳ�ɽ����Լ����������
2 ��̬��ǰ�᣺������֮������й�ϵ��Ҫô�̳С�Ҫôʵ�֣�ͨ������һ��ǰ�᣺���ڸ��ǡ�
3 �ŵ㣺��չ�ԣ�ά���ԣ� ȱ�㣺�����޷��������෽��
 */
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
	public void play(){
		System.out.println("ץ����");
	}
}
public class DuoTaiDemo {

	public static void main(String[] args) {
		//��̬������ת��
		Animal a = new Cat();
		a.eat();
		//����ת�ͣ�ʹ���Լ����з���
		Cat c = (Cat)a;
		c.play();
	}

}
