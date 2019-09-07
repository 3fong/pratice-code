package factory;
/*
 *B ��������ģʽ
	���󹤳��ฺ���崴������Ľӿڣ��������Ĵ��������м̳г�
		�󹤳��ľ�����ʵ�֡�
	�ŵ㣺��ȷ����ľ���ְ���¶��������ֻ�����Ӿ�����;���Ĺ����࣬
		�����޸����д��룬����ά������ǿ��ϵͳ����չ�ԡ�
	ȱ�㣺��д�Ĵ������࣬�����˹�������
 */
public class AnimalDemo {

	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal a = f.createAnimal();
		a.eat();
		
		f = new CatFactory();
		a=f.createAnimal();
		a.eat();
	}

}
