package stream.type.intt;

import java.util.stream.IntStream;

public class FromIntReangeExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총 합: " + sum);
	}

}
