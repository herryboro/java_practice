package anonymousclass.use_localvar;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 10;		// 자바 8부터는 final선언 없이도 => ①
		int var2 = 5;
		
		field = 10;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				System.out.println("field: " + field );
				System.out.println("arg1: " + arg1 );
				System.out.println("arg2: " + arg2 );
				System.out.println("var1: " + var1 );
				System.out.println("var2: " + var2 );
				
				int result = field + arg1 + arg2 + var1 + var2;		// 익명클래스 
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
