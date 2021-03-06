package week1;

public class programmers43165 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    static int count = 0;

    public static int solution(int[] numbers, int target) {
        calculate(0, -1, numbers, target);

        return count;
    }

    public static void calculate(int sum, int index, int[] numbers, int target) {

        if (index <= numbers.length - 1) {
            if (index == numbers.length - 1) {
                if (sum == target) {
                    count++;
                    // System.out.println("sum="+sum + " 카운트= "+count);
                } else {
                    // System.out.println("sum="+sum);
                }
            } else {

                index++;
                calculate(sum + numbers[index], index, numbers, target);
                calculate(sum - numbers[index], index, numbers, target);
            }
        }
    }

}
