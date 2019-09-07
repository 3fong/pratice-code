/**
 * 
 */
package object;
import eclipse.Student;
/**
 * @author David
 *
 */
public class ObjectDemo {

	
	public static void main(String[] args) throws Exception{
		
//		stringTo();
//		equalsDemo();
		cloneDemo();
	}
	//toString(),���}���������x	 
	public static void stringTo(){	
		Student s = new Student();
		sop(s.hashCode());
		sop(s.getClass().getName());
		sop(s.toString());
		
		sop(s.getClass().getName()+
				"@"+Integer.toHexString(s.hashCode()));
	} 
	//�}����ʽ
//	public String toString() {
//		return name+":"+age;
//	}
	//equals�����^��ֵַ�����}���������x
	public static void equalsDemo(){
		Student s1 = new Student("����ϼ",27);
		Student s2 = new Student("����ϼ",27);
		sop(s1==s2);
		sop(s1.equals(s2));
	}
	//�}����ʽ
//	public boolean equals(Object obj){
//		if(!(obj instanceof Student))
//			return false;
//		Student s = (Student)obj;
//		return this.name.equals(s.name)&&this.age==s.age;
//	}
	//clone() �}�u����
	public static void cloneDemo() throws Exception{
		Student s = new Student();
		s.setName("lin");
		s.setAge(27);
		
		Object o = s.clone();
		Student s2 = (Student)o;
		sop(s.getName()+s.getAge());
		sop(s2.getName()+s2.getAge());
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
