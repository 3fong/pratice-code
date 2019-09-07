package dao;

import base.User;

/**
 * 用户操作接口
 * 		功能 登录 注册
 *@author David
 *@version V1.1
 */
public interface UserDao {
	/**
	 * 用户注册方法
	 * @param user
	 * 		要注册的用户信息
	 */
	public abstract void regist(User user);
	/**
	 * 用户登录方法
	 * @param name 用户名
	 * @param password 用户登录密码
	 * @return 返回是否登录成功
	 */
	public abstract boolean enter(String name,String password);
}
