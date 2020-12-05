package collection.map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			System.out.println(sno);
			System.out.println(student.sno);
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			System.out.println("=");
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		System.out.println("hash sno: " + sno);
		System.out.println("hash name.hashCode(): " + name.hashCode());
		return sno + name.hashCode();
	}
}
