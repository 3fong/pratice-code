package base;

public class StoreXiaoHua {

	public static void main(String[] args) {		
//		xiaoHua();
		zheZhi();
	}
	//��ֽ�����������߶��������ֽ��0.01m��
	private static void zheZhi() {
		int count =0;
		int hou=1;
		int tall=884800;
		while(hou<=tall){
			count++;
			hou*=2;
			System.out.println("��"+count+"���۵������Ϊ��"+hou+"����");
		}
		System.out.println("�ﵽϲ�����Ÿ߶ȣ��裺"+count+"��");
	}
	//С����Ǯ��ÿ���2.5Ԫ��ÿ���컨6�飬�ʶ������ܴ浽100
	private static void xiaoHua() {
		double sum=0;
		int x=0;
		while(true){
			sum+=2.5;
			x++;
			if(x%5==0){
				sum-=6;
				System.out.println("��"+x+"�죬����6�飬��ʣ"+sum+"Ԫ");
			}
			if(sum>=100){
				System.out.println("��"+x+"�죬�浽��100");
				break;
			}
		}
	}

}
