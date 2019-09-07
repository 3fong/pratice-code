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
	//toString(),需複寫才有意義	 
	public static void stringTo(){	
		Student s = new Student();
		sop(s.hashCode());
		sop(s.getClass().getName());
		sop(s.toString());
		
		sop(s.getClass().getName()+
				"@"+Integer.toHexString(s.hashCode()));
	} 
	//複寫格式
//	public String toString() {
//		return name+":"+age;
//	}
	//equals，比較地址值。需複寫才有意義
	public static void equalsDemo(){
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("林青霞",27);
		sop(s1==s2);
		sop(s1.equals(s2));
	}
	//複寫格式
//	public boolean equals(Object obj){
//		if(!(obj instanceof Student))
//			return false;
//		Student s = (Student)obj;
//		return this.name.equals(s.name)&&this.age==s.age;
//	}
	//clone() 複製方法
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
