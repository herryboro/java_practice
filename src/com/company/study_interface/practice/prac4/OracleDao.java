package com.company.study_interface.practice.prac4;

public class OracleDao implements DataAccessObject {
    @Override
    public String select() {
        return "Oracle Db에서 검색";
    }

    @Override
    public String insert() {
        return "Oracle Db에서 삽입";
    }

    @Override
    public String update() {
        return "Oracle Db에서 수정";
    }

    @Override
    public String delete() {
        return "Oracle Db에서 삭제";
    }
}
