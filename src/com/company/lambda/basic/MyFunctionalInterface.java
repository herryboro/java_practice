package lambda.basic;

@FunctionalInterface
public interface MyFunctionalInterface {
//	public void method(); // 매개변수 x
	public void method(int x); // 매개변수 o
//	public int method(int x, int y); // return 이 있는 경우
}
