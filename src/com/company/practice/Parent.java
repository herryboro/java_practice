package com.company.practice;

import java.util.*;

public class Parent {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Collection<Member> findAll() {
        return new ArrayList<Member>(store.values());
    }

    public static void main(String[] args) {
        Parent parent = new Parent();

        Member member = new Member();
        Member member2 = new Member();

        member.setName("백경찬");
        member2.setName("마정한");
        parent.save(member);
        parent.save(member2);
        parent.findAll().stream().forEach(n -> System.out.println(n.getName()));
    }
}
