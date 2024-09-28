package codewars.TheBeginning;

public class ThirdQuestion {

    public static int sum(int[] numbers) {
        int minValue = numbers[0];
        int maxValue = numbers[0];
        int summation = 0;

        if (numbers == null || numbers.length < 1) {
            return 0;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                numbers[i] = maxValue;

            } else {
                numbers[i] = minValue;

            }

        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != maxValue && numbers[i] != minValue) {
                summation += numbers[i];
            }
        }
        return summation;
    }

}
