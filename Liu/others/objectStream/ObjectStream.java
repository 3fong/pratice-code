package objectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。
 *		对象 -- 流数据(ObjectOutputStream)
 *反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。
 *		流数据 -- 对象(ObjectInputStream)
 */
public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		write();
		read();
	}
	//序列化流
	public static void write() throws IOException, IOException{
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("F:\\oos.txt"));
		
		Person p = new Person("林青霞",27);
		oos.writeObject(p);

		oos.close();
	}
	//反序列化
	public static void read() throws IOException, IOException, ClassNotFoundException{
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("F:\\oos.txt")); 
		
		Object o = ois.readObject();
		//将Object强转成Person
//		Person p = (Person)ois.readObject();
		
		ois.close();
		//必须复写toString方法，否则只能输出哈希值
		System.out.println(o);
	}
}
