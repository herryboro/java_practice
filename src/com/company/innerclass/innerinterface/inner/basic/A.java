package com.company.innerclass.innerinterface.inner.basic;

public class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B 객체가 생성됨");
		}
		
		class E {
			int field1;
			public E() {
				System.out.println("E객체가 생성됨");
			}
			void method1() {
				System.out.println("Efield1: " + field1);
			}		
			
		}
		
		int field1;		
		// static int field2;
		
		void method1() {
			System.out.println("Bfield1: " + field1);
		}		
		// static void method2() {}					
	}
	
	// 정적 멤버 클래스
	static class C  {
		C() {
			System.out.println("객체 C가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("Cfield1: " + field1);
		}
		static void method2() {
			System.out.println("Cfield2: " + field2);
		}	
	}
	
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("객체 D가 생성됨");
			}
			int field1;
			// static int field2;
			void method1() {
				System.out.println("A_void메소드 field1: " + field1);
			}
			// static void method2() {}	
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
		
	}
}
