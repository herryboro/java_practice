package com.company.chapter06.javaClass.practice.prac15;

class MemberService {

    public boolean longin(String id, String password) {
        if (id == "hong") {
            if (password == "12345") {
                return true;
            }
        }
        return false;
    }

    public void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
