package list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
 *������
 *	����һ��
 *		ȥ���ظ�ֵ�漰�Ƚϣ�����ʹ��ѡ��ð������
 *		�Ƚ�ֵ��equalsɸѡ��
 *		�ѵ㣺String[]�ͼ��ϵ�ת��
 *	��������
 *		�½�һ��������contains()�ж��Ƿ����	
 */
public class TirmArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("hello");
		al.add("java");
		al.add("girl");
		al.add("girl");
		al.add("hello");
		al.add("java");
		al.add("girl");
		
		System.out.println(al);
		ArrayList al2 = trimArray(al);
		System.out.println(al2);
	}
	public static ArrayList trimArray(ArrayList al){
		for(int x=0;x<al.size()-1;x++){
			for(int y=x+1;y<al.size();y++){
				if(al.get(x).equals(al.get(y))){
					al.remove(y);
					y--;
				}
			}
		}
		return al;
	}
	public static ArrayList trimArray2(ArrayList al){
		ArrayList newAl = new ArrayList();
		for(int x=0;x<al.size();x++){
			if(!newAl.contains(al.get(x))){
				newAl.add(al.get(x));
			}
		}
		return newAl;
	}
	public static ArrayList trimArray3(ArrayList al){
		ArrayList newAl = new ArrayList();
		for(Iterator it=al.iterator();it.hasNext();){
			String s = (String)it.next();
			if(!newAl.contains(s)){
				newAl.add(s);
			}
		}
		return newAl;
	}
}
