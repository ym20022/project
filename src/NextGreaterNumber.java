import java.util.Arrays;

public class NextGreaterNumber {
    public static void main(String[] args) {
        System.out.println(findNextGreaterNumber(123)); // тут вводим число для модификации
    }

    public static int findNextGreaterNumber(int number) {
        char[] digits = String.valueOf(number).toCharArray();

        int i = digits.length - 1;
        while (i > 0 && digits[i - 1] >= digits[i]) {
            i--;
        }

        if (i <= 0) {
            return -1;
        }

        int j = digits.length - 1;
        while (digits[j] <= digits[i - 1]) {
            j--;
        }

        char temp = digits[i - 1];
        digits[i - 1] = digits[j];
        digits[j] = temp;

        Arrays.sort(digits, i, digits.length);

        int result = Integer.parseInt(String.valueOf(digits));
        return result;
    }
}