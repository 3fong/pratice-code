package base;
//for��whileѭ���������
public class ForDemo {

	public static void main(String[] args) {
//		getSum();
//		getEven();
//		getOdd();
//		getDaffodilNum();
//		getMultiTable();
		getCount();
		getSum();
	}
	//���
	public static void getSum(){
		int sum=0;
		for(int x=0;x<=10;x++){
			sum+=x;
		}
		sop("1~10�ĺ�Ϊ��"+sum);
	}
	//��1~10ż����
	public static void getEven(){
		int sum=0;
		for(int x=0;x<=10;x++){
			if(x%2==0){
				sum+=x;
			}
		}
		sop("1~10ż����Ϊ��"+sum);
	}
	//��1~10������
	public static void getOdd(){
		int sum=0;
		for(int x=1;x<=10;x+=2){
			sum+=x;
		}
		sop("1~10������Ϊ��"+sum);
	}
	//��ӡˮ�ɻ�����ˮ�ɻ�������λ��ʮλ�Ͱ�λ�������η���Ϊԭ��������
	public static void getDaffodilNum(){
		int count=0;
		for(int x=100;x<1000;x++){
			int ge=x%10;
			int shi=x/10%10;
			int bai=x/100%10;
			while(ge*ge*ge+shi*shi*shi+bai*bai*bai==x){
				count++;
				sop("ˮ�ɻ����У�"+x);
				break;
			}
		}
		sop("��ӡˮ�ɻ�����"+count+"��");
	}
	//�žų˷���
	public static void getMultiTable(){
		for(int x=1;x<=9;x++){
			for(int y=1;y<=x;y++ ){
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}		
	}
	//��ֽ�����������߶��������ֽ��0.01m��
	public static void getCount(){
		int count=0;
		int hou=1;
		int high=884800;
		while(hou<=high){
			count++;
			hou*=2;
			sop("��"+count+"�۵������Ϊ"+hou+"����");
		}
		sop("�ﵽ���������߶�����"+count+"��");
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
