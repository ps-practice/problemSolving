package week3;

import java.util.HashMap;
import java.util.Set;

public class programmers42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap();

        String temp;
        for (int i = 0; i < clothes.length; i++) {

            temp = clothes[i][1];

            if (map.containsKey(temp)) { // 이미 table에 존재하는 옷의 종류라면
                map.put(temp, map.get(temp) + 1);
            } else { // 존재하지 않는다면
                map.put(temp, 1);
            }
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            answer *= map.get(key) + 1;
        }

        return answer - 1; // 아무것도 안입는 경우 제외
    }
}
