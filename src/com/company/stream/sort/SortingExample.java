package stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// 숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + ","));
		System.out.println("\n============================================");
		
		// 객체 요소일 경우
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 30),
				new Student("이순신", 10),
				new Student("유관순", 20),
				new Student("유민", 5)
		);
		
		studentList.stream()
			.sorted()
			.forEach(n -> System.out.print(n.getScore() + ","));
			
		System.out.println("\n============================================");
		
		studentList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(n -> System.out.print(n.getScore() + ","));		
		
	}
}
