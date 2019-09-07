package faceObject;
/*
 *Object��-equals() equals�߱��Ƚ������������ݵĹ��ܣ�
��ΪObject ����ʵ���Ƕ�̬��Ӧ�� //Object obj = new �������� 
 */
class Duo{
	private String name;
	public Duo() {
		super();		
	}
	public Duo(String name) {
		super();
		this.name = name;
	}
	public boolean equals(Object obj){//Object obj = new Duo();
		if(!(obj instanceof Duo)){
			throw new ClassCastException("���Ͳ�ƥ�䣡");
		}
		Duo d = (Duo)obj;
		return this.name.equals(d.name);
	}
	@Override
	public String toString() {
		return "Duo [name=" + name + "]";
	}	
}
public class DuoTaiObject {

	public static void main(String[] args) {
		Duo d = new Duo("zhangsan");
		Duo d1 = new Duo("zhangsan");
		Duo d2 = d;
		//���粻��дequals�������Ƚϵ�����������ֵ����ȡ�
		boolean flag = d.equals(d1);
		System.out.println(flag);
	}

}
