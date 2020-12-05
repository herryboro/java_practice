package stream.mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("이순신", 20),
				new Student("강감찬", 30)
		);
		
		studentList.stream()
			.mapToInt(n -> n.getScore())
			.forEach(score -> System.out.println(score));
	}

}
