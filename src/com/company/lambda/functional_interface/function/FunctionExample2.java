package lambda.functional_interface.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	
	private static List<Student> list = Arrays.asList(
		new Student("홍길동", 90, 96),
		new Student("김유신", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(t -> t.getEnglishScore());
		System.out.println("평균 영어 점수: " + englishAvg);
		
		double mathAvg = avg(t -> t.getMathScore());
		System.out.println("평균 영어 점수: " + mathAvg);
	}

}
