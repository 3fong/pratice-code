package gui.adapter;

/*
 * ���⣺
 * 		�ӿ�(�����Ƚ϶�) -- ʵ����(����ʹ��һ����Ҳ�ð������ʵ�ָ��ṩ�ˣ������ǿ�ʵ��)
 * 		̫�鷳�ˡ�
 * ���������
 * 		�ӿ�(�����Ƚ϶�) -- ��������(ʵ�ֽӿ�,������ʵ��) -- ʵ����(���ĸ���д�ĸ�)
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		// ��û��˵������Ҫ���ֹ��ܶ�ʵ�ְ���
		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
	}
}
