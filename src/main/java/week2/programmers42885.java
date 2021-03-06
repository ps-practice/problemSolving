package week2;

import java.util.Arrays;

public class programmers42885 {
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int[] people2 = {70, 80, 50};
        System.out.println(solution(people, 100));
        System.out.println(solution(people2, 100));
    }
    public static int solution(int[] people, int limit) {
        int length = people.length;
        int count = 0;

        // 오름차순 정렬
        Arrays.sort(people);

        // 가장 무거운 사람부터 실행
        for(int i=length-1; i>0; i--){

            // 같이 태울 사람이 없다면
            if(count >= i) break;

            // 현재 사람 몸무게 + 남아있는 사람 중 가장 적은 몸무게
            if(people[i] + people[count]<= limit){
                count++;
            }
        }

        // 전체 인원의 수 - 2명이 보트를 타는 경우
        return length-count;
    }
}
