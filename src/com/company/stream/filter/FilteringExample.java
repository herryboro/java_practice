package stream.filter;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"홍길동", "김유신", "홍길동", "herryboro", "킹세종"
		);
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println("======================");
		
		names.stream()
			.filter(n -> n.startsWith("h"))
			.forEach(n -> System.out.println(n));
		System.out.println("======================");
		
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("홍"))
			.forEach(n -> System.out.println(n));
	}

}
