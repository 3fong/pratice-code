package gui.adapter;

public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("��ӹ���");
	}

	@Override
	public void delete() {
		System.out.println("ɾ����");
	}

	@Override
	public void update() {
		System.out.println("�޸Ĺ���");
	}

	@Override
	public void find() {
		System.out.println("���ҹ���");
	}

}
