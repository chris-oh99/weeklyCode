import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String args[]) {

        //List of Examples Provided for week of 1/24/2022
        List<String> nums = Arrays.asList("121317", "1234", "45135", "89abc1", "900876", " 4983");
        for (String number: nums) {
            RegexMatch.validate(number);
        }
    }
}
