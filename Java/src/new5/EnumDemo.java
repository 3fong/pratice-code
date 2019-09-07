package new5;
/*
 **通过JDK5提供的枚举来做枚举类
 *指将变量的值一一列出来,变量的值只限于列举出来的值的范围内
 *public enum 枚举类名 {
			枚举项1，枚举项2，枚举项3…;
  }
  注意事项
	定义枚举类要用关键字enum,所有枚举类都是Enum的子类
	枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他的东西，
	这个分号就不能省略。建议不要省略枚举类可以有构造器，但必须是private的，它默认的也是
	private的。枚举项的用法比较特殊：枚举("");
	枚举类也可以有抽象方法，但是枚举项必须重写该方法
 */
public enum EnumDemo {
	FRONT,BEHIND,LFTE,RIGHT,
	FRONT1("前"),BEHIND1("后"),LEFT1("左"),RIGHT1("右");
	private String name;
	private EnumDemo(){}
	private EnumDemo(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
