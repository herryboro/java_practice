package study_interface.contain_default_method;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface의 defalut method2 입니다.");
	}
}
