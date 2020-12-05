package stream.pipeline;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("이순신", Member.FEMALE, 20),
				new Member("유관순", Member.MALE, 45),
				new Member("herryboo", Member.FEMALE, 27)
		);
		
		double avr = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이: " + avr);
	}

}
