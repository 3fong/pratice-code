package extend;
//�����ڲ���
interface Person5{
	void study();
}
class PersonDemo2 {
	public void method(Person5 p){
		p.study();
	}
}
class Student5 implements Person5{
	public void study(){
		System.out.println("ѧϰ");
	}
}
public class InnerClassDemo3 {

	public static void main(String[] args) {
		//���÷���һ��
		PersonDemo2 pd = new PersonDemo2();
		Person5 p = new Student5();
		pd.method(p);
		
		//��������
		PersonDemo2 pd2 = new PersonDemo2();
		pd.method(new Person5(){
			public void study(){
				System.out.println("����ѧϰ");
			}
		});
	}

}
