package dao;

import base.User2;

/*
 *��¼ϵͳ���ܽӿ�
 *	ע�� ��¼
 */
public interface UserDao2 {
	public abstract void regist(User2 user);
	public abstract boolean entry(String name,String password);
}
