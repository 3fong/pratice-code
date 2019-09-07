package objectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣
 *		���� -- ������(ObjectOutputStream)
 *�����л���:���ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ���
 *		������ -- ����(ObjectInputStream)
 */
public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		write();
		read();
	}
	//���л���
	public static void write() throws IOException, IOException{
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("F:\\oos.txt"));
		
		Person p = new Person("����ϼ",27);
		oos.writeObject(p);

		oos.close();
	}
	//�����л�
	public static void read() throws IOException, IOException, ClassNotFoundException{
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("F:\\oos.txt")); 
		
		Object o = ois.readObject();
		//��Objectǿת��Person
//		Person p = (Person)ois.readObject();
		
		ois.close();
		//���븴дtoString����������ֻ�������ϣֵ
		System.out.println(o);
	}
}
