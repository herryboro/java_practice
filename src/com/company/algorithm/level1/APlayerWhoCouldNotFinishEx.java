package com.company.algorithm.level1;

public class APlayerWhoCouldNotFinishEx {
    public static void main(String[] args) {

        /*
            1번
            String[] participant = {"leo", "kiki", "eden"};
            String[] completion = {"eden", "kiki"};

            2번
            String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
            String[] completion = {"josipa", "filipa", "marina", "nikola"};

            3번
            String[] participant = {"mislav", "stanko", "mislav", "ana"};
            String[] completion = {"stanko", "ana", "mislav"};
         */
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        APlayerWhoCouldNotFinish ap = new APlayerWhoCouldNotFinish();
        System.out.println(ap.solution(participant,completion));
    }
}
