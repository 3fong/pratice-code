package test33;
/*
 *10�� 28������ֺȣ�3������ƿ�ǿ��Ի�һƿ���֣���ôҪ�����ƿ���֣�
 * ��28�˺ȣ�������50�ˣ�����Ҫ�����ƿ���֣�
 	����д������˼·��
 	������
 		������ֵ����������������ƿ�ǣ����ǵĹ�ϵ��1��=1���֣�3��=1���֣�
 		����������ٹ��ȣ�
 		ת�������������� person��cole��cat
		��������پ���ͬʱ��3cat=1cole;����ͨ��whileѭ������������cole>=person
 */
public class T9BuyColeDemo {

	public static void main(String[] args) {
		int cole = 0;
		int cap = 0;
		int person = 28;
		int buy=0;
		while(cole<person){			
			buy++;
			cap++;
			cole++;			
			if(cap==3){
				cole++;
				cap=1;
			}
		}
		System.out.println(buy);
	}
}
