package test33;
/*
 *自定义枚举week表示星期几，要求每个枚举值都有tolocaleString方法。返回中文格式的星期几。
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
			return "星期一";
		}
	},TUES {
		@Override
		public String weekDay() {			
			return "星期二";
		}
	},WEN {
		@Override
		public String weekDay() {
			return "星期三";
		}
	},THUR {
		@Override
		public String weekDay() {			
			return "星期四";
		}
	},FRI {
		@Override
		public String weekDay() {			
			return "星期五";
		}
	},SAT {
		@Override
		public String weekDay() {			
			return "星期六";
		}
	},SUN {
		@Override
		public String weekDay() {			
			return "星期日";
		}
	};
	public abstract String weekDay();
}