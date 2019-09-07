package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//对象序列化。就是将流进行实体化存储。

class Person implements Serializable{
	static final long serialVersionUID = 42L;
	private String name;
	transient int age;
	String country;
	Person(String name,int age,String country){
		this.name=name;
		this.age=age;
		this.country=country;
	}
	public String toString(){
		return name+":"+age+":"+country;
	}
}
public class ObjectStreamDemo {

	public static void main(String[] args)throws Exception {
//		writeObj();
		readObj();
	}
	public static void readObj()throws Exception{
		ObjectInputStream oi =
				new ObjectInputStream(new FileInputStream("Person.object"));

		Person p = (Person)oi.readObject();
		System.out.println(p);
		oi.close();
	}
	public static void writeObj()throws IOException{
		ObjectOutputStream oo = 
				new ObjectOutputStream(new FileOutputStream("Person.object"));
		
		oo.writeObject(new Person("lisi",30,"kr"));
		oo.close();
	}
}
