package simpleFactory;
/*
 *�򵥹���ģʽ��
 *	���������������װ��һ���࣬�������Է���ֻ������ã����ô���
 */
public class AnimalFactory {
	//���뾲̬������ֱ�����������ã�����Animal���ö�̬��չ���ܣ��򻯴���
	public static Animal createAnimal(String type){
		if("Dog".equals(type)){
			return new Dog();
		}else if("Cat".equals(type)){
			return new Cat();
		}else{
			return null;
		}
	}
}
