package new5;
/*
 **ͨ��JDK5�ṩ��ö������ö����
 *ָ��������ֵһһ�г���,������ֵֻ�����оٳ�����ֵ�ķ�Χ��
 *public enum ö������ {
			ö����1��ö����2��ö����3��;
  }
  ע������
	����ö����Ҫ�ùؼ���enum,����ö���඼��Enum������
	ö����ĵ�һ���ϱ�����ö������һ��ö�����ķֺ��ǿ���ʡ�Եģ��������ö�����������Ķ�����
	����ֺžͲ���ʡ�ԡ����鲻Ҫʡ��ö��������й���������������private�ģ���Ĭ�ϵ�Ҳ��
	private�ġ�ö������÷��Ƚ����⣺ö��("");
	ö����Ҳ�����г��󷽷�������ö���������д�÷���
 */
public enum EnumDemo {
	FRONT,BEHIND,LFTE,RIGHT,
	FRONT1("ǰ"),BEHIND1("��"),LEFT1("��"),RIGHT1("��");
	private String name;
	private EnumDemo(){}
	private EnumDemo(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
