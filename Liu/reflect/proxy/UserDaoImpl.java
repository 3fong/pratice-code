package proxy;
/*
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		System.out.println("加法");
	}

	@Override
	public void del() {
		System.out.println("减法");
	}

	@Override
	public void multi() {
		System.out.println("乘法");
	}

	@Override
	public void div() {
		System.out.println("除法");
	}

}
