package week3;

import java.util.Arrays;

public class programmers17681 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int temp1;
        int temp2;
        int[] tempArr1 = new int[n];
        int[] tempArr2 = new int[n];
        String temp;

        for (int i = 0; i < n; i++) {
            temp = "";
            temp1 = arr1[i]; // [9, 20, 28, 18, 11]
            temp2 = arr2[i]; // [30, 1, 21, 17, 28]


            for (int j = n - 1; j >= 0; j--) {

                // 9 -> 01001
                if (temp1 / Math.pow(2, j) >= 1) { // 1
                    tempArr1[n - 1 - j] = 1;
                    temp1 = (int) (temp1 % Math.pow(2, j));
                } else { // 0
                    tempArr1[n - 1 - j] = 0;
                }

                // 30 -> 11110
                if (temp2 / Math.pow(2, j) >= 1) { // 1
                    tempArr2[n - 1 - j] = 1;
                    temp2 = (int) (temp2 % Math.pow(2, j));
                } else { // 0
                    tempArr2[n - 1 - j] = 0;
                }
            }

            for (int k = 0; k < n; k++) {
                if (tempArr1[k] + tempArr2[k] == 0) {
                    temp += " ";
                } else {
                    temp += "#";
                }
            }

            answer[i] = temp;
        }

        return answer;
    }
}
