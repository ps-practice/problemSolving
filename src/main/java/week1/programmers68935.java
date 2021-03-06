package week1;

public class programmers68935 {
    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n) {

        int answer = 0;

        int count = 0;
        while (Math.pow(3, count) <= n) { // 자리수가 몇개 필요한지 알아내기
            count++;
        }

        int[] three = new int[count]; // 앞뒤반전 3진법으로 저장
        for (int i = 0; i < three.length; i++) {
            three[i] = n % 3;
            n = n / 3;
        }

        for (int i = 0; i < three.length; i++) { // 앞뒤반전 3진법 -> 10진법으로 표현
            answer += Math.pow(3, i) * three[count - i - 1];
        }

        return answer;
    }

}
