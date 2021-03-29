package com.company.study_interface.practice.prac4;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        System.out.println(dao.select());
        System.out.println(dao.insert());
        System.out.println(dao.update());
        System.out.println(dao.delete());
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
