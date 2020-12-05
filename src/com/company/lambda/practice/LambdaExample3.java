package lambda.practice;

import java.util.function.ToIntFunction;

public class LambdaExample3 {

	private static Student[] student = {
		new Student("홍길동", 90, 96),
		new Student("herryboro", 95, 93)
	};
	
	// arg()메소드
	private static double avg(ToIntFunction<Student> toIntFunction) {
		int sum = 0;
		int count = 0;
		for(Student student : student) {			
			sum += toIntFunction.applyAsInt(student);
			System.out.println("sum : " + sum);
			count++;			
		}	
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		System.out.println("수학 평균 점수: " + mathAvg);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {		
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}				
		
	}

}
