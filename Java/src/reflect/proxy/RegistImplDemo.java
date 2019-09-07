package reflect.proxy;
/*
 *ʵ�ֽӿڣ���д������
 */
public class RegistImplDemo implements Regist {
	@Override
	public void regist() {
		System.out.println("ע��");
	}
	@Override
	public void entry() {
		System.out.println("��¼");
	}
}
