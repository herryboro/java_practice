package stream.sort;

public class Student implements Comparable<Student> {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) {
//		System.out.println("compare: " + score);
//		System.out.println("compare: " + o.score);
//		System.out.println("================");
		return Integer.compare(score, o.score);
	}
	
}
