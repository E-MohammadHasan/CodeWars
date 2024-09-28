package codewars.TheBeginning;

public class SecondQuestion {

    /* 
        The Question ---> 
          Write a function that converts any sentence into a V A P O R W A V E sentence.
          a V A P O R W A V E sentence converts all the letters into uppercase, and adds 2 spaces between each letter
          (or special character) to create this V A P O R W A V E effect.
     
      **Note that spaces should be ignored in this case.

         Examples
         "Lets go to the movies"       -->  "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S"
         "Why isn't my code working?"  -->  "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?"
    
     */
    // ~~~~~~~~~~ My Answer ~~~~~~~~~~~ :) 
    //     E-MohammadHasan
    public class Solution {

        public static String vaporcode(String s) {

            // converting all the letters into uppercase & removing spaces in all the sentence:) 
            String theSentence = s.replace(" ", "").toUpperCase();

            StringBuilder result = new StringBuilder();
            //  String twoSpaces = "  ";

            for (int i = 0; i < theSentence.length(); i++) {
                //System.out.print(theSentence.charAt(i) + twoSpaces);
                result.append(theSentence.charAt(i));
                if (i < theSentence.length() - 1) {
                    result.append("  ");  // Add two spaces between characters, but not after the last character

                }
            }
            return result.toString();
        }
    }

// ~~~~~~~~~~~ The professional answer 1 ~~~~~~~~~~ :) 
    /*
        static String vaporcode(String s) {
         return s.replace(" ", "").replace("","  ").toUpperCase().trim();
     }

     */
    
// ~~~~~~~~~~~ The professional answer 2 ~~~~~~~~~~ :)  
    /*
    // ! Using JavaScript :> ~~~ 
    
    function vaporcode(string) { 
    const str1 =  string.split(" ").join("").split("").join("  ").toUpperCase()
    return str1
}
    */ 
}

