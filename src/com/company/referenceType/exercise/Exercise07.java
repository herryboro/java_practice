package com.company.referenceType.exercise;

public class Exercise07 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = {1, 100, 3, 8, 2};
        int compareNum = 0;

        // 작성 위치
        for (int i = 0; i < array.length; i++) {
            compareNum = array[i];
            if (max < compareNum) {
                max = compareNum;
            }
        }
        System.out.println("max: " + max);

    }
}
