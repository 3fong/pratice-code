package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *public void write(int b):дһ���ֽ�
 *public void write(byte[] b):дһ���ֽ�����
 *public void write(byte[] b,int off,int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		//��FileOutputStream����ɳ�Ա����������ʼ��������finally�ڱ���ʹ��
		FileOutputStream fos = null;
		try{
//			fos = new FileOutputStream("java.txt");
			
			fos.write("akljflaj".getBytes());
			
			//���뻻��
			fos.write("\r\n".getBytes());
			byte[] bytes = {12,5,12,8};
			fos.write(bytes,0,bytes.length);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//���fos����null������Ҫ�ر��� ����java.lang.NullPointerException
			if(fos!=null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}		
	}
}
