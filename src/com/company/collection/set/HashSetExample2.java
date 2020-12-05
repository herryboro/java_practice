package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member member = new Member("홍길동", 30);
		Member member2 = new Member("홍길동", 30);
		System.out.println(set.add(member));
		System.out.println(set.add(member2));
		
		
		System.out.println("총 객체수: " + set.size());
	}

}
