package week2;


public class programmers12950 {
    public static void main(String[] args) {

        // 이중배열이라 주소값이 출력된다
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = solution(arr1, arr2);

        for (int i = 0; i < answer.length; i++) {

            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }

            System.out.println("");
        }

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int col = arr1[0].length;

        int[][] answer = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
