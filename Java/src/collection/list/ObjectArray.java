package collection.list;
/*
 *����ȿ��Դ洢��������ͣ�Ҳ���Դ洢�������͡���洢�������͵�ʱ�������ͽж������顣
 */
public class ObjectArray {

	public static void main(String[] args) {		
		Student[] sts = new Student[5];
		sts[0] = new Student("����",20);
		sts[1] = new Student("lisi",20);
		sts[2] = new Student("����",20);
		sts[3] = new Student("ʯ��",20);
		sts[4] = new Student("ľɭ",20);
		
		for(int x=0;x<sts.length;x++){
			System.out.println(sts[x]);
		}
		Student[] sts2 = {new Student("����",20),new Student("lisi",20)};
		for(Student s : sts2){
			System.out.println(s);
		}
	}

}
