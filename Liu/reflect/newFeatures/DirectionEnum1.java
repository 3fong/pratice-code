package newFeatures;
/*
 *ע������
	����ö����Ҫ�ùؼ���enum
	����ö���඼��Enum������
	ö����ĵ�һ���ϱ�����ö������һ��ö�����ķֺ��ǿ���ʡ�Եģ��������ö�����������Ķ�����
	����ֺžͲ���ʡ�ԡ����鲻Ҫʡ��ö��������й���������������private�ģ���Ĭ�ϵ�Ҳ��
	private�ġ�ö������÷��Ƚ����⣺ö��("");

 */
public enum DirectionEnum1 {
	FRONT("ǰ"),BEHIND("��"),LEFT("��"),RIGHT("��");
	private String name;

	private DirectionEnum1(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
