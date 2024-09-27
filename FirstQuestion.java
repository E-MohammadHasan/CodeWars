package codewars.TheBeginning;

public class FirstQuestion {

    public static void main(String[] args) {
        System.out.println(bonusTime(100, true));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!

        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }
}
