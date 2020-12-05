package lambda.method_referernces.static_vs_instance;

public class Calculator {
	public static int staticMethod(int x, int y) {
		return x + y;
	}
	
	public int instanceMethod(int x, int y) {
		return x + y;
	}
}
