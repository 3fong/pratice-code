package dao;

import java.util.ArrayList;
import base.User;

/**
 * 复写登录注册方法
 * @author David
 *@version V1.1
 */
public class UserDaoImpl implements UserDao {
	//将集合定义为成员变量，方便类中方法共享，加入静态，方便成员共享。
	private static ArrayList<User> al = new ArrayList<User>();
	//复写注册方法
	public void regist(User user){			
		//将user装进集合
		if(user!=null)
			al.add(user);
	}
	public boolean enter(String name,String password){
		//遍历集合，获取每一个用户，以判断用户是否注册
		boolean flag = false;
		for(User u : al){
			if(u.getName().equals(name)&&u.getPassword().equals(password)){
				flag=true;
				break;
			}
		}		
		return flag;
	}
}
