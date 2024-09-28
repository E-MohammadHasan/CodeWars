package codewars.TheBeginning;

public class FirstQuestion {

    /* 
        The Question .....   
                    {Java If Else } ---> 
        
        It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... 
        but who is going to make the most money?

        Build a function that takes in two arguments (salary, bonus). 
        Salary will be an integer, and bonus a boolean.

        If bonus is true, the salary should be multiplied by 10. If bonus is false, 
        the fatcat did not make enough money and must receive only his stated salary.

        Return the total figure the individual will receive as a string prefixed with 
        "£" (= "\u00A3", JS, Go, Java, Scala, and Julia), "$" (C#, C++, Dart, Ruby, Clojure, Elixir, PHP, Python, Haskell, and Lua) or "¥" (Rust).
    
     */
    // ~~~~~~~~~~ My Answer ~~~~~~~~~~~ :) 
    
             static int newSalary;
          
          public static String bonusTime(final int salary, final boolean bonus) {
             if (bonus) {
        	      newSalary = salary * 10;
        	    } else {
        	      newSalary = salary;
        	    }
        	    String finalSalary = Integer.toString(newSalary);
        	    
        	    return "\u00A3" + finalSalary;
          }
        }
     
// ~~~~~~~~~~~ The professional answer ~~~~~~~~~~ :) 
 /*   public static void main(String[] args) {
        System.out.println(bonusTime(100, true));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!

        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }

}
*/
