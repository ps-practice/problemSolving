package week3;

import java.util.Arrays;

public class programmers12921 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }
    public static int solution(int n) {
        int count = 0;

        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true); // 전체를 true로 채우기
        arr[0] = arr[1] = false; // 0, 1은 소수가 아니므로 false

        // n의 제곱근까지 배수는 false로 바꾸기
        for(int i=2; i*i<=n; i++){
            for(int j=i*i; j<=n; j+=i){
                arr[j] = false;
            }
        }

        for(int i=2; i<=n; i++){
            if(arr[i] == true) count++;
        }

        return count;
    }
}
