public class RegexMatch {
    public static boolean match(String input) {
        return input.matches("^(\\d{4}|\\d{6})$");
    }
    public static void validate(String validate) {
        System.out.println(validate + " is " + match(validate));
    }
}
