package thread;
/*
 *�������ģʽ��
 *	���ƴ��������������˽���Լ��Ĺ��췽�������ṩ��ȡ����ķ���
 *	���ݴ��������ʱ����Ϊ������ʽ������ʽ
 */
//����ʽ
class Single1{
	private Single1(){}
	private static Single1 s = new Single1();
	public static Single1 getInstance(){
		return s;
	}
}
//����ʽ
class Single2{
	private Single2(){}
	private static Single2 s = null;
	public static Single2 newInstance(){
		//˫���жϿ��Լ����жϴ��������Ч��
		if(s==null){
			synchronized(s){
				if(s==null)
					s=new Single2();
			}
		}
		return s;
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		Single1 s = Single1.getInstance();
	}

}
