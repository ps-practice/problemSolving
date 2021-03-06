package week2;

public class programmers12926 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));

    }

    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(char c:arr){
            if(c==' '){ // 공백
                answer +=' ';
            }else{
                if(c >= 65 && c<= 90){ // 대문자
                    if(c+n > 90){
                        answer += (char)(c+n-26);
                        continue;
                    }
                }
                else if(c>=97 && c<=122) { // 소문자
                    if(c+n > 122){
                        answer += (char)(c+n-26);
                        continue;
                    }
                }
                answer += (char)(c+n);
            }

        }

        return answer;
    }
}
