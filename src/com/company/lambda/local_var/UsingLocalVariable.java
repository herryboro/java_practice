package lambda.local_var;

public class UsingLocalVariable {
	void method(int arg) {		// arg는 final 특성을 가짐
		int localVar = 40; 		// localVar은 final 특성을 가짐
				
		// arg = 31;
		// localVar = 40;
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 읽기
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
			System.out.println();
		};
		fi.method();
		
	}
}
