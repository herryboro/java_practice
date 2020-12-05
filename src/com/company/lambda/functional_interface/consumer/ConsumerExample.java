package lambda.functional_interface.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	private static void print(Consumer<String> consumer) {
		consumer.accept("javava");
	}
	
	public static void main(String[] args) {
		
		print(t -> System.out.println(t));
		
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (a, b) -> {
			System.out.println(a + b);
		};
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = a -> {
			System.out.println("java" + a);
		};
		doubleConsumer.accept(8);
		
		ObjIntConsumer<String> objIntConsumer = (a, b) -> {
			System.out.println(a + b);
		};
		objIntConsumer.accept("java", 8);
	}

}
