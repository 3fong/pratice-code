package exception;
/*
 *2:���catch������return��䣬����finally����Ĵ��뻹��ִ����?
 *   ����ᣬ��������returnǰ������return��
 * 	   �ᡣǰ��
 * 
 * 	 ׼ȷ��˵��Ӧ�������м䡣
 */
public class FinalDemo {

	public static void main(String[] args) {
		System.out.println(show());
	}
	public static int show(){
		int a = 23;
		int b=0;
		try{
			System.out.println(a/b);
			a=20;//ִ�в���
		}catch(Exception e){
			a = 30;
			
			/*
			 * return a�ڳ���ִ�е���һ����ʱ�����ﲻ��return a����return 30;�������·�����γ��ˡ�
			 * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40
			 * �ٴλص���ǰ�ķ���·����������return 30;
			 */
			return a;
		}finally{
			a=40;
//			return a;
		}
		return a;
	}
}
