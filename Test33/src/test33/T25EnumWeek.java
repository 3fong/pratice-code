package test33;
/*
 *�Զ���ö��week��ʾ���ڼ���Ҫ��ÿ��ö��ֵ����tolocaleString�������������ĸ�ʽ�����ڼ���
 */
public class T25EnumWeek {
	public static void main(String[] args) {
		String str = Week.TUES.weekDay();
		System.out.println(str);
	}
}
enum Week{
	MAN {
		@Override
		public String weekDay() {			
			return "����һ";
		}
	},TUES {
		@Override
		public String weekDay() {			
			return "���ڶ�";
		}
	},WEN {
		@Override
		public String weekDay() {
			return "������";
		}
	},THUR {
		@Override
		public String weekDay() {			
			return "������";
		}
	},FRI {
		@Override
		public String weekDay() {			
			return "������";
		}
	},SAT {
		@Override
		public String weekDay() {			
			return "������";
		}
	},SUN {
		@Override
		public String weekDay() {			
			return "������";
		}
	};
	public abstract String weekDay();
}