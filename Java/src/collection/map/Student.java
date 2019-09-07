package collection.map;
/*
 *��Ȼ������Ԫ������߱��Ƚ��ԡ�Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTo������
 *	����ԭ���Ȱ�ID�ţ��ٰ��������
 */
public class Student implements Comparable<Student>{
	private String id;
	private String name;
	public Student() {
		super();		
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int hashCode(){
		return id.hashCode()*name.hashCode();
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ�䣡");
		Student s = (Student)obj;
		return this.id.equals(s.id)&&this.name.equals(s.name);
	}
	@Override
	public int compareTo(Student o) {
		int num = this.id.compareTo(o.id);
		if(num==0)
			return this.name.length()-o.name.length();
		return num;
	}
	
}
