package com.company.anonymousclass;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		void eat() {
			System.out.println("군것질을 합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("5시에 일어납니다.");
			work();
			eat();
			
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("6시에 일어납니다.");
				walk();
			}
		};		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
