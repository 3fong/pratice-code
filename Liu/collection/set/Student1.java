package set;
/*
 *����ѧ��������
 *		��Ա����������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�,�ܷ�
 *		���캯�����޲Σ��в�
 *		��Ա������set get toString
 */
public class Student1 implements Comparable<Student1> {
	private String name;
	private int yu;
	private int math;
	private int ying;
	private int sum;
	public Student1() {
		super();		
	}
	public Student1(String name, int yu, int math, int ying) {
		super();
		this.name = name;
		this.yu = yu;
		this.math = math;
		this.ying = ying;
		sum=yu+math+ying;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	
	/**
	 * @return the ying
	 */
	public int getYing() {
		return ying;
	}
	/**
	 * @param ying the ying to set
	 */
	public void setYing(int ying) {
		this.ying = ying;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", yu=" + yu + ", math=" + math + ", ying=" + ying + ", sum=" + sum + "]";
	}
	@Override
	public int compareTo(Student1 o) {
		int num = o.sum-this.sum;
		if(num==0){
			return this.name.compareTo(o.name);
		}
		return num;
	}	
}
