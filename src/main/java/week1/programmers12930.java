package week1;

public class programmers12930 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {

        char[] arr = s.toCharArray();
        boolean isCapital = true;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                isCapital = true;
                continue;
            }

            if (isCapital) {
                arr[i] = Character.toUpperCase(arr[i]);
            } else {
                arr[i] = Character.toLowerCase(arr[i]);
            }

            isCapital = !isCapital;
        }
        return String.valueOf(arr);
    }
}




