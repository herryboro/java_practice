package stream.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("herryboro", "이순신", "홍길동");
		
		
		// iterator 사용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {			
			String name = iterator.next();
			System.out.println("iter: " + name);
		}
		
		System.out.println("=====================");
		
		// stream 사용
		Stream<String> stream = list.stream();
		stream.forEach(name -> {
			System.out.println("stream: " + name);
		});
	}

}
