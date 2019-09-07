package io.others;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 *���л������Ѷ�������һ��ķ�ʽ�����ı��ļ������������д��䡣
	���� -- �����(ObjectOutputStream)
	�����л���:���ı��ļ��е���������ݻ��������е���������ݻ�ԭ�ɶ���
	����� -- ����(ObjectInputStream)
	�������Ķ�����Ҫʵ��Serializable�ӿڲ���ʹ�����л����ܡ�
	Serializable�ӿ��Ǳ�ǽӿڣ������ڸ����л��������ID�ţ����ж���Ͷ����Ƿ���ͬһ���汾��
	��̬���ܱ����л�����Ϊ��̬�ڷ������У����ڶ��С�
	serialVersionUID�����ඨ��̶���ʶ���������л���������Բ��������л��Ķ���
	transient�����÷Ǿ�̬��Ա�޷����л��Ĺؼ��֡���֤���ֵ�ڶ��ڴ��д��ڣ�����ʾ���ı��ļ��С�
	NotSerializableExceptionδ���л�
 */
class Person implements Serializable{
	private static final long serialVersionUID = 8043691071593205844L;
	transient String name;//null
	private int age;
	static String country;//null
	public Person(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}	
}
public class ObjectStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		writeObject();
		readObject();
	}

	private static void readObject() throws IOException, ClassNotFoundException{
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("F:\\obj.txt"));
		Person p = (Person)ois.readObject();
		System.out.println(p.toString());
		ois.close();
	}

	private static void writeObject() throws IOException{
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("F:\\obj.txt"));
		oos.writeObject(new Person("��ʦʦ",20,"����"));
		oos.close();
	}

}
