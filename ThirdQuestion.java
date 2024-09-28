package codewars.TheBeginning;

public class ThirdQuestion {

    /* 
         The Question .....   
                    { Sum without highest and lowest number } ---> 
          
          Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

          The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

          Mind the input validation.

          Example
          { 6, 2, 1, 8, 10 } => 16
          { 1, 1, 11, 2, 3 } => 6
        * Input validation
          If an empty value ( null, None, Nothing, nil etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
    
     */
    // ~~~~~~~~~~ My Answer ~~~~~~~~~~~ :)  
    //     E-MohammadHasan
    // Still Uncompleted answer ! 
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

// ~~~~~~~~~~~ The professional answer 1 ~~~~~~~~~~ :) 
    /*
      public static int sum(int[] numbers)
    {
      if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
      int min,max,sum;
      sum = min = max = numbers[0];
      for (int i = 1; i < numbers.length; i++)
      {
        sum += numbers[i];
        if (numbers[i] < min) min = numbers[i];
        if (numbers[i] > max) max = numbers[i];
      }
      return sum - min - max;
    }

     */
// ~~~~~~~~~~~ The professional answer 2 ~~~~~~~~~~ :)  
    /*
    import java.util.Arrays;

    public class Kata{
    
      public static int sum(int[] numbers) {
            if(numbers == null || numbers.length <= 2) return 0;
            int sum = 0;
            Arrays.sort(numbers);
            for(int i = 1; i < numbers.length-1; i++){
                sum += numbers[i];
            }
            return sum;
        }
}
     */
}
