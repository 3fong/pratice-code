package set;

import java.util.Comparator;

/**
 *�Ƚ������� ���ݣ��������ȣ�����
 *@author David
 *@version V1.1
 */
public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int num = o1.getName().length()-o2.getName().length();
		if(num==0){
			return o1.getAge()-o2.getAge();
		}
		return num;
	}
	
}
