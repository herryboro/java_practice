package innerclass.innerinterface.inner.basic;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		System.out.println("=======================");
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		System.out.println("=======================");
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		System.out.println("=======================");
	
		// 연습
		A.B e = a.new B();
		A.B.E e2 = e.new E();
		e2.field1 = 10;
		e2.method1();
		
	}

}
