//package test;

public class Store2 {

	public static void main(String[] args){
		int sum = 100;// ���յ�Ŀ��
		double db = 2.5;// ÿ�δ�ŵ�Ǯ��
		int day = 1;// ����
		double dsum = 0;// ÿ�δ�ŵ�����
		while (true) {
			dsum = dsum + db;// ����ÿ�춼���Ǯ���ܺ�
			if (day % 5 == 0) {// �ж��ǲ���5�ı���
				dsum = dsum - 6;// �������п�ȥ6Ԫ
				System.out.println("��" + day + "�컨ȥ6Ԫ����ʣ" + dsum + "Ԫ��");
			}
			boolean flag = dsum >= sum;// ��dsum�Ƿ����sum��booleanֵ
			if (flag) {	// �����true��������յĽ����������ѭ��
				System.out.println("Ҫ���������洢" + day + "�죬���ܴ���100Ԫ��");
				break;
			} else {// ����������1��Ҳ���Ǽ�����Ǯ
				day++;
			}
		}
	}
}
