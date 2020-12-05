package stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"김유신", "홍길동", "강감찬", "람다식", "herryboro"
		);
		
		// 순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample :: print);
		System.out.println("=======================");
		
		// 병렬 처리
		Stream<String> paralleStream = list.parallelStream();
		paralleStream.forEach(ParallelExample :: print);			
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
