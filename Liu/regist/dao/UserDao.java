package dao;

import base.User;

/**
 * �û������ӿ�
 * 		���� ��¼ ע��
 *@author David
 *@version V1.1
 */
public interface UserDao {
	/**
	 * �û�ע�᷽��
	 * @param user
	 * 		Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
	/**
	 * �û���¼����
	 * @param name �û���
	 * @param password �û���¼����
	 * @return �����Ƿ��¼�ɹ�
	 */
	public abstract boolean enter(String name,String password);
}
