package com.company.referenceType.arrayReference;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        System.out.println("mathScores.length: " + mathScores.length);
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        System.out.println("englishScores.length: " + englishScores.length);
        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
            }
        }
        System.out.println();

        /*
            int[][] javaScores = new int[2][];
            javaScores[0] = new int[2];
            javaScores[1] = new int[3];
         */
        int[][] javaScores = {{95, 80}, {92, 96, 80}};
        System.out.println("javaScores.length: " + javaScores.length);
        for (int i = 0; i < javaScores.length; i++) {
            for (int j = 0; j < javaScores[i].length; j++) {
                System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
            }
        }
        System.out.println();

        /*
            새로운 문제
            1, 2, 3, 4
            5, 6, 7
            8, 9
            를 이중 배열로 만들어 보기
         */
        int[][] myArrays = new int[3][];
        myArrays[0] = new int[4];
        myArrays[1] = new int[3];
        myArrays[2] = new int[2];
        int cnt = 1;
        for(int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays[i].length; j++) {
               myArrays[i][j] = cnt++;
               System.out.println("myArrays[" + i + "][" + j + "] = " + myArrays[i][j]);
            }

        }

    }
}
