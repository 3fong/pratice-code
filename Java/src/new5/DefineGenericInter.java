package new5;
/*
 *���Ͷ����ڽӿ��ϡ�
 *	ʵ��ʱ��������ȷ
 *	ʵ��ʱ���Ͳ���ȷȷ:�ڵ��÷���ʱ�߱���ǿ�������
 */
interface Inter<T>{
	void show(T t);
}
class Ming implements Inter<String>{
	public void show(String s){
		System.out.println("show:"+s);
	}
}
class BuMing<T> implements Inter<T>{
	public void show(T t){
		System.out.println("show:"+t);
	}
}
public class DefineGenericInter {

	public static void main(String[] args) {
		Inter<String> i = new Ming();
		i.show("2");
		
		Inter<Integer> i1 = new BuMing<Integer>();
		i1.show(12);
	}
}
