package dao;

import base.User2;

/*
 *登录系统功能接口
 *	注册 登录
 */
public interface UserDao2 {
	public abstract void regist(User2 user);
	public abstract boolean entry(String name,String password);
}
