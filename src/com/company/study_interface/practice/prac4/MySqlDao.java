package com.company.study_interface.practice.prac4;

public class MySqlDao implements DataAccessObject {
    @Override
    public String select() {
        return "MySql DB에서 검색";
    }

    @Override
    public String insert() {
        return "MySql DB에서 삽입";
    }

    @Override
    public String update() {
        return "MySql DB에서 수정";
    }

    @Override
    public String delete() {
        return "MySql DB에서 삭제";
    }
}
