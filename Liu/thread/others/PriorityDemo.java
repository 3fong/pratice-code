package others;
/*
 *���ȼ����߳�ִ��Ƶ��
 *��λ�ȡ�̶߳�������ȼ�?
 * 		public final int getPriority():�����̶߳�������ȼ�
 * ��������̶߳�������ȼ���?
 * 		public final void setPriority(int newPriority)�������̵߳����ȼ��� 
 * 
 * ע�⣺
 * 		�߳�Ĭ�����ȼ���5��
 * 		�߳����ȼ��ķ�Χ�ǣ�1-10��
 * 		�߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Dameon d1 = new Dameon("��");
		Dameon d2 = new Dameon("�Ʋ�");
		Dameon d3 = new Dameon("�ž���");
		
//		System.out.println(d1.getPriority());//Ĭ�����ȼ���5
		d1.setPriority(10);
		d2.setPriority(1);//���ȼ���Χ��1-10
		d1.start();
		d2.start();
		d3.start();
	}
}
