package extend;
//�����ڲ���ĵ���
interface Inner6{
	public abstract void show();
	public abstract void show1();
}
public class InnerClassDemo4 {

	public static void main(String[] args) {
		new Inner6(){
			public void show(){
				System.out.println("��Ч");
			}
			public void show1(){
				System.out.println("��Ц");
			}
		}.show();
		new Inner6(){
			public void show(){
				System.out.println("��Ч");
			}
			public void show1(){
				System.out.println("��Ц");
			}
		}.show1();
		
		//���������ֵķ�ʽ��ε��������ڲ���
		Inner6 i = new Inner6(){
			public void show(){
				System.out.println("��Ч");
			}
			public void show1(){
				System.out.println("��Ц");
			}
		};
		i.show();
		i.show1();
		
	}

}
